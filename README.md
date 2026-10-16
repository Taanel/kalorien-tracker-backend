# Kalorien-Tracker – Backend

Webanwendung zum Erfassen von Gerichten und Kalorien. Später können Nutzer:innen eintragen, was sie gegessen haben, ihr Tagesziel im Blick behalten und bekommen Gerichte vorgeschlagen, die noch in ihr Kalorienbudget passen.

Dieses Repository enthält das **Backend** (Spring Boot).

Projekt im Modul **Webtechnologien**, HTW Berlin, WiSe 2026/27.

## Team 04

- Thanh Lindemann
- Benjamin Voigt

Übung: 2. Zug, 2. Gruppe (Mo 13:45)

## Stand Milestone 1

- Entity `Gericht` mit den Attributen `name` und `kcal`
- GET-Route `/gerichte`, die eine Liste von Beispiel-Gerichten als JSON zurückgibt

## Starten

```bash
./gradlew bootRun
```

Danach im Browser: `http://localhost:8080/gerichte`

## Tech-Stack

Java 25 · Spring Boot 4.1 · Gradle
