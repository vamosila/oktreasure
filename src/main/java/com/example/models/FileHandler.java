/*
* File: FileHandler.java
* Author: Sallai András
* Copyright: 2026, Sallai András
* Group: szit.hu
* Date: 2026-02-15
* Github: https://github.com/oktatrefakt/
* Refaktorálva: Vámosi László Ádám, SZOFT II-N, 2026-02-17
* Licenc: MIT
*/

package com.example.models;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileHandler {
    private static final String FILE_NAME = "adat.txt";
    private static final Charset FILE_CHARSET = Charset.forName("utf-8");
    private static final String DELIMITER = ":";

    /* TODO: Beviteli ellenőrzés hozzáadása
    (pl. üres-e, DELIMITER karakter-e, hossza) */
    public static void writeFile(Treasure treasure) {
        try {
            tryWriteFile(treasure);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void tryWriteFile(Treasure treasure) throws IOException {
        try(FileWriter fileWriter = new FileWriter(FILE_NAME, FILE_CHARSET, true)) {
            fileWriter.write(formatLine(treasure));
        }
    }

    private static String formatLine(Treasure treasure) {
        return treasure.getName() + DELIMITER + treasure.getDate() + "\n";
    }

    public static String getFileName() {
        return FILE_NAME;
    }

}
