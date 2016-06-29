# Übungsblatt 11
## 1. FEHLERKATEGORIEN
**Nennen und beschreiben Sie die unterschiedlichen Fehlerkategorien, welche beim Schreiben von Code entstehen können. Geben Sie jeweils ein Beispiel für einen solchen Fehler an. Wie können diese Fehler behoben werden?**

| Fehlerkategorie | Beschreibung | Beispiel | Behebung |
| --------------- | ------------ | -------- | -------- |
| Compiler Error | Fehler in der Sprache, die den Compiler daran hindern das Programm zu übersetzen| fehlende endklammer, kein simicolon etc. | können automatisiert behoben werden |
| Laufzeitfehler | treten während der ausführung des Codes auf | durch null teilen | Auftretende Exception untersuchen und dann schrittweises Debugging |
| Logische Fehler | Programm verhält sich nicht so wie erwartet | Falsches Ergebnis, kein Ergebnis | Debug-Methoden, Programmierer muss verstehen was falsch war |



---
## 2. VERSION CONTROL SYSTEM
**Erläutern Sie den Begriff Versionskontrollsystem. Gehen Sie dabei auf den Unterschied zwischen zentralen und dezentralen Systemen ein. Wo liegen die jeweiligen Vorteile und Nachteile.**
* Grundidee: Verwende immer dieselben Dateien und Nutze eine Datenbank, um alle Versionen zu speichern.
* Vorteile:
  * Dateien heißen immer gleich ->Compile wesentlich einfacher
  * Alte Versionen können einfach wieder hergestellt werden
  * Unterschiede können angezeigt werden
  * Effiziente Frontends und Plugins für praktisch alle größeren IDEs
* zentrales System:
   * ist als Client-Server-System aufgebaut
   * der Zugriff auf ein Repository kann über Netzwerk erfolgen

* dezentrales System:
   * kein Konflikt bei gleichzeitiger Nutzung einer Datei
   * kein zentrales Repository


**Wofür können Versionskontrollsysteme eingesetzt werden und wo nicht.**

**Welches Versionskontrollsystem würden Sie persönlich einsetzten und warum?**
* Kommt auf das Projekt an, z.B.:
  * Diplomarbeit: lokale/zentrale Versionsverwaltung
  * Softwareprojekt mit Freunden: dezentrale Versionsverwaltung
  * Softwareprojekt einer Firma: zentrale Versionsverwaltung

---
## 3. ISSUE TRACKING
**Issue Tracking Systeme helfen bei der Projektkoordination und der Fehlerbehebung. Finden Sie zwei Vertreter dieser Systeme und vergleichen Sie diese mit dem Jira Issue Tracking von Atlassian. Wo liegen die Stärken und Schwächen der jeweiligen Systeme. Welches würden Sie aufgrund Ihrer Recherche benutzen?**

| System | Beschreibung | Stärken | Schwächen |
| ------ | ------------ | ------- | --------- |
| Jira Issue Tracking | | | |
| Bugzilla | | | |
| ITop | | | |

|   | Jira Issue Tracking | Bugzilla | ITop |
| --- | ----------------- | -------- | ---- |
| Basis | Java | Perl | PHP/JavaScript |
| Kosten | proprietär | freie Software | freie Software |
| Vorteile | flexible Architektur | Benutzung erfolgt über HTML-Oberfläche | es ist kostenlos |
|          | viele Unternehmensbereiche lassen sich abbilden | es ist kostenlos | beinhaltet eine Configuration Management Database |
|          | für viele Zwecke einsetzbar | auf jedem System lauffähig | sehr weitgehend an eigene Anforderungen anpassbar |
| Nachteile | nicht alle Funktionen einer spezialisierten Anwendung können in Jira 1:1 umgesetzt werden | unterstützt keinen Service-level agreement | |

---
## 4. LOGGING
**Vergleichen Sie zwei selbst gewählte Logging Frameworks mit dem log4j Framework von Apache. Gehen Sie insbesondere auf die Punkte Speicherbedarf, Bedienbarkeit sowie Vor- und Nachteile ein. Worin genau besteht der jeweilige Vorteil der einzelnen Frameworks. Welche Nachteile haben die Frameworks?**

| Framework | Speicherbedarf | Bedienbarkeit | Vorteile | Nachteile |
| --------- | -------------- | ------------- | -------- | --------- |
| log4j | | | | |
| | | | | |
| | | | | |



---
## 5. SOFTWAREMETRIKEN
**Softwaremetriken und andere statische Analysewerkzeuge können benutzt werden, um den Code auf potenzielle Schwachstellen hin zu überprüfen. Geben Sie jeweils ein Beispiel für eine Größenmetrik, eine Strukturmetrik sowie eine Komplexitätsmetrik. Erläutern Sie, wie sich diese Metrik berechnet und führen Sie die Berechnung an einem selbst gewählten Codebeispiel durch. Welche Vor- bzw. Nachteile hat die jeweilige Metrik? Wie können diese Metriken verfälscht werden?**

* Größenmetrik: Lines of Code (LOC)
  * Zeilen des Codes werden gezählt
  * verschiedene Varianten möglich
  * Alle Zeilen, ausführbarer Code, nur Kommentare, zeilen mit simicolon

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
* Alle Zeilen: 15
* ausführbarer Code: 12
* nur Kommentare: 0
* Zeilen mit Simicolon: 5

* Vorteile:
  * man erfährt die insgesammte Produktivität
* Nachteile:
  * Nicht immer klar was genau gezählt werden muss
  * erlaubt keine direkten Aussagen über die Effizienz der Programmierer

* Metrik verfälschbar durch falsches Zählen bzw. durch falsche Wahl der Zählweise

* Komplexitätsmetrik: McCabe Cyclomatic Cyclomatic Complexity (Hab ich auch unter Strukturmetrik gefunden)
  * basiert auf dem Kontrollflussgraphen
  * berechnet sich mit V(g) = Kanten - Knoten + 2
  * Fehler-Risiko:
   * V(g) > 10 : mittel
   * V(g) > 20 : hoch
   * V(g) > 50 : unbeherrschbar

![ControlFlow](/Übung10/ControlFlow2.jpg)
* V(g)= 14 - 11 + 2 = 5

* Vorteil:
  * Einfach zu berechnen
  * Ablaufkomplexität wird gemessen
* Nachteil:
  * Komplexität von Anweisungen bleibt unberücksichtigt




* Strukturmetrik:








---
## 6. BUILDSERVER
**Buildserver sind die logische Konsequenz aus Versionskontrollsystemen. Wozu sind Buildserver gut und was kann
damit alles automatisiert werden? Finden Sie zwei Vertreter dieser Systeme und vergleichen Sie diese mit dem
Jenkins/Hudson Buildsystem. Wo liegen die Stärken und Schwächen der jeweiligen Systeme. Welches würden Sie
aufgrund Ihrer Recherche benutzen?**

* Buildserver sind eine zentralisierte,stabile und zuverlässige Umgebung für Programmbuilds



| System | Beschreibung | Stärken | Schwächen |
| ------ | ------------ | ------- | --------- |
| Jenkins/Hudson | in Java geschrieben und läuft in beliebigen Java Servlet-Containern |  verfügt über eine REST-basierte Programmierschnittstelle zur Steuerung durch andere Programme | |
| | | wird mit minimalen Servlet-Middleware Winstone ausgeliefert, sofort auf Application servern lauffähig | |
| | | unterstützt verschiedene Build-Tools und automatische Testverfahren | |
| Bamboo | in java geschrieben | kommunikation mit server erfolgt über weboberfläche, dort kann man die builds konfigurieren | |
| | enthält alle Grundfunktionen eines Buildservers | erstellen von deployment-vorgängen möglich | |
| | | est ist möglich daten von Jenkins oder anderen Buildservern zu importieren | |
| | | integration mit jira möglich | |
| Apache Continuum | geschrieben in java | unterstütz versionsverwaltungssysteme | |
| | beinhaltet alle Grundfunktionen eines Buildservers | unterstützt verteilte und parallele builds | |
| | | Push-Builds sind möglich | |
