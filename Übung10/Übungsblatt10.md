# Übungsblatt 10
## 1. TEST-DRIVEN DEVELOPMENT
**Beschreiben Sie das Vorgehen beim Test-Driven Development.**

* 1. „Überlege“ wünschenswertes Verhalten, das im Moment nicht vorhanden ist.
* 2. Schreibe einen Testfall der dieses Verhalten erzeugt (und somit auch fehlschlägt).
* 3. Schreibe Code der den Testfall nicht mehr fehlschlagen lässt.
* 4. Verbessere den Code durch Refactoring.

**Was Sind die Vor- bzw. Nachteile dieses Entwicklungsprozesses?**
 * Vorteile:
  * Bessere Fehlererkennung

* Nachteile:
  * Mehr Aufwand

**Wiestehen Siedazu? Begründen Sie Ihre Meinung.**
* Gutes Verfahren, kann jedoch je nach Größe zu Aufwendig werden.


---
## 2. BLACK-BOXES UND WHITE-BOXES
**Beschreiben Sie die Begriffe Black-Boxes und White-Boxes im Zusammenhang von Testdurchführungen mit Hilfe eines selbstgewählten Beispiels. Erklären Sie am Beispiel, wann welche Art des Testens besser geeignet ist.**

---
## 3. TESTABDECKUNG
**Gegeben ist die folgende Funktion. Erstellen Sie den Kontrollflussgraphen für diese Funktion.**

**Bestimmen Sie mithilfe des Kontrollflussgraphen die:
 a) ZyklomatischeKomplexität
 b) Test fälle für die Statement Coverage
 c) Test fälle für die Decision Coverage**

```
private int ggt(int zahl1, int zahl2) {
  if (zahl1 < 0) zahl1 = zahl1 * -1;
  if (zahl2 < 0) zahl2 = zahl2 * -1;
  while (zahl2 != 0) {
      if (zahl1 > zahl2) {
          zahl1 = zahl1 - zahl2;
      } else {
          zahl2 = zahl2 - zahl1;
      }
  }
return zahl1;
}
```

---
## 4. UNIT-TESTS
**Laden Sie sich die Klasse „MinMaxCalculator“ aus dem Downloadbereich herunter. Überprüfen Sie deren korrekte Funktionalität. Schreiben Sie dazu JUnit Tests. Versuchen Sie dabei, eine möglichst hohe Testabdeckung zu erreichen. Korrigieren Sie etwaige Fehler.**

*Hinweis:
JUnit ist bereits Teil der Eclipse Tools und kannüber New -> Other -> Java -> JUnit -> TestCase angelegtwerden. Es empfiehlt sich, Tests gesondert von der funktionalen Klasse zu lagern.*
