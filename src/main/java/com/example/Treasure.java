/*
* File: Treasure.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-02-15
* Github: https://github.com/oktatrefakt/
* Refaktorálva: Vámosi László Ádám, SZOFT II-N, 2026-02-17
* Licenc: MIT
*/

package com.example;

import java.util.Scanner;

public class Treasure {
    public static String inputFromConsole() {
        String treasureName;
        // TODO: Scanner Charset (852) beállítása Windows terminál esetén
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Műkincs neve: ");
            treasureName = scanner.nextLine();
        }
        return treasureName;
    }
}
