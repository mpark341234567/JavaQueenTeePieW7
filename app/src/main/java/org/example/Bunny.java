package org.example;

public class Bunny implements Cutie {
    @Override
    public String description() {
        return "A fluffy white bunny with long ears and a twitching nose.";
    }

    @Override
    public Integer cutenessRating() {
        return 10;
    }
}
