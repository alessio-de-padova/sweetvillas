package com.nimesia.sweetvillas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SweetVillasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SweetVillasApplication.class, args);
	}

}
