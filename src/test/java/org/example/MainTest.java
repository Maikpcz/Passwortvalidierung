package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void woertLĂ¤ngeWenigerAlsAcht() {
        String actual = Main.WoertLaengeUndEineNummerImWort("Hallo1");
        assertEquals(actual, "Das Wort hat zu wenig Buchstaben");

    }
@Test
    void woertLĂ¤ngeMehrAls8() {
        String actual = Main.WoertLaengeUndEineNummerImWort("Hallo World1");
        assertEquals(actual, "Dein Passwort ist Gut");

    }
    @Test
    void DasPasswortBrauchteineZahl() {
        boolean actual = Main.zahlImWort("Halloworld1");
        assertEquals(actual, false);
    }

    @Test
    void DeinPasswortHatEineZahl() {
        boolean actual = Main.zahlImWort("HelloWorld");
        assertEquals(actual, true);
    }
}