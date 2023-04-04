package com.scaleupindia.utility;

/**
 * @author abhishekvermaa10
 *
 */
public class LogUtil {
	public static void logWithoutSleep(String value) {
		System.out.println(value);
	}

	public static void logWithSleep(String value) {
		System.out.println(value);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}