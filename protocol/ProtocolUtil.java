package com.dg.game.infrastructure.protocol;

import java.lang.reflect.Field;

import com.dg.game.infrastructure.protocol.game.LoginTable;

public class ProtocolUtil {
	// private static Map<String, String> typeMap = new HashedMap<String, String>();
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		ProtocolUtil.genWrite(new LoginTable(0));
	}

	public static void genWrite(AbstactPacketResp resp) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = resp.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String method = toUpperCase(fields[i].getType().getSimpleName(), 0);
			System.out.println("write" + method + "(" + fields[i].getName() + ");");
		}

	}

	public static String toUpperCase(String name, int pos) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			if (i == pos) {
				sb.append((name.charAt(i) + "").toUpperCase());
			} else {
				sb.append((name.charAt(i) + ""));
			}
		}
		return sb.toString();
	}
}
