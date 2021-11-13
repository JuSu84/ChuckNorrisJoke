package pl.bajda.pawel.ChuckNorrisJoke.service;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.bajda.pawel.ChuckNorrisJoke.model.JokeModel;

@Service
public class JokeService {

    private static final Logger LOGGER = LogManager.getLogger(JokeService.class.getName());

    private static final String URL = "https://api.chucknorris.io/jokes/random";
    private final RestTemplate restTemplate;

    public JokeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public JokeModel getRandomJokeFromApi(){
        LOGGER.info("getRandomJokeFromApi()");

        JokeModel jokeModel = restTemplate.getForObject(URL, JokeModel.class);

        LOGGER.info("getRandomJokeFromApi({})", jokeModel);
        return jokeModel;
    }
}
