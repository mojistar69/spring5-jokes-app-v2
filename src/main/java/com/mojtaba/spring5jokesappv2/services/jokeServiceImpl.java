package com.mojtaba.spring5jokesappv2.services;


import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
public class jokeServiceImpl implements jokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public jokeServiceImpl(){
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();

    }
    @Override
    public String getjoke() {
        return  chuckNorrisQuotes.getRandomQuote();
    }
}
