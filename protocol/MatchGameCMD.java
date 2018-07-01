package com.dg.game.infrastructure.protocol;

public class MatchGameCMD {
	private MatchGameCMD() {
	}

	public class REQ {

		public final static int TABLE_LOGIN = 0x01;
		public final static int TABLE_DISCONNECT = 0x02;
		public final static int PLAY_CARD = 0x05;
		public final static int PASS = 0x06;
		public final static int USER_CALL_LORD = 0x07;
		public final static int NO_CALL_LORD = 0x08;
		public final static int USER_GRAB_LORD = 0x09;
		public final static int NO_DROP_LORD = 0x0a;
		public final static int ACCEPT_DOUBLE = 0x0b;
		public final static int NO_DOUBLE = 0x0c;
		public final static int HEARTBEAT = 0x21;
		public final static int UPDATE_AUTOPLAY = 0x23;
		public final static int XIAZHU_RES = 0x2b;

	}

	public class RCV {
		public final static int DIF_LOGIN = 0x30;
		public final static int HEARTBEAT = 0x31;
		public final static int FORCE_KICK = 0x32;
		public final static int PLAYER_AUTOPLAY = 0x33;
		public final static int MESSAGE_POPUP = 0x34;
		public final static int NET_TROUBLE = 0x35;
		public final static int SERVER_FAIL = 0x36;
		public final static int TABLE_LOGIN_SUCESS = 0x37;
		public final static int TABLE_LOGOUT_SUCESS = 0x38;
		public final static int NEW_ROUND = 0x39;
		public final static int LOGIN_TABLE_SUCC = 0x3a;
		public final static int PLAYER_DISCONNECTED = 0x3b;
		public final static int PLAYER_CONNECTED = 0x3c;
		public final static int DEAL_CARDS = 0x3d;
		public final static int WHO_DECIDE_TO_CALL_LORD = 0x3e;
		public final static int NO_CALL_LORD_RES = 0x40;
		public final static int WHO_DECIDE_TO_GRAB_LORD = 0x41;
		public final static int NO_DROP_LORD_RES = 0x42;
		public final static int WHO_DOUBLED = 0x43;
		public final static int PLAY_NO_DOUBLE_RES = 0x44;
		public final static int PLAYER_PLAY_CARD = 0x45;
		public final static int PLAYER_PASS = 0x46;
		public final static int ROUND_OVER = 0x47;
		public final static int WAITING_OTHERS = 0x48;
		public final static int ONE_ROUND_OVER = 0x49;
		public final static int MATCH_OVER = 0x4a;
		public final static int LORD_SATTLED_WHOS_DOUBLE = 0x4b;
		public final static int MATCH_FAIL = 0x4c;
		public final static int MATCH_RANK = 0x4d;

	}
}
