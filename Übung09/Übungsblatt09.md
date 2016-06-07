# Übungsblatt 09
## 1. SOFTWAREARCHITEKTURMUSTER
**Was sind Softwarearchitekturmuster?**
* Architekturmuster sind abstrakte Modelle verbreiteter und erprobter Softwarearchitekturen

**Inwiefern unterscheiden Sie sich von Entwurfsmuster und Ideome?**

| Architekturmuster | Entwurfsmuster | Ideome |
| ----------------- | -------------- | ------ |
| Schablone für Softwarearchitekturen | Gliederung der Teilsysteme in Logische Bestandteile | Lösungskonzepte auf Programmierebene |
| Globale Systemeigenschaften | Lösungen für Softwarearkomponenten | Namenskonventionen |
| Subsysteme/Trennschichten | Keine Auswirkung auf die Softwarearchitektur | Impementierungs-Pattern |

**Nennen Sie Beispiele für Entwurfsmuster und Ideome.**
* Entwurfsmuster:
  * singleton pattern
  * prototype pattern
  * builder pattern
* Ideome:
  * pointer to implementation idiom (c++)
  * d-zeiger idiom (c++)

---
## 2. SOFTWAREARCHITEKTURMUSTER
**In welche Kategorien lassen sich Architekturmuster einteilen?**
* Strukturierungsmuster (Pipes und Filter)
    * Filter (Komponenten)
        * Stellen Eingabe- und Ausgabestreams zur Verfügung
        * Lesen vom Eingabestream
        * Schreiben in den Ausgabestream
        * Jeder Filter transformiert autonom und unabhängig die Ein- zur Ausgabe
    * Pipes (Verbinder)
      * Verbinden Ausgabestreams mit Eingabestreams
    * z.B. Traditionelle Compiler
* Adaptive Systeme (Mikro Kernel)
  * z.B. Mikro Kernel
    * Kern mit Grundfunktionen
    * Erweiterungen um diesen Kern
* Verteilte Systeme (Client Server)
  * Ein Server bedient mehrere Clients
  * Server besitzt Gesamtfunktionalität
  * Client verfügt über einfache GUI
  * Kommunikation über serverseitiges User Interface
  * z.B. Browserbasierte Systeme (z.B. Outlook Web Access)
* Interaktive Systeme (Model-View-Controller)
  * Strukturierung der Mensch-Maschine-Interaktion
  * z.B. Model-View-Controller
    * Model
      * enthält nur Daten, keine Funktionalitäten auf diesen
      * Fassade stellt Daten nach außen zur Verfügung
    * Controller
      * führt Änderungen an Daten durch
      * Fassade stellt Funktionen auf Daten zur Verfügung
      * Enthält nur Darstellungslogik, keine Applikationslogik


**Nennen sie Vor- und Nachteile der jeweiligen Kategorie und erläutern Sie je ein Beispiel.**

| Strukturierungsmuster | Pipes und Filter |
| ----------------- | --- |
| Vorteil           | Einfache, verständliche Dekomposition |
|                   | Wiederverwendbarkeit einzelner Filter |
|                   | Erweiterbarkeit durch Austausch oder Hinzufügen von Filtern |
|                   | Filter sind Parallelisierbar |
| Nachteil          | Nicht für interactive Systeme geeignet |
|                   | Meistens nur primitive Datentypen in Streams |
|                   | Performanzprobleme |
|                   | Hohe Komplexität der Filter |

| Verteilte Systeme |     |
| ----------------- | --- |
| Vorteil           | Keine Installation/Wartung durch Benutzer |
|                   |  Hohe Flexibilität der Endgeräte |
|                   | Billige Clients (Thin-Clients, Web-Clients) |
| Nachteil          | Potentielles Bottleneck |
|                   | Single Point of Failure |
|                   | Hohe Rechenleistung am Server notwendig |

| Adaptive Systeme | Mikro Kernel |
| ----------------- | --- |
| Vorteil           | Kernel ist weitestgehend unabhängig |
|                   | Projektübergreifende Wiederverwendbarkeit |
| Nachteil          | Aufwendig zu erstellen, da allgemein Einsetzbar |

| Interaktive Systeme | Model-View-Controller |
| ----------------- | --- |
| Vorteil           | Austauschbarkeit in „der Tiefe“ |
|                   | Separierung von Abstraktionsgraden |
| Nachteil          | Controller wird sehr groß |
|                   | Seiteneffekte, wenn Funktionen des Controllers von mehreren Views benutzt wird|

---
## 3. MODEL-VIEW-CONTROLLER
**Das Model-View-Controller Prinzip ist eines der beliebtesten Architekturmuster der Softwaretechnik. Informieren Sie sich über das MVC Prinzip. Erläutern Sie es anhand eines selbstgewählten praktischen Beispiels. Inwiefern unterscheidet sich das MVC Prinzip vom Model-View-Presenter Prinzip?**
* Model:
  * enthält nur Daten, keine Funktionalitäten auf diesen
  * Fassade stellt Daten nach außen zur Verfügung
* Controller:
  * führt Änderungen an Daten durch
  * Fassade stellt Funktionen auf Daten zur Verfügung
* View:
  * Enthält nur Darstellungslogik, keine Applikationslogik

* Unterschied:
  * MVP hat für jeden View einen Presenter, kann also mehrere Views für ein Modell haben
  * MVC: Austauschbarkeit in „der Tiefe“
  * MVP: Austauschbarkeit „in der Breite“

---
## 4. WEITERE SOFTWAREARCHITEKTURMUSTER
**In der Vorlesung wurden verschiedene Softwarearchitekturen vorgestellt. Finden Sie 2 weitere Architekturmuster (nicht MVP) und beschreiben Sie diese.**

**Ermitteln Sie für die gewählten Muster Vor- und Nachteile sowie das Einsatzgebiet. Bereiten Sie zur besseren Präsentation Ihrer gewählten Muster einen Foliensatz vor, mit dem Sie das Muster vorstellen können.**
