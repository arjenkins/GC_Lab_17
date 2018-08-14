package primeNumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GCLab17Test {

	@Test
	void test1() {
		//arrange
		int num = 1;
		int result = GCLab17.getNthPrime(num);
		
		assertEquals(2, result);
		
	}
	@Test
	void test2() {
		//arrange
		
		int actual = GCLab17.getNthPrime(2);
		int expected = 3;
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		//arrange
		
		int actual = GCLab17.getNthPrime(3);
		int expected = 5;
		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		//arrange
		
		int actual = GCLab17.getNthPrime(12);
		int expected = 37;
		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		//arrange
		
		int actual = GCLab17.getNthPrime(10);
		int expected = 29;
		assertEquals(expected, actual);
	}
	@Test
	void test6() {
		//arrange
		
		int actual = GCLab17.getNthPrime(20);
		int expected = 71;
		assertEquals(expected, actual);
	}
}
