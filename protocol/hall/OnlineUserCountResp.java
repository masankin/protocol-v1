package com.dg.game.infrastructure.protocol.hall;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class OnlineUserCountResp extends AbstactPacketResp {

	private int onlinePlayers;
	private String othersCount;

	public OnlineUserCountResp(int cmd, int onlinePlayers, String othersCount) {
		super(cmd);
		this.onlinePlayers = onlinePlayers;
		this.othersCount = othersCount;
	}


	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded; 
		writeInt(onlinePlayers);
		writeString(othersCount);
		
		super.write(in);
	}

}
