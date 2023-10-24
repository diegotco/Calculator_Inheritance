package org.example;

public class Main {

    public static void main(String[] args) {
        int x = 9;
        int y = 7;

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