package com.dg.game.infrastructure.protocol.wanren;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class DealerListResp extends AbstactPacketResp {

	short dealerNumCount;
	List<Dealer> dealerList;

	public DealerListResp(int cmd) {
		super(cmd);
	}

	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeShort(dealerNumCount);
		if (dealerList != null) {
			for (int i = 0; i < dealerList.size(); i++) {
				Dealer d = dealerList.get(i);
				// d.write(in,false);  不调用super.write(in)
				writeShort(d.dealerId);
				writeInt(d.uid);
				writeString(d.nick);
				writeLong(d.coin);
				writeByte(d.vipType);
				writeByte(d.vipLevel);
				writeByte(d.sex);
				writeString(d.icon);
				writeString(d.otherInfo);

			}
		}

		super.write(in);
	}

}