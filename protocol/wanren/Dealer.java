package com.dg.game.infrastructure.protocol.wanren;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class Dealer extends AbstactPacketResp {

	short dealerId;
	int uid;
	String nick;
	long coin;
	byte vipType;
	byte vipLevel;
	byte sex;
	String icon;
	String otherInfo;

	//当该类仅仅作为其他类的数据成员时，不使用CMD的构造方法
	public Dealer() {
	}
	
	public Dealer(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeShort(dealerId);
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