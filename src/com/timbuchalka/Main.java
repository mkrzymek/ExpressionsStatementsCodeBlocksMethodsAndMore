package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        expressions();
//        statementsWhitespacesAndIndentation();
//        CodeBlocksAndTheIfThenElseControlStatements();
//        methodsInJava();
        methodOverloading();
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

    private static void methodsInJava() {

        int highScore = calculateScore1(true, 800, 5, 100);
        System.out.println("final score " + highScore);
        highScore = calculateScore1(true, 10000, 8, 200);
        System.out.println("final score " + highScore);
    }

    public static int calculateScore1(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;
    }

    public static void methodOverloading() {
        int newScore = calculateScore2("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore2(600);
        calculateScore2();
    }

    public static int calculateScore2(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore2(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore2() {
        System.out.println("Unnamed player scored no player score");
        return 0;
    }
}
