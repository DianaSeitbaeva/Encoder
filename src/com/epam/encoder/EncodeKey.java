package com.epam.encoder;

import java.util.Map;
import java.util.TreeMap;

public class EncodeKey {
    private static Map<Character, String> engToMorse = new TreeMap<>();
    private static Map<String, Character> morseToEng = new TreeMap<>();

    static{
        engToMorse.put('a', "-.");
        engToMorse.put('b', "-...");
        engToMorse.put('c', "-.-.");
        engToMorse.put('d',"-..");
        engToMorse.put('e',".");
        engToMorse.put('f',"..-.");
        engToMorse.put('g',"--.");
        engToMorse.put('h',"....");
        engToMorse.put('i',"..");
        engToMorse.put('j',".---");
        engToMorse.put('k',"-.-");
        engToMorse.put('l',".-..");
        engToMorse.put('m',"--");
        engToMorse.put('n',"-.");
        engToMorse.put('o',"---");
        engToMorse.put('p',".--.");
        engToMorse.put('q',"--.-");
        engToMorse.put('r',".-.");
        engToMorse.put('s',"...");
        engToMorse.put('t',"-");
        engToMorse.put('u',"..-");
        engToMorse.put('v',"...-");
        engToMorse.put('w',".--");
        engToMorse.put('x',"-..-");
        engToMorse.put('y',"-.--");
        engToMorse.put('z',"--..");
        engToMorse.put(' ',"//");
    }
    static {
        morseToEng.put("-.", 'a');
        morseToEng.put("-...", 'b');
        morseToEng.put("-.-.", 'c');
        morseToEng.put("-..", 'd');
        morseToEng.put(".", 'e');
        morseToEng.put("..-.", 'f');
        morseToEng.put("--.", 'g');
        morseToEng.put("....", 'h');
        morseToEng.put("..", 'i');
        morseToEng.put(".---", 'j');
        morseToEng.put("-.-", 'k');
        morseToEng.put(".-..", 'l');
        morseToEng.put("--", 'm');
        morseToEng.put("-.", 'n');
        morseToEng.put("---", 'o');
        morseToEng.put(".--.", 'p');
        morseToEng.put("--.-", 'q');
        morseToEng.put(".-.", 'r');
        morseToEng.put("...", 's');
        morseToEng.put("-", 't');
        morseToEng.put("..-", 'u');
        morseToEng.put("...-", 'v');
        morseToEng.put(".--", 'w');
        morseToEng.put("-..-", 'x');
        morseToEng.put("-.--", 'y');
        morseToEng.put("--..", 'z');
        morseToEng.put("//", ' ');

        for(Map.Entry<String , Character> entry : morseToEng.entrySet()) {
            morseToEng.put(entry.getKey(), entry.getValue());
        }

        for(Map.Entry<Character, String> entry : engToMorse.entrySet()){
            engToMorse.put(entry.getKey(), entry.getValue());
        }
}

    public static Map<String, Character> getMorseToEng() {
        return morseToEng;
    }

    public static void setMorseToEng(Map<String, Character> morseToEng) {
        EncodeKey.morseToEng = morseToEng;
    }

    public static Map<Character, String> getEngToMorse() {
        return engToMorse;
    }

    public static void setEngToMorse(Map<Character, String> engToMorse) {
        EncodeKey.engToMorse = engToMorse;
    }

    public static String convertEng(String input){
        StringBuilder output = new StringBuilder();
        for (Character x: input.toCharArray()) {
        output.append(engToMorse.get(x) + "/");
        }
        return output.toString();
        }

    public static String convertMorse(String input) {
        StringBuilder output = new StringBuilder();
        String[] words = input.split("\\s{2}");
        for (String word : words) {
            output.append(' ');
            String[] letters = word.split("\\s");
            for (String letter : letters) {
                output.append(morseToEng.get(letter));
            }
        }
            return output.toString();
        }


        public static void pr () {
            for (Map.Entry<Character, String> entry : engToMorse.entrySet()) {
                System.out.println(entry.getValue() + "," + entry.getKey());
                engToMorse.put(entry.getKey(), entry.getValue());
            }
        }

        public static void pri () {
            for (Map.Entry<String, Character> entry : morseToEng.entrySet()) {
                System.out.println(entry.getKey() + "," + entry.getValue());
                morseToEng.put(entry.getKey(), entry.getValue());
            }
        }
    }