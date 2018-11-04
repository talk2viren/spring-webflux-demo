package com.example.springwebfluxdemo;

import com.example.springwebfluxdemo.reactivemongoclient.Employee;
import com.example.springwebfluxdemo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringWebfluxDemoApplication {

    /*

	@Bean
	WebClient webClient() {
		return WebClient.create("http://localhost:8083/rest/employee");
	}

    @Bean
    CommandLineRunner employees(EmployeeRepository employeeRepository) {

        return args -> {
            employeeRepository
                    .deleteAll()
                    .subscribe(null, null, () -> {

                        Stream.of(new Employee(UUID.randomUUID().toString(),
                                "Peter", 23000L),new Employee(UUID.randomUUID().toString(),
                                "Sam", 13000L),new Employee(UUID.randomUUID().toString(),
                                "Ryan", 20000L),new Employee(UUID.randomUUID().toString(),
                                "Chris", 53000L)
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


*/


    public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxDemoApplication.class, args);
	}
}
