package com.dg.game.infrastructure.protocol.wanren;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//POOL_INFO
public class ChipInfoResp extends AbstactPacketResp {

	byte seatId;
	long chip;

	public ChipInfoResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		 
		writeByte(seatId);
		writeLong(chip);
 
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
