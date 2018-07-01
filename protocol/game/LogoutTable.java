package com.dg.game.infrastructure.protocol.game;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class LogoutTable extends AbstactPacketResp {

	long userCurrentCoins;

	public LogoutTable(int cmd, long userCurrentCoins) {
		super(cmd);
		this.userCurrentCoins = userCurrentCoins;
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeLong(userCurrentCoins);
		super.write(in);
	}

}