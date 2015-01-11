package org.tmarcus.sandbox;

import org.springframework.boot.CommandLineRunner;

/**
 * @author ono_takahiko
 * @since 2015/01/11
 */
public class DefaultRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("OK");
	}

}
