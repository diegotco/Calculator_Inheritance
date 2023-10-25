package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:" );
        int x = input.nextInt();

        System.out.println("Now enter the second integer:" );
        int y = input.nextInt();

        var addResult = new Add();
        var subtractResult = new Subtract();
        var multiplyResult = new Multiply();
        var divisionResult = new Division();

        addResult.addNumber(x, y);
        subtractResult.subtractNumber(x, y);
        multiplyResult.multiplyNumber(x, y);
        divisionResult.divisionNumber(x, y);
    }
}