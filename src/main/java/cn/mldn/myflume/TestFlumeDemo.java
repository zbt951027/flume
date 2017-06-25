package cn.mldn.myflume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFlumeDemo {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestFlumeDemo.class);

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			LOGGER.info("[***** www.mldn.cn *****]"); 
		}
	}
} 
