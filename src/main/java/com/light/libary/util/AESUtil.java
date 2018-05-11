package com.light.libary.util;

public class AESUtil {
	public static native String encode(String src, int len, String key);
	public static native String decode(String src, int len, String key);
}
