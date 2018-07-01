package com.dg.game.infrastructure.protocol.matchgame;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//FORCE_KICK
public class ForceClickResp extends AbstactPacketResp {

	private byte msgType;
	private String msg;

	public ForceClickResp(int cmd, byte msgType, String msg) {
		super(cmd);
		this.msgType = msgType;
		this.msg = msg;
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(msgType);
		writeString(msg);

		super.write(in);
	}

}
