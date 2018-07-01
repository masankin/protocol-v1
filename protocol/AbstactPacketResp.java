package com.dg.game.infrastructure.protocol;

import com.dg.game.common.handler.packet.GamePacket;

public abstract class AbstactPacketResp extends GamePacket {
	
	public AbstactPacketResp() {
		super();
	}
	
	public AbstactPacketResp(int cmd) {
		super(cmd);
	}

}
