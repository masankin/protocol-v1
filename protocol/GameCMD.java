package com.dg.game.infrastructure.protocol;

public class GameCMD {
	private GameCMD() {
	}

	public class REQ {
		public final static int TABLE_LOGIN = 0x01;
		public final static int TABLE_DISCONNECT = 0x02;
		public final static int CHANGE_TABLE = 0x03;
		public final static int USER_READY = 0x04;
		public final static int PLAY_CARD = 0x05;
		public final static int PASS = 0x06;
		public final static int SIGNUP_CAMPAIN = 0x2B;
		public final static int UNDO_SIGNUP_CAMPAIN = 0x2C;
		public final static int WANT_TO_BELORD = 0x10;
		public final static int ACCEPT_DOUBLE = 0x11;
		public final static int UPDATE_PLAYER = 0x13;
		public final static int USER_CALL_LORD = 0x16;
		public final static int USER_GRAB_LORD = 0x17;
		public final static int HEARTBEAT = 0x21;
		public final static int UPDATE_AUTOPLAY = 0x23;
		public final static int CHAT = 0x24;
		public final static int CHAT_TEXT_CONSTANCE = 0x25;
		public final static int USER_KICK = 0x26;
		public final static int SEND_GIFT = 0x27;
		public final static int FRIEND_REQUEST = 0x28;
		public final static int ACCEPT_OR_DENY = 0x29;
		public final static int GET_TASK_BONUS = 0x2A;
	}

	public class RCV {
		public final static int TABLE_LOGIN_SUCESS = 0x30;
		public final static int TABLE_LOGOUT_SUCESS = 0x32;
		public final static int PLAYER_DISCONNECTED = 0x33;
		public final static int PLAYER_CONNECTED = 0x34;
		public final static int PLAYER_READY = 0x35;
		public final static int DEAL_CARDS = 0x36;
		public final static int PLAYER_PLAY_CARD = 0x37;
		public final static int PLAYER_PASS = 0x38;
		public final static int ROUND_OVER = 0x39;
		public final static int PLAY_CARD_ERROR = 0x3A;
		public final static int CAMP_SIGNUP_RESULT = 0x3B;
		public final static int CAMP_WITHDRAW_RESULT = 0x3C;
		public final static int CAMP_INFO = 0x3D;
		public final static int CAMP_RESULT = 0x3E;
		//
		public final static int WHO_DECIDE_TO_BE_LORD = 0x40;
		public final static int LORD_SATTLED_WHOS_DOUBLE = 0x41;
		public final static int WHO_DOUBLED = 0x42;
		public final static int UPDATE_PLAYER = 0x43;
		public final static int WHO_DECIDE_TO_CALL_LORD = 0x46;
		public final static int WHO_DECIDE_TO_GRAB_LORD = 0x47;
		public final static int CAMP_PLAYER_DATA = 0x50;
		public final static int HEARTBEAT = 0x51;
		public final static int FORCE_KICK = 0x52;
		public final static int PLAYER_AUTOPLAY = 0x53;
		public final static int PLAYER_CHAT_TEXT = 0x54;
		public final static int PLAYER_CHAT_TEXT_CONSTANCE = 0x55;
		public final static int PLAYER_KICK = 0x56;
		public final static int PLAYER_SENT_GIFT = 0x57;
		public final static int FRIEND_REQUEST = 0x58;
		public final static int FRIEND_REQUEST_RESULT = 0x59;
		public final static int CURRENT_TASKS = 0x5A;
		public final static int CURRENT_TASKS_ACCOMPLISHED = 0x5B;
		public final static int CURRENT_TASKS_BONUS_RESULT = 0x5C;
		public final static int MESSAGE_POPUP = 0x62;
		public final static int SERVER_FAIL = 0x63;
	}

}
