package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Protein;
import com.example.demo.repository.ProteinRepository;

@SpringBootApplication
public class CrudProteinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProteinsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initData(ProteinRepository proteinRepository) {
		
		return args ->{
			//List<Protein> proteins = proteinRepository.findAll();

		};
	}

}
