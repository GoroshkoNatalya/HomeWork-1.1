package ru.geekrains.java_core1.home1;


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWorlds();
        checkSumSing();
        printColor();
        compareNumbers();

    }
    public static void printThreeWorlds(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aplle");
    }

    public static void checkSumSing() {
        int a = 3;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The sum is positive");
        } else System.out.println("The amount is negative");

    }

    public static void printColor() {
        int value = 6;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Уellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(){
        int a = 3;
        int b = 5;
        if ( a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
