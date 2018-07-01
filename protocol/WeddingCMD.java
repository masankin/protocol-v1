package com.dg.game.infrastructure.protocol;

public class WeddingCMD {
	private WeddingCMD() {
	}

	public class REQ {

		public final static int HEARTBEAT = 0x06;
		public final static int LOGIN = 0x01;
		public final static int LOGOUT = 0x02;
		public final static int UPDATE_USER_INFO = 0x03;
		public final static int CHATSTRING = 0x0e;
		public final static int CHATEMOJI = 0x0f;
		public final static int CHATSTRINGID = 0x10;
		public final static int SENDGIFT = 0x11;
		public final static int KIKPLAYER = 0x12;
		public final static int SENDREDPOCKET = 0x13;
		public final static int SENDCOIN = 0x14;
		public final static int SENDBALLOON = 0x15;
		public final static int SENDFLOWERS = 0x16;
		public final static int INVITE_OTHER = 0x17;
		public final static int PROPOSAL = 0x18;
		public final static int PROPOSAL_ACCEPT = 0x19;
		public final static int PROPOSAL_DENY = 0x1a;

	}

	public class RCV {
		public final static int HEARTBEAT = 0x46;
		public final static int LOGIN_SUCC = 0x41;
		public final static int LOGOUT_SUCC = 0x42;
		public final static int LOGIN_CONFLICT = 0x43;
		public final static int UPDATE_USERINFO = 0x45;
		public final static int USER_ENTER = 0x47;
		public final static int USER_LEFT = 0x48;
		public final static int CHAT = 0x53;
		public final static int EMOJI = 0x54;
		public final static int CHATSTRID = 0x55;
		public final static int SENDGIFT = 0x56;
		public final static int SENDREDPOCKET = 0x58;
		public final static int SENDMONEY = 0x59;
		public final static int SENDBALLOON = 0x5A;
		public final static int SENDFLOWERS = 0x5B;
		public final static int SINVITE_SUCC = 0x5F;
		public final static int BE_PROPOSALED = 0x60;
		public final static int BE_PROPOSALED_ACCEPT = 0x61;
		public final static int BE_PROPOSALED_DENY = 0x62;
		public final static int BE_PROPOSALED_FAIL = 0x63;
		public final static int KIK_PLAYER = 0x57;
		public final static int ERROR = 0x40;
		public final static int SYS_INFO = 0x5E;

	}
}
