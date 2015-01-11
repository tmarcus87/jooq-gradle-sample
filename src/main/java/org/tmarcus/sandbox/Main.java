package org.tmarcus.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ono_takahiko
 * @since 2015/01/11
 */
@EnableAutoConfiguration
@ComponentScan({
	"org.tmarcus.sandbox"
})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(DefaultRunner.class, args);
	}

}
