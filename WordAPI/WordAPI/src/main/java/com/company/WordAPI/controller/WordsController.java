package com.company.WordAPI.controller;

import com.company.WordAPI.models.Words;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordsController {

    private static int idCounter = 0;

    private static List<Words> wordsList = new ArrayList<>(Arrays.asList(
            new Words("irredentism", "advocating restoration of territory to a nation", idCounter++),
            new Words("constate", "to assert", idCounter++),
            new Words("meable", "easily penetrable", idCounter++),
            new Words("wormwood", "something bitter, galling, or grievous\n", idCounter++),
            new Words("grenadine", "thin syrup made from pomegranate juice; used in mixed drinks", idCounter++),
            new Words("hefty", "of considerable weight and size", idCounter++),
            new Words("pelter", "a thrower of missiles", idCounter++),
            new Words("manikin", "a life-size dummy used to display clothes\n", idCounter++),
            new Words("cordial", "politely warm and friendly", idCounter++),
            new Words("Utopian", "of or pertaining to or resembling a utopia", idCounter++)

    ));

    @RequestMapping(value = "/words", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Words getDefinition(@RequestParam(required = false) String words, @RequestParam (required = false) String definition) {


        List<Words> returnList = wordsList;

        Words foundQuotes = null;

        for(Words quotes : wordsList){

            Random rand = new Random();

            int randomId = rand.nextInt(10);

            if (quotes.getId() == randomId){
                foundQuotes = quotes;
                System.out.println(foundQuotes);
            }
        }

        return foundQuotes;

    }



}
