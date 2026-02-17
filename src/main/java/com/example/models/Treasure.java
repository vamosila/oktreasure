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

package com.example.models;

import java.time.LocalDate;

public class Treasure {
    private final String name;
    private final LocalDate date;

    public Treasure(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
