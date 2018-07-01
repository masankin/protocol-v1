package com.dg.game.infrastructure.protocol.platform;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class HeartbeatResponsePacket extends AbstactPacketReq {
	private int relogin;
//	private String data;

	public HeartbeatResponsePacket(ByteBuf in) {
		super(in);
	}

	public HeartbeatResponsePacket(int cmd) {
		super(cmd);
	}

	/**  解析 */
	@Override
	public void read() {
		relogin = readInt();
//		data = readString();
	}

	/**  写入 */
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeInt(relogin);
//		writeString(data);
		super.write(in);
	}

	public int getRelogin() {
		return relogin;
	}

	public void setRelogin(int relogin) {
		this.relogin = relogin;
	}
 

}
