package com.dg.game.infrastructure.protocol.game;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class PlayerDisconnected extends AbstactPacketResp {

	byte seatID;

	public PlayerDisconnected(int cmd, byte seatID) {
		super(cmd);
		this.seatID = seatID;
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(seatID); 
		super.write(in);
	}

}