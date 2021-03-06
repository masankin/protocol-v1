package com.dg.game.infrastructure.protocol.client;

public class ClientConfigTable {
	public final static int ROOM_STATE_WAIT = 0;// 房间等待
	public final static int ROOM_STATE_CALL_LORD = 1;// 房间正在要地主
	public final static int ROOM_STATE_CALL_MUL = 2;// 房间加倍
	public final static int ROOM_STATE_PLAY = 3;// 房间正在出牌
	public final static int ROOM_STATE_GRAB_CALL = 4;// 等待叫地主
	public final static int ROOM_STATE_GRAB_GRAB = 5;// 等待抢地主
	public final static int LORD_CALL_YES = 1; // 用户要地主
	public final static int ORD_CALL_NO = 0; // 用户不要地主
	public final static int UL_CALL_YES = 1; // 用户加倍
	public final static int UL_CALL_NO = 0; // 用户不加倍
	public final static int OOL_GIFT_USE_OK = 0x01; // 道具或礼物使用成功
	public final static int OOL_GIFT_USE_FAIL = 0x02; // 道具或礼物使用失败
	public final static int OOM_NEW_TURN_YES = 0x01; // 新的一轮
	public final static int OOM_NEW_TURN_NO = 0x02; // 不是新的一轮
	public final static int LAYER_TRUST_YES = 0x01; // 玩家托管
	public final static int LAYER_TRUST_NO = 0x02; // 玩家取消托管
	public final static int ET_STATE_WIFI = 0x01;
	public final static int ET_STATE_2G = 0x02;
	public final static int ET_STATE_3G = 0x03;
	public final static int ET_STATE_4G = 0x04;
	public final static int SERVER_NORMAL_SITE = 0x01;
	public final static int SERVER_GRAB_SITE = 0x12;
	public final static int SERVER_DAJIANG_SITE = 0x21;
	public final static int SERVER_MERRY = 0x0e;// 婚礼场
	public final static int SERVER_WRDOUNIU_SITE = 0x09;
	public final static int SERVER_PRIVATE_SITE = 0x07;
	public final static int SERVER_FDOUNIU_SITE = 0x31;
	public final static int SERVER_JINNIU_SITE = 0x34;
	public final static int SERVER_JINNIU_SITE_PRI = 0x39;
	public final static int SERVER_MATCH_SITE = 0x05;
	public final static int SERVER_Fee_SITE = 0x06;// 话费比赛场
	public final static int SERVER_JINHUA_PRIMARY = 0x3C;// 初级
	public final static int SERVER_JINHUA_MIDDLE = 0x3D;// 中级
	public final static int SERVER_JINHUA_SENIOR = 0x3E;// 高级
	public final static int SERVER_JINHUA_FA = 0x3F;// 发哥场
	public final static int SERVER_JINHUA_CloseLook = 0x41;// 秒
	public final static int MatchCoinPrimary = 0x01; // 比赛场-金币-初级场
	public final static int MatchCoinMiddle = 0x02; // 比赛场-金币-中级场
	public final static int MatchCoinSenior = 0x03;// 比赛场-金币-高级场
	public final static int MatchGemPrimary = 0x04;// 比赛场-元宝-初级场
	public final static int MatchGemMiddle = 0x05;// 比赛场-元宝-初级场
	public final static int MatchGemSenior = 0x06;// 比赛场-元宝-初级场
	public final static int MatchFeePrimary = 0x07; // 比赛场-话费券-初级场
	public final static int MatchFeeMiddle = 0x08; // 比赛场-话费券-初级场
	public final static int MatchFeeSenior = 0x09; // 比赛场-话费券-初级场
	public final static int FeeFeePrimary = 0x11;// 话费场-话费券-初级场
	public final static int FeeFeeMiddle = 0x12; // 话费场-话费券-初级场
	public final static int FeeFeeSenior = 0x13;// 话费场-话费券-初级场
	public final static int FLORD_TYPE_ONE = 0x00;// 斗地主-叫/抢-初级场
	public final static int FLORD_TYPE_TWO = 0x01;// 斗地主-叫/抢-中级场
	public final static int FLORD_TYPE_THREE = 0x02;// 斗地主-叫/抢-高级场
	public final static int FLORD_TYPE_FOUR = 0x03;// 斗地主-叫/抢-至尊场
	public final static int WUNIU_TYPE_ONE = 0x00;// 五人斗牛-初级场
	public final static int WUNIU_TYPE_TWO = 0x01;// 五人斗牛-中级场
	public final static int WUNIU_TYPE_THREE = 0x02;// 五人斗牛-高级场
	public final static int WUNIU_TYPE_FOUR = 0x03;// 五人斗牛-至尊场
	public final static int JINNIU_TYPE_ONE = 0x00;// 金牛-初级场
	public final static int JINNIU_TYPE_TWO = 0x01;// 金牛-中级场
	public final static int JINNIU_TYPE_THREE = 0x02;// 金牛-高级场
	public final static int JINNIU_TYPE_FOUR = 0x03;// 金牛-至尊场
	public final static int TOOL_KICK = 4;
	public final static int TOOL_BROADCAST = 7;
	public final static int TOOL_Fee = 0x101;
	public final static int GIFT_FLOWER = 0x01;
	public final static int GIFT_EGG = 0x02;
	public final static int GIFT_CAR = 0x03;
	public final static int GIFT_SHIP = 0x04;
	public final static int GIFT_PLANE = 0x05;
	public final static int COIN_UPDATE_TASK = 1;// 任务
	public final static int COIN_UPDATE_CHEST = 2;// 宝箱
	public final static int COIN_UPDATE_BUY = 3;// 商城购买
	public final static int COIN_UPDATE_SALE_GIFT = 4;// 卖礼物
	public final static int COIN_UPDATE_BRANK = 5;// 破产补助
	public final static int COIN_UPDATE_PAY = 6;// 支付
	public final static int TASK_STATE_NO = 0;// 不可领奖
	public final static int TASK_STATE_YES = 1; // 可以领奖
	public final static int TASK_REWARD_RES_OK = 1; // 领取任务奖励OK
	public final static int TASK_REWARD_TYPE_BAG = 1; // 领取任务奖励-背包
	public final static int MatchCoinTypeCoin = 1;// 比赛场金币类型
	public final static int MatchCoinTypeGem = 2;// 比赛场元宝类型
	public final static int MatchCoinTypeFee = 3;// 比赛场话费券类型
	public final static int GrabActIdCallCallY = 1;// 要地主
	public final static int GrabActIdCallCallN = 2; // 不要地主
	public final static int GrabActIdGrabCallY = 3; // 叫地主
	public final static int GrabActIdGrabCallN = 4; // 不叫地主
	public final static int GrabActIdGrabGrabY = 5; // 抢地主
	public final static int GrabActIdGrabGrabN = 6; // 不抢
	public final static int GrabActIdCallMulY = 7; // 加倍
	public final static int GrabActIdCallMulN = 8; // 不加倍
	public final static int MESSAGE_GIF = 0x01;
	public final static int MESSAGE_COMMOM = 0x02;
}
