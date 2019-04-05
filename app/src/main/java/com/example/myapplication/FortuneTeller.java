package com.example.myapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FortuneTeller {
    private static int MIN = 1;
    private int randomNum;

    private static final HashMap<Integer, String> fortunes;

    static {
        fortunes = new HashMap<>();
        fortunes.put(1, "Today is a good day");
        fortunes.put(2, "She believed she could so she did");
        fortunes.put(3, "Tiggs is stealthy tiger, beware.");
        fortunes.put(4, "I am an eevie hear me roar.");
        fortunes.put(5, "The tiger does not need head scratches.");
    }

    public FortuneTeller() {
        Random rand = new Random();
        this.randomNum = rand.nextInt((fortunes.size() - MIN) + 1) + MIN;
    }


    public String getFortune() {
        String fortune = fortunes.get(randomNum);
        return fortune;
    }
}
