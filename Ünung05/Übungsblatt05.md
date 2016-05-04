# Übungsblatt 05
## 1. ERMITTLUNG VON USE-CASES
**Erstellen Sie ein Use-Case Diagramm für das Fußballtippspiel. Identifizieren sie mindestens drei Stakeholders. Erstellen Sie mindestens 10 Use-Cases für diese Stakeholder. Verwenden Sie normale Assoziationen, <<extends>> sowie <<includes>> jeweils mindestens einmal.**

**Was ist der Unterschied zwischen den Assoziationen? Benutzen Sie ein CASE Tool (z. Bsp. https://www.eclipse.org/papyrus) für das Erstellen des Use-Case-Diagramms.**

---
## 2. COCKBURN TEMPLATE
**Stellen Sie mindestens 3 Use-Cases aus Aufgabe 1 mithilfe des Cockburn Templates dar. Erstellen Sie dabei sowohl Haupt- als auch Nebenerfolgsszenarios.**

---
## 3. COCOMO II
**Informieren Sie sich über das CoCoMo II Verfahren.**
* **Was sind die Unterschiede zu CoCoMo 81?**

* Cocomo81:
* *  allgemeine (einmalige) Ermittlung der Kosten
 
* CocomoII:

* *  3 Modelle (Application Composition, Early Design, Post-Architecture)
* *  neue Cost-Driver/Formeln
* *  neue IDE
* *  berücksichtigt OOP


* **Was sind Submodelle und wozu werden sie verwendet?**

* Was sind Submodelle:


* Application Composition Modell:

* *  Früheste Phase der Schätzung (Prototypisierung)
* *  Nutzt "Objekt-Points" als Eingabe

* Early Design Modell:

* *  Abschätzung des Aufwands vor Fertigstellung der Systemarchitektur
* *  Unadjusted Function Points oder KSLOC als Eingabe

* Post-Architecture Modell:

* *  wird verwendet nach Entwicklung der gesamten Systemarchitektur
* *  Vor und während der Implementation

* **Was sind die Vor- und Nachteile des Verfahrens?**

* Cons:

* *  hoher Aufwand für die Ermittlung der Koeffizienten
* *  Für kleinere Unternehmen mathematisch nicht aussagekräftigt

* Pros:

* *  Simpel
* *  sehr fundierte Informationen sind einfach verfügbar

---
## 4. AUFWANDSSCHÄTZUNG
**Bestimmen Sie den Aufwand für die Erstellung des Fußballtippspiels durch intuitive Abschätzung.**

**Bestimmen Sie anschließend die Kosten für das Fußballtippspiel basierend auf CoCoMo II. Hierzu können Sie ein Tool (z. Bsp. http://csse.usc.edu/tools/COCOMOII.php) verwenden.**

**Begründen Sie Ihre Entscheidung für die einzelnen Faktoren. Sie können von 5000 zu erstellenden Codezeilen ausgehen. Nehmen Sie Mannmonatskosten von 3000$ an. Zur Vereinfachung muss Maintenance nicht betrachtet werden.**

**Vergleichen Sie Ihre Abschätzung mit den Ergebnissen des CoCoMo II Verfahrens. Welche sind realistischer?**
