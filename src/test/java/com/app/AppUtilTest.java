package com.app;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class AppUtilTest {
	
	AppUtil util;
	
	@BeforeEach
	void init(TestReporter reporter) {
		util = new AppUtil();
	}

	@Test
	@DisplayName("Add Method")
	void testAdd() {
		assertEquals(10, util.add(5, 5), "Add Method is not working as expected");
		assertEquals(10, util.add(6, 5), "Add Method is not working as expected");
		assertEquals(10, util.add(2, 3), "Add Method is not working as expected");
	}
	
	@Test
	@DisplayName("Add2 Method")
	void testAdd2() {
		assertAll(
				() -> assertEquals(10, util.add(5, 5)),
				() -> assertEquals(10, util.add(6, 5)),
				() -> assertEquals(10, util.add(2, 3))
				);
	}

}
