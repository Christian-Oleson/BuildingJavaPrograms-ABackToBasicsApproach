package com.oleson;

public class Main {
    public static void main(String[] args) {
        PrintHex();
        PrintDivider();
        PrintHex();
        PrintDivider();
        PrintLowerHex();
        PrintHex(true);
    }

    private static void PrintHex() {
        PrintHex(false);
    }

    private static void PrintHex(boolean useHexDivider) {
        PrintUpperHex();
        if (useHexDivider){
            PrintDivider();
        }
        PrintLowerHex();
    }

    private static void PrintDivider() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    private static void PrintUpperHex() {
        System.out.println("  _______ ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    private static void PrintLowerHex() {
        System.out.println("\\         /");
        System.out.println(" \\       /");
        System.out.println("  ﹊﹊﹊﹊ ");
    }
}
