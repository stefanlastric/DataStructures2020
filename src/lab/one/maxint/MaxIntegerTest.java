package lab.one.maxint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxIntegerTest {
	static int[] numbers;
	static MaxInteger maxInts;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		maxInts = new MaxInteger();
		numbers = maxInts.readNumbers("C:\\Users\\Dario Susic\\eclipse-workspace\\DSLab2020\\src\\lab\\one\\maxint\\numbers.txt");
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		maxInts = null;
		numbers = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCorrectlyFindsMaxNumber() {
		assertEquals(987, maxInts.findMax(numbers));
	}
	
	@Test
	void testIncorrectlyFindsMaxNumber() {
		assertNotEquals(334, maxInts.findMax(numbers));
	}

}
