package Crud.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("Crud")
@Configuration

public class MyConfiguration {
	@Bean
	EntityManager entityManager(){
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
	
}
