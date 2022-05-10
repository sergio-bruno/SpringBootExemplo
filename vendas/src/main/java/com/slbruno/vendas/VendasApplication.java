package com.slbruno.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = {"io.externo", ""})
public class VendasApplication {

	@Autowired
	@Qualifier("nomeBeanAplicacao")
	private String nomeAplicacao;
	
	@Gato
	private Animal animal;
	
	@Bean 
	public CommandLineRunner executarAnimal() {
		return args -> {
			this.animal.fazerBarulho();
		};
	}
	
	@Value("${application.name}")
	private String nomeAplicacaoAppProperties;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return nomeAplicacao;
	}
	
	@GetMapping("/helloAppProperties")
	public String helloAppProperties() {
		return nomeAplicacaoAppProperties;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
