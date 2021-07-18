package com.kathleenwang;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // because readNumber is a static method, we can call it directly from console w/o having to create an instance of it!
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        Mortgage mortgage = new Mortgage(principal,annualInterest,years);
        mortgage.printMortgage();
    }

}
