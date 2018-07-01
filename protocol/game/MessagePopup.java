package com.dg.game.infrastructure.protocol.game;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class MessagePopup extends AbstactPacketResp {

	private byte msgType;
	private String msg;

	public MessagePopup(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeByte(msgType);
		writeString(msg);
		super.write(in);
	}

	public byte getMsgType() {
		return msgType;
	}

	public void setMsgType(byte msgType) {
		this.msgType = msgType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}