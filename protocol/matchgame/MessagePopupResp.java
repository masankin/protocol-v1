package com.dg.game.infrastructure.protocol.matchgame;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//MESSAGE_POPUP
public class MessagePopupResp extends AbstactPacketResp {
	private byte msgType;
	private String msg;

	public MessagePopupResp(int cmd, byte msgType, String msg) {
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
