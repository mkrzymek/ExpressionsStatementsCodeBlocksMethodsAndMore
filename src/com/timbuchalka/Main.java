package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        expressions();
//        statementsWhitespacesAndIndentation();
        CodeBlocksAndTheIfThenElseControlStatements();
    }

    private static void expressions() {
        // keywords double, int, class etc
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("this is an expression");
        }

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score");
            score = 0;
        }
    }

    private static void statementsWhitespacesAndIndentation() {
        int myVariable = 50; // myVariable = 50 -> expression, int myVariable = 50 -> statement
        myVariable++;
        myVariable--;

        System.out.println("this is a test");
        System.out.println("this is " +
                "another " +
                "test");

        int anotherVariable = 50;
        myVariable--;
    }

    private static void CodeBlocksAndTheIfThenElseControlStatements() {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("your score is 5000");
//        } else if (score < 1000) {
//            System.out.println("bla bla");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score " + finalScore);
        }




    }
}
