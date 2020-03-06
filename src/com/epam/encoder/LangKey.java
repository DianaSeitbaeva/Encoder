package com.epam.encoder;

import java.util.Map;
import java.util.TreeMap;

public class LangKey {
    static Map<Character, String> engToMorse = new TreeMap<>();
    static Map<String, Character> morseToEng = new TreeMap<>();

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
        LangKey.morseToEng = morseToEng;
    }

    public static Map<Character, String> getEngToMorse() {
        return engToMorse;
    }

    public static void setEngToMorse(Map<Character, String> engToMorse) {
        LangKey.engToMorse = engToMorse;
    }

    }