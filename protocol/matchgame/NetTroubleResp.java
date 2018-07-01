package com.dg.game.infrastructure.protocol.matchgame;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//NET_TROUBLE
public class NetTroubleResp extends AbstactPacketResp {

	private byte seatId;
	private byte type; // --堵塞类型

	public NetTroubleResp(int cmd, byte seatId, byte type) {
		super(cmd);
		this.seatId = seatId;
		this.type = type;
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(seatId);
		writeByte(type);

		super.write(in);
	}

}
