package br.com.contrategeraldo.TortaDeClimao;

import br.com.contrategeraldo.TortaDeClimao.Entities.Town;
import br.com.contrategeraldo.TortaDeClimao.Repositories.ITownRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TortaDeClimaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TortaDeClimaoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(ITownRepository repo) {
		return args -> {
			Stream.of(new Town(null, "Brasília", "DF", 455819),
					  new Town(null, "Goiânia", "GO", 12578971),
					  new Town(null, "Campo Grande", "MS", 455849),
					  new Town(null, "Cuiabá", "MT", 12579338),

					  new Town(null, "São Paulo","SP", 455827),
					  new Town(null, "Rio de Janeiro", "RJ", 90200707),
					  new Town(null, "Belo Horizonte", "MG", 455821),
					  new Town(null, "Vitória", "ES", 455922),

					  new Town(null, "Curitiba", "PA", 455822),
					  new Town(null, "Florianópolis", "SC", 455861),
					  new Town(null, "Porto Alegre", "RS", 455823),

					  new Town(null, "Salvador", "BA", 455826),
					  new Town(null, "Maceió", "AL", 12578106),
					  new Town(null, "Fortaleza", "CE", 455830),
					  new Town(null, "São Luiz", "MA", 455834),
					  new Town(null, "Recife", "PE", 455824)
			).forEach(town -> {
				repo.save(town);
			});

			repo.findAll().forEach(System.out::println);
		};
	}
}
