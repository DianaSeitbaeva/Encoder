package com.epam.encoder;

import static com.epam.encoder.LangKey.engToMorse;
import static com.epam.encoder.LangKey.morseToEng;

public class Converter {
    public static String convertEng(String input){
        StringBuilder output = new StringBuilder();
        for (Character x: input.toCharArray()) {
            output.append(engToMorse.get(x) + "/");
        }
        return output.toString();
    }
    public static String convertMorse(String input) {
        StringBuilder outputEng = new StringBuilder();
        String[] words = input.split("\\s{2}");
        for (String word : words) {
            outputEng.append(' ');
            String[] letters = word.split("\\s");
            for (String letter : letters) {
                outputEng.append(morseToEng.get(letter));
            }
        }
        return outputEng.toString();
    }

}
