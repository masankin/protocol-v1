package com.dg.game.infrastructure.protocol.game;

import com.dg.game.infrastructure.protocol.AbstactPacketResp;

import io.netty.buffer.ByteBuf;

public class UserData extends AbstactPacketResp {

	private byte seatID;
	private int uid;
	private String nickName;
	private byte role;
	private int coins;// UInt coins;
	private byte sex;
	private byte vipLevel;
	private byte vipType;
	private byte status;
	private String iconUrl;
	private byte cardLen;
	private String ext;

	public UserData() {
		super();
	}

	public UserData(int cmd) {
		super(cmd);
	}
 
	@Override
	public void write(ByteBuf encoded) {
		this.in = encoded;
		writeByte(seatID);
		writeInt(uid);
		writeString(nickName);
		writeByte(role);
		writeInt(coins);
		writeByte(sex);
		writeByte(vipLevel);
		writeByte(vipType);
		writeByte(status);
		writeString(iconUrl);
		writeByte(cardLen);
		writeString(ext);
		super.write(in);
	}

	public byte getSeatID() {
		return seatID;
	}

	public void setSeatID(byte seatID) {
		this.seatID = seatID;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public byte getRole() {
		return role;
	}

	public void setRole(byte role) {
		this.role = role;
	}

	public long getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public byte getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(byte vipLevel) {
		this.vipLevel = vipLevel;
	}

	public byte getVipType() {
		return vipType;
	}

	public void setVipType(byte vipType) {
		this.vipType = vipType;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}


	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public byte getCardLen() {
		return cardLen;
	}

	public void setCardLen(byte cardLen) {
		this.cardLen = cardLen;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

}