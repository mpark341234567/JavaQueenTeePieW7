package org.example;

public class Puppy implements Cutie {
    @Override
    public String description() {
        return "A playful puppy with floppy ears and a wagging tail.";
    }

    @Override
    public Integer cutenessRating() {
        return 7;
    }
}
