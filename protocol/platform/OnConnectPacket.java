package com.dg.game.infrastructure.protocol.platform;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class OnConnectPacket extends AbstactPacketReq {
	private String data;

	public OnConnectPacket(ByteBuf in) {
		super(in);
	}

	public OnConnectPacket(int cmd) {
		super(cmd);
	}

	/** 解析 */
	@Override
	public void read() {
		data = readString();
	}
	
	/** 写入 */
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeString(data);
		super.write(in);
	}
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
