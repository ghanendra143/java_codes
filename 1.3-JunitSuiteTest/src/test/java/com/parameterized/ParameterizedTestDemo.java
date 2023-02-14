package com.parameterized;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	
	@ParameterizedTest
	@ValueSource(ints = {2,6,8,4})
	public void testEvenNumber(int num) {
		assertThat(CheckingEvenNumber.checkNumberEvenOrNot(num)).isEqualTo(true);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","dad","radar"})
	public void testPalindrome(String str) {
		assertThat(CheckPalindrome.isWordPalindrome(str)).isEqualTo(true);
	}

}
