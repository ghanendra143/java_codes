package com.timeout;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(1)		// for entire class
public class TimeOutDemo {
	
	@Test
//	@Timeout(1)    for individual testcase
	public void testTimeOut() throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
		assertThat(true).isEqualTo(true);
	}
	
	@Test
	public void testTimeOut2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("without sleep");
	}

}
