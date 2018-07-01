package com.dg.game.infrastructure.protocol;

public class SanzhangCMD {
	private SanzhangCMD() {
	}

	public class REQ {

		public final static int TABLE_LOGIN = 0x01;
		public final static int TABLE_DISCONNECT = 0x02;
		public final static int CHANGE_TABLE = 0x04;
		public final static int UPDATE_PLAYER = 0x05;
		public final static int HEARTBEAT = 0x06;

		public final static int READY = 0x07;
		public final static int PEEK_CARDS = 0x08;
		public final static int FOLLOW_BET = 0x09;
		public final static int ADD_BET = 0x0A;
		public final static int DROP_CARDS = 0x0B;
		public final static int COMPARE_CARDS = 0x0C;
		public final static int ALLIN = 0x0D;

		public final static int CHAT = 0x0E;
		public final static int EMOJI = 0x0F;
		public final static int CONST_TEXT = 0x10;
		public final static int SENDGIFT = 0x11;

		public final static int KIKPLAYER = 0x12;
		public final static int FORBID = 0x13;
		public final static int MULTIPLY_FIVE = 0x14;
		public final static int MULTIPLY_TEN = 0x15;
		public final static int CHANGE_CARD = 0x16;

		public final static int NETWORK_ACK = 0x18;
		public final static int FRIEND_REQUEST = 0x19;
		public final static int FRIEND_REQUEST_RESULT = 0x1A;
		public final static int BET_TIMEOUT_ACTION = 0x1B;

	}

	public class RCV {
		public final static int HEARTBEAT = 0x46;
		public final static int RSPD_FAIL = 0x40;
		public final static int LOGIN_SUCC = 0x41;
		public final static int LOGOUT_SUCC = 0x42;
		public final static int LOGIN_CONFLICT = 0x43;
		public final static int UPDATE_PLAYER = 0x45;
		public final static int PLAYER_CONNECTED = 0x47;
		public final static int PLAYER_DISCONNECTED = 0x48;

		public final static int GAME_READY = 0x49;
		public final static int GAME_START = 0x4A;
		public final static int PLAYER_READY = 0x4B;
		public final static int PLAYER_PEEK = 0x4C;
		public final static int PLAYER_FOLLOW = 0x4D;
		public final static int PLAYER_ADD_BET = 0x4E;

		public final static int FOUTH_CARD = 0x3F;
		public final static int LAST_CARD = 0x3E;

		public final static int PLAYER_DROP_CARDS = 0x4F;
		public final static int PLAYER_COMPARE = 0x50;
		public final static int PLAYER_ALLIN = 0x51;
		public final static int GAME_ROUND_OVER = 0x52;

		public final static int CHAT = 0x53;
		public final static int EMOJI = 0x54;
		public final static int CONST_TEXT = 0x55;
		public final static int SENDGIFT = 0x56;

		public final static int KIKPLAYER = 0x57;
		public final static int FORBID = 0x58;
		public final static int MULTIPLY_FIVE = 0x59;
		public final static int MULTIPLY_TEN = 0x5A;
		public final static int CHANGE_CARD = 0x5B;
		public final static int CHANGE_CARD_APPLY = 0x5C;
		public final static int ITEM_EXPIRED = 0x5D;
		public final static int SYS_INFO = 0x5E;
		public final static int MATCH_NEW_ROUND = 0x60;
		public final static int MATCH_OVER = 0x61;
		public final static int NETWORK_BAD_TRAFFIC = 0x62;
		public final static int FRIEND_REQUEST = 0x63;
		public final static int FRIEND_REQUEST_RESULT = 0x64;
		public final static int TIMEOUT_ACTION_SUCC = 0x65;

	}
}
