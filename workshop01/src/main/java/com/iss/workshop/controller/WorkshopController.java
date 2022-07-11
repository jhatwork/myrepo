package com.iss.workshop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkshopController
{
	@GetMapping("/")
    public ModelAndView getIndex()
    {
        ModelAndView mav = new ModelAndView("index");
        
        // Initialize list of quotes
        List<String> quoteList = new ArrayList<String>();
        quoteList.add("Logic will get you from A to B. Imagination will take you everywhere.");
     	quoteList.add("There are 10 kinds of people. Those who know binary and those who don't.");
     	quoteList.add("There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.");
     	quoteList.add("It's not that I'm so smart, it's just that I stay with problems longer.");
     	quoteList.add("It is pitch dark. You are likely to be eaten by a grue.");
     		
     	// Get a random quote
     	Random rand = new Random();
     	String randomQuote = quoteList.get(rand.nextInt(quoteList.size()));
        mav.addObject("randomQuote", randomQuote);
        return mav;
    }
}