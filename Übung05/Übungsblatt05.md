# Übungsblatt 05
## 1. ERMITTLUNG VON USE-CASES
**Erstellen Sie ein Use-Case Diagramm für das Fußballtippspiel. Identifizieren sie mindestens drei Stakeholders. Erstellen Sie mindestens 10 Use-Cases für diese Stakeholder. Verwenden Sie normale Assoziationen, <<extends>> sowie <<includes>> jeweils mindestens einmal.**

![Use-Case-Diagramm](UseCase.jpeg)

**Was ist der Unterschied zwischen den Assoziationen?**
Verbindungslinien in UML-Diagrammen werden Assoziationen genannt. Sie stellen Zusammenhänge zwischen Elementen an den Enden von Assoziationen dar.

Im Use-Case-Diagramm gibt es zwei Arten von Verbindungslinien:
* Die durchgezogene Verbindungslinie stellt eine Assoziation zwischen dem Akteur und einem Use-Case dar. Sie bedeutet, dass der Akteur den Use-Case in irgendeiner Form anwendet. Der Akteur tauscht also Informationen mit dem Use-Case aus. Das kann zum Beispiel bedeuten, dass er eine Funktion des Systems startet oder ihm von einer Funktion des Systems Daten ausgegeben werden.
* Die gestrichelte Verbindungslinie stellt eine Assoziation zwischen zwei Use-Cases dar. Da es zwei verschiedene Arten von Assoziationen zwischen Use-Cases gibt, wird neben die gestrichelte Verbindungslinie ein Schlüsselwort gesetzt. Schlüsselwörter in der UML, die zur Spezifizierung von Verbindungslinien oder anderen geometrischen Formen verwendet werden, werden immer zwischen doppelte spitze Klammern gestellt. Diese Schlüsselwörter werden in der UML Stereotypen genannt.
  * Eine include-Assoziation bedeutet, dass der Use-Case, von dem die Verbindungslinie ausgeht, den Use-Case einschließt, auf den die Verbindungslinie zeigt.
  * Eine extend-Assoziation bedeutet, dass der Use-Case, von dem die Verbindungslinie ausgeht, möglicherweise den Use-Case erweitert, auf den die Verbindungslinie zeigt. Der entscheidende Unterschied zwischen einer include- und extend-Assoziation ist also, dass bei der include-Beziehung der zweite Use-Case immer ausgeführt wird, bei der extend-Assoziation der zweite Use-Case in Abhängigkeit von Bedingungen im ersten Use-Case ausgeführt wird.

[Quelle](http://www.highscore.de/uml/usecasediagramm.html)


*Benutzen Sie ein CASE Tool (z. Bsp. https://www.eclipse.org/papyrus) für das Erstellen des Use-Case-Diagramms.*

---
## 2. COCKBURN TEMPLATE
**Stellen Sie mindestens 3 Use-Cases aus Aufgabe 1 mithilfe des Cockburn Templates dar. Erstellen Sie dabei sowohl Haupt- als auch Nebenerfolgsszenarios.**

* [Cockburn als PDF](Cockburn.pdf)
* [Cockburn mit Open Office](Cockburn.ods)
* [Cockburn in xls](Cockburn.xls)

---
## 3. COCOMO II
**Informieren Sie sich über das CoCoMo II Verfahren.**
* **Was sind die Unterschiede zu CoCoMo 81?**

  * Cocomo81:
    *  allgemeine (einmalige) Ermittlung der Kosten

  * CocomoII:

    *  3 Modelle (Application Composition, Early Design, Post-Architecture)
    *  neue Cost-Driver/Formeln
    *  neue IDE
    *  berücksichtigt OOP


* **Was sind Submodelle und wozu werden sie verwendet?**

  * Application Composition Modell:

    *  Früheste Phase der Schätzung (Prototypisierung)
    *  Nutzt "Objekt-Points" als Eingabe

  * Early Design Modell:

    *  Abschätzung des Aufwands vor Fertigstellung der Systemarchitektur
    *  Unadjusted Function Points oder KSLOC als Eingabe

  * Post-Architecture Modell:

    *  wird verwendet nach Entwicklung der gesamten Systemarchitektur
    *  Vor und während der Implementation

* **Was sind die Vor- und Nachteile des Verfahrens?**

  * Cons:
    *  hoher Aufwand für die Ermittlung der Koeffizienten
    *  Für kleinere Unternehmen mathematisch nicht aussagekräftigt

  * Pros:
    *  Simpel
    *  sehr fundierte Informationen sind einfach verfügbar

---
## 4. AUFWANDSSCHÄTZUNG
**Bestimmen Sie den Aufwand für die Erstellung des Fußballtippspiels durch intuitive Abschätzung.**

![Kostenrechnung](Kostenrechnung.jpg)
![Kostenrechnung](Projektplan.pdf)

**Bestimmen Sie anschließend die Kosten für das Fußballtippspiel basierend auf CoCoMo II. Hierzu können Sie ein Tool (z. Bsp. http://csse.usc.edu/tools/COCOMOII.php) verwenden.**

![COCOMOII](COCOMO.jpg)

**Begründen Sie Ihre Entscheidung für die einzelnen Faktoren. Sie können von 5000 zu erstellenden Codezeilen ausgehen. Nehmen Sie Mannmonatskosten von 3000$ an. Zur Vereinfachung muss Maintenance nicht betrachtet werden.**

**Vergleichen Sie Ihre Abschätzung mit den Ergebnissen des CoCoMo II Verfahrens. Welche sind realistischer?**
