package com.slbruno.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Desenvolvimento
public class ConfiguracaoDev {

	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("rodando dev");		
		};
	}
	
}
