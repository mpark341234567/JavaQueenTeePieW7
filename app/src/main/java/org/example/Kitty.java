package org.example;

public class Kitty implements Cutie {
    @Override
    public String description() {
        return "A little kitty with soft fur and playful behavior.";
    }

    @Override
    public Integer cutenessRating() {
        return 8;
    }
    
}
