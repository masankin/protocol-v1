package com.dg.game.infrastructure.protocol.hall;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class TableLoginResp extends AbstactPacketResp {
//
//	{dataType = DataPacker.STRING 	,dataName='Ports'},
//	{dataType = DataPacker.INT 	,dataName='onlinePlayers'},
//	{dataType = DataPacker.INT 	,dataName='lastGameUID'},
	private String ports;
	private int onlinePlayers;
	private int lastGameUID;

	public TableLoginResp(int cmd, String ports,int onlinePlayers,int lastGameUID) {
		super(cmd);
		this.ports = ports;
		this.onlinePlayers = onlinePlayers;
		this.lastGameUID = lastGameUID;
	}


	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded; 
		writeString(ports);
		writeInt(onlinePlayers);
		writeInt(lastGameUID);
		
		super.write(in);
	}

}
