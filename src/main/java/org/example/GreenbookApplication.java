package org.example;

import org.example.entity.Event;
import org.example.entity.EventLocationMapping;
import org.example.repositories.EventLocationRepository;
import org.example.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
public class GreenbookApplication{

	public static void main(String[] args) {
		SpringApplication.run(GreenbookApplication.class, args);
	}

}
