package com.dg.game.infrastructure.protocol.platform;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class HeartbeatPacket extends AbstactPacketReq {
	private String g_token;
	private String data;

	public HeartbeatPacket(ByteBuf in) {
		super(in);
	}

	public HeartbeatPacket(int cmd) {
		super(cmd);
	}

	/** 解析 */
	@Override
	public void read() {
		g_token = readString();
		data = readString();
	}
	
	/** 写入 */
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeString(g_token);
		writeString(data);
		super.write(in);
	}
	
	
	public String getG_token() {
		return g_token;
	}

	public void setG_token(String g_token) {
		this.g_token = g_token;
	}
 
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
