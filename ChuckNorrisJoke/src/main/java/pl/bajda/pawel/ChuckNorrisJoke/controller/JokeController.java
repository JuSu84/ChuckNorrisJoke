package pl.bajda.pawel.ChuckNorrisJoke.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bajda.pawel.ChuckNorrisJoke.model.JokeModel;
import pl.bajda.pawel.ChuckNorrisJoke.service.JokeService;

@Controller
@RequestMapping("/api/chuck")
public class JokeController {

    private static final Logger LOGGER = LogManager.getLogger(JokeController.class.getName());

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String getRandomJokeAboutChuck(Model model){
        LOGGER.info("getRandomJokeAboutChuck({})", model);

        JokeModel randomJokeFromApi = jokeService.getRandomJokeFromApi();
        model.addAttribute("jokeModel", randomJokeFromApi);

        LOGGER.info("getRandomJokeAboutChuck({})", model);
        return "chuck";
    }
}
