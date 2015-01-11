package org.tmarcus.sandbox.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ono_takahiko
 * @since 2015/01/11
 */
@Configuration
public class DatabaseConfiguration {

	@Bean
	public Connection connection(DataSource datasource) {
		try {
			return datasource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Bean
	public DSLContext dslContext(Connection connection) {
		return DSL.using(connection, SQLDialect.MYSQL);
	}

}
