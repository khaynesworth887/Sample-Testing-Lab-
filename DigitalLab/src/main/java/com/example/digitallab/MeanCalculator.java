package com.example.digitallab;

import java.util.List;

public class MeanCalculator extends Calculator {

    /**
     * The calcuate() method adds all the values in list numbers, and
     * divides it by the number of values that were in the list
     *
     */
    public double calculate() {
        double result = 0;
        if(!numbers.isEmpty()){
            double value = 0.00;
            for(Number number : numbers){
                value+=number.doubleValue();
            }
            result = value/numbers.size();
        }
        return result;
    }

    @Override
    public List<Double> getValues() {
        return numbers;
    }

}


