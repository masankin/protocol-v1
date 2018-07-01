package com.dg.game.infrastructure.protocol.game;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class PlayerReady extends AbstactPacketResp {

	private byte seatID;

	public PlayerReady(int cmd, byte seatID) {
		super(cmd);
		this.seatID = seatID;
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(seatID);
		super.write(in);
	}

	public byte getSeatID() {
		return seatID;
	}

	public void setSeatID(byte seatID) {
		this.seatID = seatID;
	}

}