package org.tmarcus.sandbox;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.tmarcus.sandbox.config.DatabaseConfigurationTest;

/**
 * @author ono_takahiko
 * @since 2015/01/11
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		DatabaseConfigurationTest.class
})
public class TestSuite {
}
