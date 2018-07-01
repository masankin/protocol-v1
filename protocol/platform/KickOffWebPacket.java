package com.dg.game.infrastructure.protocol.platform;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class KickOffWebPacket extends AbstactPacketReq {
	private Long server_id;
	private String platform;
	private String client_platform;
	private String username;
	private String msg;
	private String server_ip;
 
	public KickOffWebPacket(ByteBuf in) {
		super(in);
	}

	public KickOffWebPacket(int cmd) {
		super(cmd);
	}

	/** 解析 */
	@Override
	public void read() {
		server_id = readLong();
		platform = readString();
		client_platform = readString();
		username = readString();
		msg = readString();
		server_ip = readString();
	}
	
	/** 写入 */
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeLong(server_id);
		writeString(platform);
		writeString(client_platform);
		writeString(username);
		writeString(msg);
		writeString(server_ip);
		super.write(in);
	}
	
	 
 
	 
	public String getServer_ip() {
		return server_ip;
	}

	public void setServer_ip(String server_ip) {
		this.server_ip = server_ip;
	}

	public Long getServer_id() {
		return server_id;
	}

	public void setServer_id(Long server_id) {
		this.server_id = server_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getClient_platform() {
		return client_platform;
	}

	public void setClient_platform(String client_platform) {
		this.client_platform = client_platform;
	}

}
