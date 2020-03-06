package com.epam.encoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws IOException {
        String x = null;
        try (FileInputStream text = new FileInputStream(new File("C:/Users/Zim Evanse/IdeaProjects/Encoder/src/com/epam/encoder/eng.txt"))) {
            Scanner sc = new Scanner(text);
            x = sc.nextLine();
        }
        String x1 = null;
        try (FileInputStream text1 = new FileInputStream(new File ("C:/Users/Zim Evanse/IdeaProjects/Encoder/src/com/epam/encoder/morse.txt"))){
            Scanner sc1 = new Scanner(text1);
            x1 = sc1.nextLine();
            }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        System.out.println("Convert to morse");
        System.out.println(Converter.convertEng(x));
        System.out.println("Convert to english");
        System.out.println(Converter.convertMorse(x1));


    }
}

