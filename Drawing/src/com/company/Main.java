package com.company;

public abstract class Main {

    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }

    private static void drawDiamond() {
        drawUpwardsArrow();
        drawDownwardsArrow();
        terminateObject();
    }

    private static void drawX() {
        drawDownwardsArrow();
        drawUpwardsArrow();
        terminateObject();
    }

    private static void drawRocket() {
        drawUpwardsArrow();
        drawBox();
        drawMessage("United-States");
        drawBox();
        drawUpwardsArrow();
    }

    private static void drawUpwardsArrow() {
        System.out.println("     /\\");
        System.out.println("    /  \\");
        System.out.println("   /    \\");
        System.out.println("  /      \\");
        System.out.println(" /        \\");
        System.out.println("/          \\");
    }

    private static void drawDownwardsArrow() {
        System.out.println("\\          /");
        System.out.println(" \\        /");
        System.out.println("  \\      /");
        System.out.println("   \\    /");
        System.out.println("    \\  /");
        System.out.println("     \\/");
    }

    private static void drawBox() {
        System.out.println("+----------+");
        System.out.println("+          +");
        System.out.println("+          +");
        System.out.println("+          +");
        System.out.println("+----------+");
    }

    private static void drawMessage(String message) {
        var words = message.split("-", 2);

        System.out.println(String.format("+  %s  +", GetWord(words[0])));
        System.out.println(String.format("+  %s  +", GetWord(words[1])));
    }

    private static String GetWord(String word) {
        var wordReplacement = "      ";
        return (word == null) ? wordReplacement : word;
    }

    private static void terminateObject() {
        System.out.println();
    }
}
