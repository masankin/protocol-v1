package com.dg.game.infrastructure.protocol.platform;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class ServerLoginPacket extends AbstactPacketReq {
	private String g_token; 
	private Long server_id;
	private String server_platform;
 	private String data;

	public ServerLoginPacket(ByteBuf in) {
		super(in);
	}
	
	public ServerLoginPacket(int cmd) {
		super(cmd);
	}



	/** 解析 */
	@Override
	public void read() {
		g_token = readString();
		server_id = readLong();
		server_platform = readString();
		data = readString();
	}
	
	/** 写入 */
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeString(g_token);
		writeLong(server_id);
		writeString(server_platform);
		writeString(data);
		super.write(in);
	}

	public String getG_token() {
		return g_token;
	}

	public void setG_token(String g_token) {
		this.g_token = g_token;
	}

 

	public Long getServer_id() {
		return server_id;
	}

	public void setServer_id(Long server_id) {
		this.server_id = server_id;
	}

	public String getServer_platform() {
		return server_platform;
	}

	public void setServer_platform(String server_platform) {
		this.server_platform = server_platform;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

 
	 

}
