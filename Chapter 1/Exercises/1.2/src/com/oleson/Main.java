package com.oleson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DrawSpike(5);
    }

    private static void DrawSpike(int depth) {
        char startingChar = '\\';
        char endingChar = '/';
        var sb = new StringBuilder();

        for (int i = 1; i <= depth; i++) {
            int spaceQuantity = depth - i;
            SpaceWriter(sb, spaceQuantity);

            int charQuantity = depth - spaceQuantity;
            for (int k = 0; k < charQuantity; k++) {
                sb.append(startingChar);
            }
            for (int k = 0; k < charQuantity; k++) {
                sb.append(endingChar);
            }

            SpaceWriter(sb, spaceQuantity);

            if (i != depth)
            {
                sb.append("\n");
            }
        }

        String string1 = sb.toString();
        String string2 = sb.reverse().toString();
        System.out.println(string1);
        System.out.println(string2);
    }

    private static void SpaceWriter(StringBuilder sb, int spaceQuantity) {

        for (int j = 0; j < spaceQuantity; j++) {
            sb.append(" ");
        }
    }
}
