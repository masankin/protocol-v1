package com.dg.game.infrastructure.protocol;

public class PlatformCMD {
	private PlatformCMD() {
	}

	public class REQ {
		public final static int SERVER_LOGIN = 0x01;
		public final static int HEARTBEAT = 0x02;
		public final static int KICK_OFF_WEB = 0x03;
		public final static int ON_CONNECT = 0x10;
	}

	public class RCV {
		public final static int SERVER_LOGIN_SUCESS = 0x30;
		public final static int HEARTBEAT = 0x31;
		public final static int KICK_OFF_WEB = 0x32;
		public final static int ON_CONNECT = 0x40;
	}

}
