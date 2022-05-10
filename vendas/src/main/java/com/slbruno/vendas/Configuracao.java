package com.slbruno.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

	@Bean(name = "nomeBeanAplicacao")
	public String nomeAplicacao() {
		return "Sistema de vendas v0.0.3";
	}
}
