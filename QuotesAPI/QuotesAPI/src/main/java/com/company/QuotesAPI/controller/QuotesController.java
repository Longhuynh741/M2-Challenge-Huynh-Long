package com.company.QuotesAPI.controller;


import com.company.QuotesAPI.models.Quotes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuotesController {

    private static int idCounter = 0;


    private  static List<Quotes> quotesList = new ArrayList<>(Arrays.asList(
            new Quotes("Truth is beautiful, without doubt; but so are lies.", "Ralph Waldo Emerson", idCounter++),
            new Quotes("I always like a good math solution to any love problem.", "Michael Patrick King,", idCounter++),
            new Quotes("When you are right you cannot be too radical; when you are wrong, you cannot be too conservative.", "Martin Luther King Jr. ", idCounter++),
            new Quotes("When I was born I was so surprised I didn't talk for a year and a half.", "Gracie Allen ", idCounter++),
            new Quotes("A lifetime is more than sufficiently long for people to get what there is of it wrong.", "Piet Hein", idCounter++),
            new Quotes("There is no greater importance in all the world like knowing you are right and that the wave of the world is wrong, yet the wave crashes upon you.", "Norman Mailer", idCounter++),
            new Quotes("Women who seek to be equal with men lack ambition.", "Timothy Leary", idCounter++),
            new Quotes("It is nobler to declare oneself wrong than to insist on being right - especially when one is right.", "Friedrich Nietzsche", idCounter++),
            new Quotes("The best way to compile inaccurate information that no one wants is to make it up.", "Scott Adams", idCounter++),
            new Quotes("I would feel more optimistic about a bright future for man if he spent less time proving that he can outwit Nature and more time tasting her sweetness and respecting her seniority.", "E. B. White", idCounter++)
    ));


    @RequestMapping(value = "/quotes", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quotes getRandomQuote(@RequestParam(required = false) String quote, @RequestParam (required = false) String artist) {


        List<Quotes> returnList = quotesList;

        Quotes foundQuotes = null;

        for(Quotes quotes : quotesList){

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
