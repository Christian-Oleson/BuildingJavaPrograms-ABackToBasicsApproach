package com.oleson;

public class Main {

    public static void main(String[] args) {
        final int repeatCount = 2;
        Mantra(repeatCount);
    }

    private static void Mantra(int repeatCount) {
        var sb = new StringBuilder("There's one thing ever coder must understand:\n");
        sb.append("The System.out.println command.");

        for (int i = 0; i < repeatCount; i++) {
            System.out.println(sb);
        }
    }
}
