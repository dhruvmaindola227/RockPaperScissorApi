package com.example.demo.Controller;

import com.example.demo.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    GameService gameService;

    @GetMapping (path = "/rps/{userInput}")
    public @ResponseBody String playGame(@PathVariable String userInput) {
        System.out.println(userInput);
        return gameService.playGame(userInput);
    }

}
