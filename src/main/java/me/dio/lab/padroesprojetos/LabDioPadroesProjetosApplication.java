package me.dio.lab.padroesprojetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabDioPadroesProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDioPadroesProjetosApplication.class, args);
	}

}
