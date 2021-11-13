package pl.bajda.pawel.ChuckNorrisJoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ChuckNorrisJokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate (RestTemplateBuilder builder){
		return builder.build();
	}
}
