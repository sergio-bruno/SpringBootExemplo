package com.slbruno.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Producao
public class ConfiguracaoProd {

	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("rodando prod");
		};
	}
}
