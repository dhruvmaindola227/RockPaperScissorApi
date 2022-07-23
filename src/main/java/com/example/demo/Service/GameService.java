package com.example.demo.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

@Service
public class GameService {
    public ArrayList<String> computerAnswer = new ArrayList<>(Arrays.asList(
            "rock" , "paper" , "scissors"
    ));


    public String playGame(String userInput){
        Random random = new Random();
        int indexOfChoice = random.nextInt(3);
        String choiceOfComputer = computerAnswer.get(indexOfChoice);

        if(Objects.equals(userInput, choiceOfComputer)){
            return "TIE !";
        }
        if(Objects.equals(userInput, "scissors") && Objects.equals(choiceOfComputer, "rock")){
            return "User chose " + userInput + " and the computer chose " + choiceOfComputer
                    + " so the winner is computer";
        }
        if(Objects.equals(userInput, "paper") && Objects.equals(choiceOfComputer, "scissors")){
            return "User chose " + userInput + " and the computer chose " + choiceOfComputer
                    + " so the winner is computer";
        }
        if(Objects.equals(userInput, "rock") && Objects.equals(choiceOfComputer, "paper")){
            return "User chose " + userInput + " and the computer chose " + choiceOfComputer
                    + " so the winner is computer";
        }
        return "User chose " + userInput + " and the computer chose " + choiceOfComputer
                + " so the winner is the user";
    }
}
