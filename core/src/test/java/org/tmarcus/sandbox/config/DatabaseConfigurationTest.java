package org.tmarcus.sandbox.config;

import org.jooq.DSLContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.tmarcus.sandbox.TestBase;

import static org.junit.Assert.assertNotNull;

public class DatabaseConfigurationTest extends TestBase {

	@Autowired
	private DSLContext dslContext;

	@Test
	public void testDslContext() {
		assertNotNull(dslContext);
	}

}