# Übungsblatt 02
## 1. SOFTWAREENTWICKLUNGSMODELLE
**Erläutern Sie Vor- und Nachteile der folgenden Vorgehensmodelle zur Softwareentwicklung:**
* **Wasserfall-Modell**
  * WFM geht von sequentiellem Ablauf aus
    * Annahme: keine Korrekturen notwendig!
  * WFM läßt Vorgehen bei Problemen undefiniert
    * Design zeigt Unvollständigkeit der Analyse
    * Implementierung zeigt Auslassungen des Design auf
    * Testen deckt Fehler der Implementierung auf
  * Unterschätzt die Bedeutung von Veränderung
  * Iteriertes Wasserfallmodell als Konsequenz
    * Integriert Rückkopplungsschleifen
* **V-Modell**
  * Gefahr von Mißverständnissen
    * (ausführbarer) Code erst am Ende des Projekts
    * Gefahr kann tw. durch Prototypen begegnet werden
  * Gefahr sich ändernder Anforderungen
  * Je grundlegender ein Fehler, umso später wird er gefunden
    * Analysefehler in Einsatz & Wartung
    * Fehler im Entwurf im Integrationstest
    * Fehler im Feinentwurf im Modultest
  * Aber: V-Modell auch kompatibel mit anderen Prozessen: V-Modell XT (neue Versionen)
* **Spiralmodell**
* **Unified Process**

---
## 2. PROTOTYPING
**Erklären Sie die Begriffe “Vertikaler Prototyp” und “Horizontaler Prototyp”. Erläutern Sie, wann welche Art eingesetzt wird und warum. Welche Implementierung würden Sie für die Erstellung eines Online-Shops wählen? Begründen Sie Ihre Wahl.**

* Vertikaler Prototyp:
  * Umsetzung einer Kernfunktionalität
  * Auswahl kritischer Funktionalität
    * Machbarkeitstest
    * Effizienztest
    * Vergleich von Alternativen
    * Aufwandsabschätzung
  * Wenig Wert auf Ergonomie
  * Kann als “Pilotsystem” den Kern der zukünftigen Anwendung darstellen
  * Forschungsprototypen typischerweise vertikal
  * Reduzieren von Machbarkeitsrisiken
* Horizontaler Prototyp
  * Implementierung aller Funktionen einer Ebene
  * Auswahl der Ebene mit dem größten Risiko
    * Risiko für Mißverständnisse
    * Risiko für wechselnde Anforderungen
  * Erster Eindruck für den Kunden
  * In der Regel wird der Prototyp verworfen
    * Schnell “heruntergehackter” Code
    * Qualität kein Kriterium
    * Keine Dokumentation
  * Demonstrator z.B. GUI mit Beispieldaten
  * Reduziert das Risiko von Mißverständnissen

---
## 3. SOFTWAREENTWICKLUNGSMODELLE
**Sie sind Projekt-Manager für ein Software Projekt. Für die folgenden Aufgaben, welche der klassischen Entwicklungsmethoden würden Sie verwenden? Begründen Sie jeweils Ihre Entscheidung!**
 **a) Realisierung eines Tot-Mann-Schalters für den Zugfahrer. (Ein Tot-Mann-Schalter ist eine Sicherungsanlage, die jede Minute betätigt werden muss. Anderenfalls wird eine Notbremsung ausgeführt.)**
 **b) Sie arbeiten in einem kleinen Team mit Ihnen und zwei Mitarbeitern an einem neuen Sortierverfahren, dass in O(n) eine Liste sortieren kann.**
 **c) Ihr Kunde möchte von ihnen eine Website für sein Unternehmen entwickelt haben.**

---
## 4. BEDEUTUNG REQUIREMENTS ENGINEERING
**Welche Rolle spielt die Anforderungsanalyse in der Softwaretechnik? Welche potentiellen Gefahren gibt es, wenn man ohne Anforderungsanalyse einfach schon mal entwickelt? Nehmen Sie zur Beantwortung der Frage zu jedem Bild Stellung und beschreiben Sie Probleme und mögliche Lösungen.**
![Abbildung 1](Abbildung01.jpg)

---
