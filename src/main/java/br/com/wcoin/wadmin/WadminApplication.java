package br.com.wcoin.wadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan({"br.com.wcoin.wadmin"})
public class WadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WadminApplication.class, args);
	}

}
