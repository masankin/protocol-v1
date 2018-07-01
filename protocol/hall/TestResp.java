package com.dg.game.infrastructure.protocol.hall;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class TestResp extends AbstactPacketResp {

	private String msg;

	public TestResp(int cmd, String msg) {
		super(cmd);
		this.msg = msg;
	}


	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded; 
		writeString(msg);
		super.write(in);
	}

}
