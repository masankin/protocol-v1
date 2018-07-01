package com.dg.game.infrastructure.protocol.game;

import java.util.List;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;
import com.dg.game.infrastructure.protocol.client.ClientConfigTable;

import io.netty.buffer.ByteBuf;

public class LoginTable extends AbstactPacketResp {

	private int roomType;
	private int roomId;
	private int bpour;// 底分
	private byte waitTimeOut;
	private byte outTimeOut;
	private byte lordSeatID;
	private byte selfSeat;
	private byte roomState;
	private byte userNum;
	private List<UserData> userData;
	private byte autoPlayStatus;
	private short doubleAmount;
	private byte lordCardCount;
	private byte[] lordCards;
	private byte currentSeat;
	private byte userCardCount;
	private byte[] userCards;

	private byte lastPlayerSeatID;
	private byte lastPlayerCardType;
	private byte lastPlayerCardCount;
	private byte[] lastPlayerCards; 

	private String roomExtend;
	// roomExtend = {
	// "fzuobi" = 0(0x0)
	// "multi" = 2(0x2)
	// "roomLevel" = 0(0x0)
	// }

	public LoginTable(int cmd) {
		super(cmd);
	}
 
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;

		writeInt(roomType);
		writeInt(roomId);
		writeInt(bpour);
		writeByte(waitTimeOut);
		writeByte(outTimeOut);
		writeByte(lordSeatID);
		writeByte(selfSeat);
		writeByte(roomState);
		writeByte(userNum);
		if (userNum > 0) {
			for (int i = 0; i < userData.size(); i++) {
				userData.get(i).write(in); // 这样写，一旦该类变更成员变量，会导致多处引入的地方相应的变更，注意
			}
		}

		if (ClientConfigTable.ROOM_STATE_WAIT != roomState) {
			writeByte(autoPlayStatus);
			writeShort(doubleAmount);
			writeByte(lordCardCount);

			for (int i = 0; i < lordCardCount; i++) {
				writeByte(lordCards[i]);
			}

			writeByte(currentSeat);
			writeByte(userCardCount);

			for (int i = 0; i < userCardCount; i++) {
				writeByte(userCards[i]);
			}

			writeByte(lastPlayerSeatID);
			writeByte(lastPlayerCardType);
			writeByte(lastPlayerCardCount);

			for (int i = 0; i < lastPlayerCardCount; i++) {
				writeByte(lastPlayerCards[i]);
			}

		}
		writeString(roomExtend);

		super.write(in);
	}

	public int getRoomType() {
		return roomType;
	}

	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getBpour() {
		return bpour;
	}

	public void setBpour(int bpour) {
		this.bpour = bpour;
	}

	public byte getWaitTimeOut() {
		return waitTimeOut;
	}

	public void setWaitTimeOut(byte waitTimeOut) {
		this.waitTimeOut = waitTimeOut;
	}

	public byte getOutTimeOut() {
		return outTimeOut;
	}

	public void setOutTimeOut(byte outTimeOut) {
		this.outTimeOut = outTimeOut;
	}

	public byte getLordSeatID() {
		return lordSeatID;
	}

	public void setLordSeatID(byte lordSeatID) {
		this.lordSeatID = lordSeatID;
	}

	public byte getSelfSeat() {
		return selfSeat;
	}

	public void setSelfSeat(byte selfSeat) {
		this.selfSeat = selfSeat;
	}

	public byte getRoomState() {
		return roomState;
	}

	public void setRoomState(byte roomState) {
		this.roomState = roomState;
	}

	public byte getUserNum() {
		return userNum;
	}

	public void setUserNum(byte userNum) {
		this.userNum = userNum;
	}

	public List<UserData> getUserData() {
		return userData;
	}

	public void setUserData(List<UserData> userData) {
		this.userData = userData;
	}

	public byte getAutoPlayStatus() {
		return autoPlayStatus;
	}

	public void setAutoPlayStatus(byte autoPlayStatus) {
		this.autoPlayStatus = autoPlayStatus;
	}

	public short getDoubleAmount() {
		return doubleAmount;
	}

	public void setDoubleAmount(short doubleAmount) {
		this.doubleAmount = doubleAmount;
	}

	public byte getLordCardCount() {
		return lordCardCount;
	}

	public void setLordCardCount(byte lordCardCount) {
		this.lordCardCount = lordCardCount;
	}

	public byte[] getLordCards() {
		return lordCards;
	}

	public void setLordCards(byte[] lordCards) {
		this.lordCards = lordCards;
	}

	public byte getCurrentSeat() {
		return currentSeat;
	}

	public void setCurrentSeat(byte currentSeat) {
		this.currentSeat = currentSeat;
	}

	public byte getUserCardCount() {
		return userCardCount;
	}

	public void setUserCardCount(byte userCardCount) {
		this.userCardCount = userCardCount;
	}

	public byte[] getUserCards() {
		return userCards;
	}

	public void setUserCards(byte[] userCards) {
		this.userCards = userCards;
	}

	public byte getLastPlayerSeatID() {
		return lastPlayerSeatID;
	}

	public void setLastPlayerSeatID(byte lastPlayerSeatID) {
		this.lastPlayerSeatID = lastPlayerSeatID;
	}

	public byte getLastPlayerCardType() {
		return lastPlayerCardType;
	}

	public void setLastPlayerCardType(byte lastPlayerCardType) {
		this.lastPlayerCardType = lastPlayerCardType;
	}

	public byte getLastPlayerCardCount() {
		return lastPlayerCardCount;
	}

	public void setLastPlayerCardCount(byte lastPlayerCardCount) {
		this.lastPlayerCardCount = lastPlayerCardCount;
	}

	public byte[] getLastPlayerCards() {
		return lastPlayerCards;
	}

	public void setLastPlayerCards(byte[] lastPlayerCards) {
		this.lastPlayerCards = lastPlayerCards;
	}

	public String getRoomExtend() {
		return roomExtend;
	}

	public void setRoomExtend(String roomExtend) {
		this.roomExtend = roomExtend;
	}

}