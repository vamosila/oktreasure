/*
* File: MainController.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-02-15
* Github: https://github.com/oktatrefakt/
* Refaktorálva: Vámosi László Ádám, SZOFT II-N, 2026-02-17
* Licenc: MIT
*/

package com.example.controllers;

import java.time.LocalDate;

import com.example.models.FileHandler;
import com.example.models.Treasure;
import com.example.views.MainView;

public class MainController {
    private final MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;
    }

    public void startApp() {
        String fileName = FileHandler.getFileName();
        this.mainView.printAppDescription(fileName);
        Treasure treasure = createTreasureFromInput();
        saveTreasure(treasure);
        this.mainView.printSaveMessage(treasure, fileName);
    }

    private Treasure createTreasureFromInput() {
        return new Treasure(this.mainView.inputFromConsole(), LocalDate.now());
    }
    
    private void saveTreasure(Treasure treasure) {
        FileHandler.writeFile(treasure);
    }
}
