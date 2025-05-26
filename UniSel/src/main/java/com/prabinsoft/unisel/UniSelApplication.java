package com.prabinsoft.unisel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(title = "UniSel OPEN API",
                version = "1.0.0",
                description = "University shortlisting management system"
        ),
        servers = @Server(
                url = "http://localhost:8848/unisel/",
                description = "University shortlisting management system"
        )
)
@SpringBootApplication
public class UniSelApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniSelApplication.class, args);
	}

}
