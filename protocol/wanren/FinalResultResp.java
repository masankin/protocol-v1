package com.dg.game.infrastructure.protocol.wanren;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//PLSYER_SITDOWN
public class FinalResultResp extends AbstactPacketResp {

	private byte count;
	private List<ChipInfoResp> doubleInfo;

	public FinalResultResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(count);
		if (doubleInfo != null) {
			for (int i = 0; i < doubleInfo.size(); i++) {
				writeByte(doubleInfo.get(i).seatId);
				writeLong(doubleInfo.get(i).chip);
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