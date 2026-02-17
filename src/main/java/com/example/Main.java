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

import com.example.controllers.MainController;
import com.example.views.MainView;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController(new MainView());
        mainController.startApp();
    }
}
