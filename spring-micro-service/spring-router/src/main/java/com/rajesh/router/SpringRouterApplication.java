package com.rajesh.router;

import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rajesh.router.model.Employee;
import com.rajesh.router.repo.EmployeeRepository;

@SpringBootApplication
public class SpringRouterApplication {
	
	@Bean
	CommandLineRunner employees(EmployeeRepository  employeeRepository) {

		return args -> {
			employeeRepository
					.deleteAll()
			.subscribe(null, null, () -> {

				Stream.of(new Employee(UUID.randomUUID().toString(),
						"Rajesh", 23000L),new Employee(UUID.randomUUID().toString(),
						"Lenin", 13000L),new Employee(UUID.randomUUID().toString(),
						"Aravind", 20000L),new Employee(UUID.randomUUID().toString(),
						"Vasanth", 53000L)
						)
						.forEach(employee -> {
				employeeRepository
						.save(employee)
						.subscribe(System.out::println);

						});

			})
			;
		};

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringRouterApplication.class, args);
	}

}
