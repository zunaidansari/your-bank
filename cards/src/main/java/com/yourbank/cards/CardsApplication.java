package com.yourbank.cards;

import com.yourbank.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "YourBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Zunaid Ansari",
						email = "mohdzunaidalameenansari@gmail.com",
						url = "https://zunaidansari.github.io/portfolio/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://zunaidansari.github.io/portfolio/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "YourBank Cards microservice REST API Documentation",
				url = "https://zunaidansari.github.io/portfolio/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
