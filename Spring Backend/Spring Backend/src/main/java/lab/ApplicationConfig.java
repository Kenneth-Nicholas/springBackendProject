package lab;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@EnableJpaRepositories(basePackages="repository")

// The repository is where the code that is responsible 
// for storing the data relating to a student for example in the DB
// Manipulates the DB, talks to the DB directly

@EntityScan(basePackages="entity")

// Entity is what you're trying to store in the DB
// A row in the DB. An entity called student is an example,
// a record in the DB

public class ApplicationConfig {
}

// spring boot allows us to start up an application, it has tomcat 
// server built into it. It configures the connection between your
// application and the database automatically.
