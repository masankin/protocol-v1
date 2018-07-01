package com.dg.game.infrastructure.protocol;

public class MessageID {
	public static final int PLAYER_HEARTBEAT_VALUE = 110;// 心跳
	public static final int ERROR_CODE_VALUE = 10;// 错误
	public static final int PUSH_VALUE = 20;// 推送
	public static final int PLAYER_LOGIN_VALUE = 101;// 用户登录
	public static final int SETPASSWORD_VALUE = 1001;// 修改登录密码
	public static final int SETSPASSWORD_VALUE = 1002;// 修改安全密码
	public static final int SETWPASSWORD_VALUE = 1003;// 修改提现密码
	public static final int SETQUESTION_VALUE = 1004;// 修改安全问题
	public static final int SETDIFFERENT_VALUE = 1005;// 开关异地登录
	public static final int SETRESERVED_VALUE = 1006;// 修改预留信息
	public static final int SETPHONE_VALUE = 1007;// 修改手机号码
	public static final int SEND_SMS_CODE_VALUE = 1008;// 发送短信验证码
	public static final int CHECK_SMS_CODE_VALUE = 1009;// 验证短信验证码
	public static final int SEND_EMAIL_CODE_VALUE = 1010;// 发送邮箱验证码
	public static final int CHECK_EMAIL_CODE_VALUE = 1011;// 验证邮箱验证码
	public static final int SETEMAIL_VALUE = 1012;// 修改邮箱地址
	public static final int BASIC_INFO = 1013;// 获取用户基本资料
	public static final int BETTINGRECORD_VALUE = 201;// 投注记录

}
