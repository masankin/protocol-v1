package com.dg.game.infrastructure.protocol.wanren;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//POOL_INFO
public class DoubleInfoResp extends AbstactPacketResp {

	byte seatId;
	byte multi;
	byte cardType;
	byte valueCount;
	byte[] cardValue;

	public DoubleInfoResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeByte(seatId);
		writeByte(multi);
		writeByte(cardType);
		writeByte(valueCount);
		if (valueCount > 0) {
			for (int i = 0; i < cardValue.length; i++) {
				writeByte(cardValue[i]);
			}
		}

		super.write(in);
	}

	public static class ChipInfo {

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
