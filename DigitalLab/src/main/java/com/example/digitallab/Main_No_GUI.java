package com.example.digitallab;

import java.io.IOException;



public class Main_No_GUI {

    public static void main(String[] args) throws IOException {

        MinCalculator agg = new MinCalculator();
        CalculatorProcessor<MinCalculator> dataProcessor = new CalculatorProcessor<MinCalculator>(agg, "RawData.csv");

        // 1: Signal
        // 2: Concentration
        // 3: %CV
        double value = dataProcessor.runAggregator(0); // Min number in the first column in RawData table
        System.out.println(value);


    }

}
