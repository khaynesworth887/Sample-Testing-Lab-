package com.example.digitallab;

/**
 * This is an abstract class that is a parent to the other classes.
 * It has a list of numbers, so any child class will have access to numbers
 */


import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    List<Double> numbers; // it has a list of numbers

    public Calculator(){ // it has a constructor w/out passing a value
        numbers = new ArrayList<Double>();
    }

    public Calculator(List<Double> numbers){ //it has a constructor with passing a list
        numbers = new ArrayList<Double>(numbers);
    }

    /**
     * add data to the given collection
     *
     */
    public void add(Double number) { // add method to add a particular number to the list of numbers
        numbers.add(number);
    }
    /**
     * Any class that is a derivative of the abstract class
     * Aggregator must implement the calculate method.
     * @return double
     */

    /**
     * Abstract method calcuate() that any child class that extends Aggregator class must implement this method
     * Any child class must implement get values
     */
    public abstract double calculate();

    public abstract List<Double> getValues();

}