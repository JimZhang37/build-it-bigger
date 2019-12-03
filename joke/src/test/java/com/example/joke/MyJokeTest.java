package com.example.joke;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyJokeTest {

    @Test
    public void getJoke() {
        MyJoke joker = new MyJoke();
        assert joker.getJoke().length() != 0;
    }
}