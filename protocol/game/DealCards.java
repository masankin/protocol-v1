package com.dg.game.infrastructure.protocol.game;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class DealCards  extends AbstactPacketResp {
	private byte first;
	private List<Integer> cards; 

//	
//	ret.first = byteArray:readByte()
//			ret.len = byteArray:readByte()
//			ret.cards = {}
//			for i=1,ret.len  do
//				table.insert(ret.cards,byteArray:readByte())
//			end

	public DealCards(int cmd) {
		super(cmd);
	}
 
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeByte(first);
		int len  = cards.size();
		writeByte((byte)len);
		if (len > 0) {
			for (int i = 0; i < cards.size(); i++) {
				writeByte((byte)((int)cards.get(i)));
			}
		}

		super.write(in);
	}

	public byte getFirst() {
		return first;
	}

	public void setFirst(byte first) {
		this.first = first;
	}

	public List<Integer> getCards() {
		return cards;
	}

	public void setCards(List<Integer> cards) {
		this.cards = cards;
	}

	 

}