package lab;

import java.util.Properties;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
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
	
	@Bean
    public JavaMailSender getJavaMailSender() {
	   JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	      mailSender.setHost("smtp.gmail.com");
	      mailSender.setPort(587);
	      
	      mailSender.setUsername("kjn74w@gmail.com");
	      mailSender.setPassword("kjn2010ehs");
	 
	      Properties props = mailSender.getJavaMailProperties();
	      props.put("mail.transport.protocol", "smtp");
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.debug", "true");
	       
	      return mailSender;
	  }
	
}

// spring boot allows us to start up an application, it has tomcat 
// server built into it. It configures the connection between your
// application and the database automatically.
