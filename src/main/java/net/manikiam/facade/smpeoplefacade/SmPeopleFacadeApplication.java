package net.manikiam.facade.smpeoplefacade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SmPeopleFacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmPeopleFacadeApplication.class, args);
	}

}
