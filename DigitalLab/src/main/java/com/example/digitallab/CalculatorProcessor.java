package com.example.digitallab;

import java.io.IOException;
import java.util.List;

// Define it as generic, this class is capable of working with Aggregators
// T means any child of Aggregator or Aggregator can be utilized in this class
public class CalculatorProcessor<T extends Calculator>{

    // Define a variable of type T that represents Aggregator
    T aggregator;
    String file;

    public CalculatorProcessor(T aggregator, String file) { // Constructor using fields
        super();
        this.aggregator = aggregator;
        this.file = file;
    }

    public double runAggregator(int colIdx) throws IOException { // int is the column we want to use for calculations
        RawDataFileReader fileReader = new RawDataFileReader(file) ;// Accepts file name as argument, populated thorugh the constructor
        List<String> lines = fileReader.readFileData(); // This returns a list of Strings that represent each line

        // Now we iterate over this list of lines
        for (String line : lines){ // each line contains commas and values
            String[] numbers = line.split(","); // we split on the comma and retruns a String array
            //colIdx--; // To correct for the fact that Array index starts at 0
            // Each line is placed in this array of numbers
            // Now convert each String to a number
            double value = Double.parseDouble(numbers[colIdx]);
            aggregator.add(value);
        }
        // Whatever Aggregator this class is extenuated with (Min, Max, Mean)
        // it will invoke the corresponding calculate() method
        double number = aggregator.calculate();

        return number;
    }


}
