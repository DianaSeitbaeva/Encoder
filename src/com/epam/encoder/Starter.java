package com.epam.encoder;

public class Starter {
    public static void main(String[] args) {
        String x = "sos sos";
        String x1 = "... --- ... // ... --- ...";

        System.out.println("Convert to morse");
        System.out.println(EncodeKey.convertEng(x));
        System.out.println("Convert to english");
        System.out.println(EncodeKey.convertMorse(x1));
    }
}

