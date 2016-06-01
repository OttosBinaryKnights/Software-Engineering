# Übungsblatt 08
## 1. SINGLETON PATTERN
**Recherchieren Sie im Internet das Singleton-Pattern. Zeigen Sie anschließend anhand eines selbstgewählten Beispiels, wie Singeltons eingesetzt werden können und wofür sie benutzt werden.**

Das Singleton (selten auch Einzelstück genannt) ist ein in der Softwareentwicklung eingesetztes Entwurfsmuster und gehört zur Kategorie der Erzeugungsmuster (engl. creational patterns). Es stellt sicher, dass von einer Klasse genau ein Objekt existiert.

* Eigenschaften:
   * erzeugt und verwaltet das einzige Objekt der Klasse
   * bietet globalen Zugriff auf dieses Objekt über eine Instanzoperation (getInstance()).
   * die Instanzoperation eine Klassenmethode, das heißt statisch gebunden
   * das private Attribut „Instanz“ (instance) ein Klassenattribut, das heißt ein statisches Attribut.

 * Vorteile:
   * Zugriffskontrolle kann realisiert werden.
   * Das Singleton kann durch Unterklassenbildung spezialisiert werden.
   * Welche Unterklasse verwendet werden soll, kann zur Laufzeit entschieden werden.
   * Die Einzelinstanz muss nur erzeugt werden, wenn sie benötigt wird.
   * Sollten später mehrere Objekte benötigt werden, ist eine Änderung leichter möglich als bei globalen Variablen.

* Anwendungsbeispiele sind
  * ein zentrales Protokoll-Objekt, das Ausgaben in eine Datei schreibt.
  * Druckaufträge, die zu einem Drucker gesendet werden, sollen nur in einen einzigen Puffer geschrieben werden.

Das Singleton Entwurfsmuster sorgt dafür, dass es von einer Klasse nur eine einzige Instanz gibt und diese global zugänglich ist.

Damit es nur eine einzigartige Instanz gibt, muss eine Instanziierung durch den Client verhindert werden. Dafür wird der Konstruktur privat deklariert. Nun kann einzig der Singletoncode selbst das Singleton instanziieren.

Weiterhin definiert die Singletonklasse eine global verfügbare Methode, in der diese einzigartige Singletoninstanz zurückgegeben wird. In Java wird dies mit den Modifiern public und static erreicht. Der Singletoncode muss (in der Methode) sicherstellen, dass immer nur ein und dasselbe Objekte an den Client gelangt.
Beispielcode für ein Singleton Pattern

public class Singleton {

    //Field hält Referenz auf einzigartige Instanz
    private static Singleton instance;

    // Privater Konstruktur verhindert Instanziierung durch Client
    private Singleton(){
    }

    //Stellt Einzigartigkeit sicher. Liefert Exemplar an Client.
    //Hier: Unsynchronisierte Lazy-Loading-Variante
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //logic code
}

**Was ist der Unterschied zum Factory Pattern?**

A singleton pattern ensures that you always get back the same instance of whatever type you are retrieving, whereas the factory pattern generally gives you a different instance of each type.

---
## 2. DESIGN PATTERN
**Recherchieren Sie zwei weitere (keine aus der Vorlesung bzw. Übung) Design Patterns. Stellen Sie diese durch die in der Vorlesung gezeigte Struktur dar.**

| Pattern-Name:  | builder pattern |
| ------------- | ------------ |
| Pattern-Klassifikation: | Erzeugendes Pattern |
| Intention: | trennen der Konstruktion komplexer Objekte von deren Repräsentationen, wodurch dieselben Konstruktionsprozesse wiederverwendet werden können |
| Andere Namen: |  |
| Motivation: |  |
| Anwendbarkeit: |  |
| Struktur: |  |
| Beteiligte Objekte: |  |
| Zusammenarbeit: |  |
| Konsequenzen: |  |
| Implementierung: |  |
| Beispielcode: |  |
| Bekannte Verwendungen: |  |
| Verwandte Patterns: |  |

| Pattern-Name:  | abstract factory pattern |
| ------------- | ------------ |
| Pattern-Klassifikation: |  |
| Intention: |  |
| Andere Namen: |  |
| Motivation: |  |
| Anwendbarkeit: |  |
| Struktur: |  |
| Beteiligte Objekte: |  |
| Zusammenarbeit: |  |
| Konsequenzen: |  |
| Implementierung: |  |
| Beispielcode: |  |
| Bekannte Verwendungen: |  |
| Verwandte Patterns: |  |
 
| Pattern-Name: | multiton pattern |
| ------------- | ------------ |
| Pattern-Klassifikation: |  |
| Intention: |  |
| Andere Namen: |  |
| Motivation: |  |
| Anwendbarkeit: |  |
| Struktur: |  |
| Beteiligte Objekte: |  |
| Zusammenarbeit: |  |
| Konsequenzen: |  |
| Implementierung: |  |
| Beispielcode: |  |
| Bekannte Verwendungen: |  |
| Verwandte Patterns: |  |

| Pattern-Name:  | prototype pattern |
| ------------- | ------------ |
| Pattern-Klassifikation: |  |
| Intention: |  |
| Andere Namen: |  |
| Motivation: |  |
| Anwendbarkeit: |  |
| Struktur: |  |
| Beteiligte Objekte: |  |
| Zusammenarbeit: |  |
| Konsequenzen: |  |
| Implementierung: |  |
| Beispielcode: |  |
| Bekannte Verwendungen: |  |
| Verwandte Patterns: |  |

**Erstellen Sie ein zugehöriges Klassendiagramm und erläutern Sie deren Motivation und Funktionsweisen an einem selbstgewählten Beispiel.**

![prototype](Prototype.png)

**Für welche Anwendungsfälle ist das Pattern geeignet, für welche ungeeignet?**

---
## 3. ANTI-PATTERN
**Recherchieren Sie zwei weitere Anti Patterns (keine aus der Vorlesung). Erläutern Sie dessen Funktionsweise an einem selbstgewählten Beispiel.**

| Pattern-Name:  | Spaghetticode |
| ------------- | ------------ |
| Andere Namen: |  |
| Primäre Ebene: |  |
| Name der Lösung: |  |
| Typ der Lösung: |  |
| Hauptursachen: |  |
| Nicht-ausgeglichene Kräfte: |  |
| Symptome und Konsequenzen: |  |
| Verwandte Lösungen: |  |
| Mögliche Anwendungen: |  |

| Pattern-Name:  | Das Rad neu erfinden |
| ------------- | ------------ |
| Andere Namen: |  |
| Primäre Ebene: |  |
| Name der Lösung: |  |
| Typ der Lösung: |  |
| Hauptursachen: |  |
| Nicht-ausgeglichene Kräfte: |  |
| Symptome und Konsequenzen: |  |
| Verwandte Lösungen: |  |
| Mögliche Anwendungen: |  | 

**In welchen Fällen treten diese Antipatterns besonders häufig auf?**

* In der Regel entstehen Anti-Pattern wider besseres Wissen, durch mangelnde Erfahrung oder fehlende Qualifikation. Zu beobachten ist allerdings auch die bewusste Verfolgung in bestimmten Szenarien, um einen bestimmten Zweck zu erreichen. Die Auswirkungen des Auftretens von Anti-Pattern reichen von marginal bis unternehmenskritisch.

---
## 4. FUßBALLTIPPSPIEL
**Erweitern (oder Erstellen) Sie das Klassendiagramm des Fußballtippspiels in einem CASE Tool ihrer Wahl. Fügen Sie zwei Design Patterns ein oder erläutern Sie zwei der Patterns (sofern diese bereits in Ihrer Architektur enthalten waren) an diesem konkreten Beispiel. Begründen Sie, warum die entsprechenden Patterns sinnvoll in dem von Ihnen gewählten Kontext sind.**
