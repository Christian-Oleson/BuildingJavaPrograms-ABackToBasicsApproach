package com.oleson;

public class Main {
    private static final int characterCountPerLine = 22;
    private static final int victoryMessageCount = 500000000;

    public static void main(String[] args) {
        WriteCharacterByQuantity(characterCountPerLine, '/');

        for (int i = 0; i < victoryMessageCount; i++) {
            WriteMessageAndTerminatingLine();
        }
    }

    private static void WriteMessageAndTerminatingLine() {
        WriteMessageWithinLineLength("Victory is mine!", characterCountPerLine);
        WriteCharacterByQuantity(characterCountPerLine, '\\');
    }

    private static void WriteMessageWithinLineLength(String message, int lineLength) {
        String sideBar = "||";
        int messageLength = message.length();
        int sideBarLength = sideBar.length();
        int countEmptySpacePerSideSize = (lineLength - (messageLength + (sideBarLength * 2))) / 2;
        String emptySpacePerSide = "";

        for (int i = 0; i < countEmptySpacePerSideSize; i++) {
            emptySpacePerSide += " ";
        }

        String finalMessage = sideBar + emptySpacePerSide + message + emptySpacePerSide + sideBar;
        System.out.println(finalMessage);
    }

    private static void WriteCharacterByQuantity(int count, char character){
        var sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        System.out.println(sb);
    }
}
