package com.dg.game.infrastructure.protocol;

public class HallCMD {
	private HallCMD() {
	}
	public class REQ {
		public final static int HALL_LOGIN = 0x01;
		public final static int HALL_LOGOUT = 0x02;
		public final static int HALL_GET_ONLINE_PLAYERS_COUNT = 0x06;
		public final static int HALL_SEND_SPEAKER = 0x23;
		public final static int HALL_SEND_MSG_FRIEND = 0x11;
		public final static int HALL_SEND_MSG_SERVICE = 0x12;
		public final static int HALL_INVITE_FRIEND = 0x13;
		public final static int HALL_HEARTBEAT = 0x21;
		public final static int HALL_QUERY_NEWBIE = 0x15;
	}

	public class RCV {
		public final static int HALLR_LOGIN_SUCC = 0x30;
		public final static int HALLR_GET_ONLINE_PLAYERS_COUNT = 0x36;
		public final static int HALLR_SYS_NEWBOARDCAST = 0x53;
		public final static int HALLR_SYS_OLDBOARDCAST = 0x37;
		public final static int HALLR_FRIEND_MSG = 0x41;
		public final static int HALLR_SYS_INFO = 0x42;
		public final static int HALLR_INVITE_FRIEND = 0x43;
		public final static int HALLR_SERVICE_MSG = 0x44;
		public final static int HALLR_SYNC_INFO = 0x4A;
		public final static int HALLR_OFFLINE_MSG = 0x4C;
		public final static int HALLR_HEARTBEAT = 0x51;
		public final static int HALLR_FORCE_OFFLINE = 0x52;
		public final static int HALLR_MISSION_ONCHANGE = 0x38;
		public final static int HALLR_NEW_MAIL = 0x56; 
	}
}
