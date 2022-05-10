package com.example.digitallab;

import java.util.List;

public class MaxCalculator extends Calculator { // Extends the parent class


    @Override
    public double calculate() { // It implements the calcuate() method
        // This method figures out the max number in the given list of numbers
        // That list is numbers variable defined in Aggregator class, the parent
        // We iterate through the list to figure out the largest value
        double max = numbers.get(0);
        for(double number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    @Override
    public List<Double> getValues() { // Returns that list of numbers
        return numbers;
    }

}

