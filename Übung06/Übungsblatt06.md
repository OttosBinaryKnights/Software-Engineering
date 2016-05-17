# Übungsblatt 06
## 1. KONZEPTE IDENTIFIZIEREN
**Identifizieren Sie systematisch am Beispiel des Use Cases „Bestellung von reduzierten Artikeln“, die in ihm vorkommenden Konzepte. Sollten Sie diesen Use-Case noch nicht erstellt haben, so muss dieser zuvor entsprechend dem Cockburn-Template erstellt werden.**

| Use Case | Bestellung von reduzierten Artikeln |
| -------- | ----------------------------------- |
| Charakteristische Informationen | Ziel im Kontext: Nutzer kann eine Bestellung abgeben, nachdem er über das Tippspiel Rabatt bekommen hat Spielraum: kein Level: Primäraufgabe Vorbedingungen: User hat sich angemeldet und ein erfolgreiches Tippspiel absolviert Endbedingung: einen Rabatt wurde auf den Preis angerechnet und das Produkt kann zu diesem Preis erworben werden Mögliche Fehler: falscher Rabatt ausgewählt Primärnutzer: jeder Nutzer, der am Tippspiel teilnimmt und erfolgreich getippt hat Einstellung (Trigger): Endnutzer ruft den Warenkorb auf und möchte seine Bestellung abgeben |
| Haupterfolgsszenario | 1) Endnutzer möchte einen Tipp bei einem Spiel seiner Wahl abgeben und öffnet die Tippseite 2) Die Tippseite wird mit den jeweiligen Spielen an diesem Spieltag geladen 3) Der Tipper kann dort Ziffern eintragen, die dann gewertet werden 4) Die Eingabe muss bestätigt werden 5) Die Eingaben werden in einer Datenbank abgelegt 6) Der Tipp kann nun auf Produkte übertragen werden 7) Der Endnutzer kann nun Produkte auswählen 8) Der Endnutzer kann nun Produkte mit Rabatt bestellen |
| Erweiterungen | Verlosung einzelner Produkte bei hohem Tipperfolg |
| Untervarianten |   |
| Verbundene Informationen |   |
| Priorität | Top-Priorität |
| Performanceziel | Eingabeseite 1s, Ablage in DB 1s, Bestellabwicklung 5s Frequenz: 20% der Standardeinkäufer + 5% Neukunden |
| Weg zum Nutzer | GUI |
|Offene Probleme |     |
| Date |               |

* **Wenden Sie die Nominalphrasen-Methode auf den Use Case an.**

  * Nutzer kann Bestellung abgeben
  * Nutzer bekommt Rabatt
  * Produkt kann erworben werden
  * Tipper kann Zahlen eintragen
  * Tipp wird auf Produkte übertragen

* **Sortieren Sie anschließend ihre Konzepte in eine Konzeptkategorienliste.**

| Kategorie | Konzept |
| :-------: | ------- |
| Physische Objekte |  |
| Transaktionen |      |
| Externe (Computer-)Systeme |   |
| Organisationen |     |
| Interne Datensätze |    |
| Externe Datensätze |    |
| Nutzer |             |   
| Rollen |             |
| Ereignisse |         |

* **Identifizieren Sie anhand der vorgestellten Verfahren die irrelevanten Konzepte.**

* **Erstellen Sie ein Glossar der Konzepte mit Synonymen und Konzeptbeschreibungen.**

---
## 2. KLASSENDIAGRAMM
**Modellieren Sie nun die Konzepte aus Aufgabe 1 als Konzeptklassen in einem Klassendiagramm bzw. Konzeptmodell.**
*Hinweis: Das Klassendiagramm ist mit ein Modellierungstool zu erstellen.*

---
## 3. ASSOZIATIONEN
**Erläutern Sie anhand ihres Konzeptmodells in Aufgabe 2, an welchen Stellen Assoziationen der Verwendung von Attributen vorzuziehen wären bzw. warum Sie Assoziationen statt Attributen gewählt haben.**
