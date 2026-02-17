/*
* File: MainView.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-02-15
* Github: https://github.com/oktatrefakt/
* Refaktorálva: Vámosi László Ádám, SZOFT II-N, 2026-02-17
* Licenc: MIT
*/

package com.example.views;

import java.util.Scanner;

import com.example.models.Treasure;

public class MainView {
    private static final String APP_ENTITY = "Műkincs";
    private static final String APP_TITLE = APP_ENTITY + " tároló";

    private static final String APP_DESCRIPTION =
            "\nEz egy %s program, " +
            "amely a konzolon keresztül beolvassa a(z) %s nevet, " +
            "és a(z) %s fájlba menti azt az aktuális dátummal együtt.\n";
    
    private static final String INPUT_PROMPT = "\n" + APP_ENTITY + " neve: ";

    private static final String SAVE_MESSAGE = 
        "\nA(z) %s " + 
        APP_ENTITY.toLowerCase() + 
        " a(z) %s fájlba lett mentve %s dátummal.\n";

    public void printAppDescription(String fileName) {
        System.out.printf(
            APP_DESCRIPTION,
            APP_TITLE,
            APP_ENTITY.toLowerCase(),
            fileName
        );
    }

    // TODO: Scanner Charset (852) beállítása Windows terminál esetén
    public String inputFromConsole() {
        try(Scanner scanner = new Scanner(System.in)) {
            printInputPrompt();
            return scanner.nextLine();
        }
    }

    private void printInputPrompt() {
        System.out.print(INPUT_PROMPT);
    }
    
    public void printSaveMessage(Treasure treasure, String fileName) {
        System.out.printf(
            SAVE_MESSAGE, 
            treasure.getName(), 
            fileName, 
            treasure.getDate());
    }
}
