package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Schreibe dein Passwort");
        Scanner input = new Scanner(System.in);
        String passwort = input.nextLine();
        System.out.println(WoertLaengeUndEineNummerImWort(passwort));
    }
    public static char[] nummern ={'1','2','3','4','5','6','7','8','9','0'};

    public static String WoertLaengeUndEineNummerImWort(String passwort) {
        int wortlaenge = passwort.length();
        if (zahlImWort(passwort)) {
            return "Dein Passwort muss mindestens eine Zahl enthalten";
        }


        if (wortlaenge >= 8 ) {
        return "Dein Passwort ist Gut";}

        else if (wortlaenge <= 8 ) {
            return "Das Wort hat zu wenig Buchstaben";
        }
        else return "Ungültige Eingabe";
    }
    public static boolean zahlImWort(String str) {
         return !str.matches(".*\\d.*");

    }
}
