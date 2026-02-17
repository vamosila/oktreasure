# OKTreasure

Ez a projekt az eredeti **"retreasure"** konzolos alkalmazás refaktorált változata, a tiszta kód (Clean Code) alapelveinek megfelelően.

## A program célja

A konzolos alkalmazás bekéri egy **műkincs nevét**, majd azt az aktuális **dátummal** együtt az `adat.txt` fájlba menti.

## A refaktorálás főbb pontjai

- **Felelősségek világos szétválasztása (MVC-szemlélet)**  
  Minden osztály egyetlen feladatra koncentrál:  
  - `MainController`: a program vezérlése  
  - `MainView`: a konzolos megjelenítés és adatbekérés  
  - `Treasure`: a műkincs adatmodellje (immutable)  
  - `FileHandler`: fájlba írás  
  
  Így minden osztálynak csak egy oka van a változásra (Single Responsibility Principle).

- Beszédes, önmagukat leíró elnevezések
- Magic stringek konstansokba szervezése
- Fájlkezelés `try-with-resources` használatával

## Projektadatok

- Refaktorálta: Vámosi László Ádám  
- Csoport: SZOFT II-N
- Dátum: 2026-02-17  
- Licenc: MIT  
