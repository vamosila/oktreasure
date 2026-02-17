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

//Importáljuk a Scanner-t:
import java.util.Scanner;

//Itt jön a bekérőosztály:
public class Treasure {
    /* A tényelges bekérés a kol megtódusban van */
    public static void call() {
        //TODO: Meg kell oldani, ogy Windows terminalban (852) működjön
        /* A try() szerkezet, nem egyenlő a try-catch szerkezettel.
        A try() szerkezet a zárójelben megnyitott fájlt automatikusan
        lezárja, ha try(){} blokk végetér. */
        try(Scanner g = new Scanner(System.in)) {
            System.out.print("Műkincs: ");
            String t = g.nextLine();

            Tame.csa(t);
            
        }
    }
}
