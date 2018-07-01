package com.dg.game.infrastructure.protocol.client;

public class GameTableConstant {
	

	public final static int PLAYER_ROLE_LORD = 0x01; // 地主
	public final static int PLAYER_ROLE_FARMER = 0x02;// 农民
	public final static int SEX_MALE = 0x01;// 男
	public final static int SEX_FEMALE = 0x02;// 女
	public final static int PLAYER_ACTION_TIMEOUT = 20;

	public final static int ROOM_STATE_IDLE = 0;// 房间等待
	public final static int ROOM_STATE_WANT_LORD = 1;// 等待要地主
	public final static int ROOM_STATE_DOUBLE = 2;// 等待加倍
	public final static int ROOM_STATE_PLAYING = 3;// 房间正在游戏(出牌)
	public final static int ROOM_STATE_CALL_LORD = 4;// 等待叫地主
	public final static int ROOM_STATE_GRAB_LORD = 5;// 等待抢地主
}
