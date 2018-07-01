package com.dg.game.infrastructure.protocol.matchgame;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

//PLAYER_AUTOPLAY
public class PlayAutoPlayResp extends AbstactPacketResp {

	private byte seatId;
	private byte state; // --1托管 2取消托管

	public PlayAutoPlayResp(int cmd, byte seatId, byte state) {
		super(cmd);
		this.seatId = seatId;
		this.state = state;
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(seatId);
		writeByte(state);

		super.write(in);
	}

}
