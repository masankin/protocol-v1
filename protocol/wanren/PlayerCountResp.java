package com.dg.game.infrastructure.protocol.wanren;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;
import com.dg.game.infrastructure.protocol.wanren.PlayerCountResp.Player.Info;

import io.netty.buffer.ByteBuf;

//PLAYER_COUNT
public class PlayerCountResp extends AbstactPacketResp {

	private byte count;
	private List<ChipInfoResp> chipInfo;
	private long playerCoin;
	private long dealerCoin; //庄家金币数
	private short playersCount;
	private List<Player> players; // 有座位的玩家输赢信息

	public PlayerCountResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(count);
		if (chipInfo != null) {
			for (int i = 0; i < chipInfo.size(); i++) {
				writeByte(chipInfo.get(i).seatId);
				writeLong(chipInfo.get(i).chip);
			}
		}
		writeLong(playerCoin);
		writeLong(dealerCoin);
		writeShort(playersCount);

		if (players != null) {
			for (int i = 0; i < players.size(); i++) {
				writeInt(players.get(i).uid);
				writeByte(players.get(i).length);

				List<Info> info = players.get(i).info;
				if (info != null) {
					for (int j = 0; j < info.size(); j++) {
						writeByte(info.get(i).siteId);
						writeLong(info.get(i).result);
					}
				}
			}
		}
		super.write(in);
	}
 
	public static class Player {
		int uid;
		byte length;
		List<Info> info;

		public static class Info {
			byte siteId;
			long result;
		}
	}

}
