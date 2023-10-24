package org.example;

public class Division extends Add{

    public void divisionNumber(int x, int y){
        double result = (double) x / y;
        System.out.println("Total division: " + String.format("%.2f", result));
        System.out.printf("Total division with 3 decimals: %.3f%n%n", result);
    }
}
