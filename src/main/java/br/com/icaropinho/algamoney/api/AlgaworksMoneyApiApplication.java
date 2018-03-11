package br.com.icaropinho.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.icaropinho.algamoney.api.config.property.AlgamoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class AlgaworksMoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgaworksMoneyApiApplication.class, args);
	}
}
