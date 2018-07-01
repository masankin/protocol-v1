package com.dg.game.infrastructure.protocol;

public class DouniuCMD {
	private DouniuCMD() {
	}

	public class REQ {

		public final static int TABLE_LOGIN = 0x01;
		public final static int GRAB_DEALER = 0x02; // 请求上庄
		public final static int DROP_DEALER = 0x03; // 请求下庄
		public final static int BET = 0x04; // 下注
		public final static int ASK_LEAVE = 0x05; // 离开房间
		public final static int HEARTBEAT = 0x10;
		public final static int UPDATA_INFO = 0x06; // 更新信息
		public final static int ASK_SIT = 0x07; // 坐下
		public final static int ASK_STAND = 0x08; // 请求站起
		public final static int CHAT = 0x0E;
		public final static int EMOJI = 0x0F;
		public final static int CONST_TEXT = 0x11;
	}

	public class RCV {
		public final static int HEARTBEAT = 0x40;
		public final static int LOGIN_SUCC = 0x31;
		public final static int GRAB_SUCC = 0x32; // 申请上庄成功
		public final static int DROP_SUCC = 0x33; // 申请下庄成功
		public final static int SEND_FIRST = 0x34; // 发第一张
		public final static int BET_SUCC = 0x35; // 下注
		public final static int POOL_INFO = 0x36; // 每个下注池的下注额
		public final static int FORBID_BET = 0x3A; // 等待结果 ;禁止下注
		public final static int PLAYER_COUNT = 0x3B; // 个人结算
		public final static int CHANGE_DEALER = 0x3C; // 换庄

		public final static int LOGOUT_SUCC = 0x42; // 登出成功
		public final static int UPDATE_PLAYER = 0x45; // 更新信息
		public final static int MSG_TIPS = 0x4A; // 消息提示
		public final static int FINAL_RESULT = 0x4B; // 最后结果
		public final static int PLSYER_SITDOWN = 0x4C; // 玩家坐下
		public final static int PLSYER_STANDUP = 0x4D; // 玩家站起
		public final static int DEALER_LIST = 0x4E; // 庄家列表
		public final static int SOMEONE_BET = 0x4F; // 有人下注
		public final static int SOMEONE_IN = 0x50; // 有人进入
		public final static int SOMEONE_OUT = 0x51; // 有人离开

		public final static int CHAT = 0x53;
		public final static int EMOJI = 0x54;
		public final static int CONST_TEXT = 0x55;
	}
}
