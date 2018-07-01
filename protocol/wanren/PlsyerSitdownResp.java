package com.dg.game.infrastructure.protocol.wanren;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class PlsyerSitdownResp extends AbstactPacketResp {

	private byte seatId;
	private int uid;
	private String nick;
	private long coin;
	private byte vipType;
	private byte vipLevel;
	private byte sex;
	private String icon;
	private String otherInfo;

	public PlsyerSitdownResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(seatId);
		writeInt(uid);
		writeString(nick);
		writeLong(coin);
		writeByte(vipType);
		writeByte(vipLevel);
		writeByte(sex);
		writeString(icon);
		writeString(otherInfo);

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
