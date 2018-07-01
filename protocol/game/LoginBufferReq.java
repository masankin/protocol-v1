package com.dg.game.infrastructure.protocol.game;

import com.dg.game.infrastructure.protocol.AbstactPacketReq;

import io.netty.buffer.ByteBuf;

public class LoginBufferReq extends AbstactPacketReq {
	private int g_uid;
	private String g_token;
	private int tableType;
	private int roomId;
	private int friendID;
	private int roomLevel;// 跑得快没有 roomLevel
	


	public LoginBufferReq(ByteBuf in) {
		super(in);
	}

	@Override
	public void read() {
		g_uid = readInt();
		g_token = readString();
		tableType = readInt();
		roomId = readInt();
		friendID = readInt();
		roomLevel = readInt();
	}

	@Override
	public String toString() {
		return "LoginBufferReq [g_uid=" + g_uid + ", g_token=" + g_token + ", tableType=" + tableType + ", roomId="
				+ roomId + ", friendID=" + friendID + ", roomLevel=" + roomLevel + "]";
	}

	public int getG_uid() {
		return g_uid;
	}

	public void setG_uid(int g_uid) {
		this.g_uid = g_uid;
	}

	public String getG_token() {
		return g_token;
	}

	public void setG_token(String g_token) {
		this.g_token = g_token;
	}

	public int getTableType() {
		return tableType;
	}

	public void setTableType(int tableType) {
		this.tableType = tableType;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getFriendID() {
		return friendID;
	}

	public void setFriendID(int friendID) {
		this.friendID = friendID;
	}

	public int getRoomLevel() {
		return roomLevel;
	}

	public void setRoomLevel(int roomLevel) {
		this.roomLevel = roomLevel;
	}

	 

}
