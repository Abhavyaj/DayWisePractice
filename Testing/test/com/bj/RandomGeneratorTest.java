package com.bj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomGeneratorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testValuesAreWithinRange() {
	    int[] result = RandomGenerator.getTenRandom();

	    for (int num : result) {
	        assertTrue(num >= 0 && num < 10);
	    }
	}
	@Test
    void testArraySizeIsTen() {
        int[] result = RandomGenerator.getTenRandom();
        assertEquals(10, result.length);
    }
	@Test
	void testArrayIsNotNull() {
	    int[] result = RandomGenerator.getTenRandom();
	    assertNotNull(result);
	}
	
	
	}
