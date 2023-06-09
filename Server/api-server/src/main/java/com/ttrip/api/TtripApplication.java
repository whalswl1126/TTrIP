package com.ttrip.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.ttrip"}, exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = {"com.ttrip.core","com.ttrip.api"})
@EntityScan({"com.ttrip.core", "com.ttrip.api"})
@EnableJpaRepositories("com.ttrip.core")
@EnableMongoRepositories(basePackages = "com.ttrip.core")
@EnableJpaAuditing
public class TtripApplication {

	public static void main(String[] args) {
		SpringApplication.run(TtripApplication.class, args);
	}
}
