package br.ufsm.triagem;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//classe que inicia a apicação. o @OpenAPIdefinition é usado para gerar a documentação da API com o Swagger
@OpenAPIDefinition(info = @Info(title = "API de Triagem de Curriculos - UFSM", version = "1.0", description = "Vagas, cadidatos e candidaturas com triagem automatica" ))

@SpringBootApplication
public class TriagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriagemApplication.class, args);
	}

}
