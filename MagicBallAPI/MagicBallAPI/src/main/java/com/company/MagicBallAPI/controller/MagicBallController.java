package com.company.MagicBallAPI.controller;


import com.company.MagicBallAPI.models.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MagicBallController {

    Random rand = new Random();

    private static int idCounter = 0;
    private static  List<Question> questionList = new ArrayList<>();


    private static List<String> answerList = new ArrayList<>(Arrays.asList(

            "Try Again",
            "It is very likely",
            "Never in a million years",
            "Results may vary",
            "I am 99% certain",
            "I would not get my hopes up"
            ));


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Question getAnswer (@RequestBody Question question){

        int randomId = rand.nextInt(answerList.size());
        String randomAnswer = answerList.get(randomId);

        question.setAnswer(randomAnswer);
        question.setId(idCounter++);
        questionList.add(question);

        return question;
    }


}
