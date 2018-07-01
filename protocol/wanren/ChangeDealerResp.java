package com.dg.game.infrastructure.protocol.wanren;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class ChangeDealerResp extends AbstactPacketResp {

	int uid;
	String nick;
	long coin;
	byte vipType;
	byte vipLevel;
	byte sex;
	String icon;
	String otherInfo;

	public ChangeDealerResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
 
		writeInt(uid);
		writeString(nick);
		writeLong(coin);
		writeByte(vipType);
		writeByte(vipLevel);
		writeByte(sex);
		writeString(icon);
		writeString(otherInfo);

		super.write(in);
	}

}