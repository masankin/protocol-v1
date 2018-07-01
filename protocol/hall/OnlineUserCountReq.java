package com.dg.game.infrastructure.protocol.hall;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class OnlineUserCountReq extends AbstactPacketReq {

	private int uid;
	private String token;
	private String param3;
	private byte param4;

	public OnlineUserCountReq(ByteBuf in) {
		super(in);
	}

	@Override
	public void read() {
		uid = readInt();
		token = readString();
		param3 = readString();
		param4 = readByte();
	}

	@Override
	public String toString() {
		return "OnlineUserCountReq [uid=" + uid + ", token=" + token + ", param3=" + param3 + ", param4=" + param4
				+ "]";
	}

}
