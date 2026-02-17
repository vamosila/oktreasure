/*
* File: Main.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-02-15
* Github: https://github.com/oktatrefakt/
* Refaktorálva: Vámosi László Ádám, SZOFT II-N, 2026-02-17
* Licenc: MIT
*/

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Műkincs tároló");
        String treasureName = Treasure.inputFromConsole();
        FileHandler.writeFile(treasureName);
    }
}
