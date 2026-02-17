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

//Alapértelmezett csomag, a com.example
package com.example;

/* Az osztály neve: Main */
public class Main {
    /**
     * Egyetlen belépésipont, amit a program futtat.
     * @param args
     */
    public static void main(String[] args) {
        /* Írjuk a képernyőre az alkalmazás címét */
        System.out.println("Műkincs tároló");
        //Statikus kol() függvény hívása
        Treasure.kol();
    } //main() vége
}