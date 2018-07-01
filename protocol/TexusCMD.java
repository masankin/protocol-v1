package com.dg.game.infrastructure.protocol;

public class TexusCMD {
	private TexusCMD() {
	}

	public class REQ {

		public final static int LOGIN = 0x01;
		public final static int EXIT_RQ = 0x02;
		public final static int CHANGE_TAB = 0x03;
		public final static int UPDATA_INFO = 0x04;
		public final static int HEARTBEAT = 0x05;
		public final static int SIT_DOWN = 0x06;
		public final static int STAND_UP = 0x07;
		public final static int SEE_CARD = 0x08;
		public final static int FOLLOW_CHIP = 0x09;
		public final static int ADD_CHIP = 0x0a;
		public final static int ABANDON_CARD = 0x0b;
		public final static int ALL_IN = 0x0c;
		public final static int CHAT_WORD = 0x0d;
		public final static int CHAT_FACE = 0x0e;
		public final static int CHAT_COMMON = 0x0f;
		public final static int GIVE_GIFT = 0x10;
		public final static int LET_GO = 0x11;
		public final static int NET_RES = 0x12;
		public final static int ASK_FRI = 0x13;
		public final static int RES_FRI = 0x14;
		public final static int AUTO_BUY = 0x15;
		public final static int BUY_CHIP = 0x18;
		public final static int SHOW_CARD = 0x19;
		public final static int SER_FEE = 0x1a;

	}

	public class RCV {
		public final static int ALL_LOSE = 0x40;
		public final static int LOGIN_SUCC = 0x41;
		public final static int LOGOUT_SUCC = 0x42;
		public final static int LOGIN_CONFLICT = 0x43; // 异地登录
		public final static int UPDATE_USERINFO = 0x44;
		public final static int HEARTBEAT = 0x45;
		public final static int USER_ENTER = 0x46;
		public final static int USER_LEFT = 0x47;
		public final static int USER_SIT = 0x48;
		public final static int USER_STAND = 0x49;
		public final static int GAME_START = 0x4a;
		public final static int TURN_CARD = 0x4b;
		public final static int OVER_CARD = 0x4c;
		public final static int RIVER_CARD = 0x4d;
		public final static int SEE_CARD = 0x4e;
		public final static int FOLLOW_CHIP = 0x4f;
		public final static int ADD_CHIP = 0x50;
		public final static int ABANDON_CARD = 0x51;
		public final static int ALL_IN = 0x52;
		public final static int ONE_ROUND_OVER = 0x53;
		public final static int GAME_OVER = 0x54;
		public final static int CHAT_STR = 0x55;
		public final static int FACE_ID = 0x56;
		public final static int COMMON_ID = 0x57;
		public final static int SENDGIFT = 0x58;
		public final static int KICK_PEOPLE = 0x59;
		public final static int SYS_INFOS = 0x5a;
		public final static int NET_PRO = 0x5b;
		public final static int ASK_FRIEND = 0x5c;
		public final static int RESQ_FRIEND = 0x5d;
		public final static int FORCE_STANDUP = 0x5f;
		public final static int SHOW_CARD = 0x60;
		public final static int GIVE_FEE = 0x62;
		public final static int FIRST_BEGIN = 0x63;
		public final static int EXP_ADD = 0x64;

	}
}
