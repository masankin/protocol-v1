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
 
}
