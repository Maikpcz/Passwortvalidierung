package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void woertLängeWenigerAlsAcht() {
        String actual = Main.WoertLaengeUndEineNummerImWort("Hallo");
        assertEquals(actual, "Das Wort hat zu wenig Buchstaben");

    }
@Test
    void woertLängeMehrAls8() {
        String actual = Main.WoertLaengeUndEineNummerImWort("Hallo World");
        assertEquals(actual, "Dein Passwort ist Gut");

    }
    @Test
    void DasPasswortBrauchteineZahl() {
        boolean actual = Main.zahlImWort("HalloOworld");
        assertEquals(actual, false);
    }

    @Test
    void DeinPasswortHatEineZahl() {
        boolean actual = Main.zahlImWort("HelloWorld1");
        assertEquals(actual, true);
    }
}