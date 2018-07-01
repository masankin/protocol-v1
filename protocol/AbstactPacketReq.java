package com.dg.game.infrastructure.protocol;

import com.dg.game.common.handler.packet.GamePacket;

import io.netty.buffer.ByteBuf;

public abstract class AbstactPacketReq extends GamePacket{
	
	public AbstactPacketReq(ByteBuf in) {
		super(in);
		read();
	}
	
	public AbstactPacketReq(int cmd) {
		super(cmd);
	}
	
}
