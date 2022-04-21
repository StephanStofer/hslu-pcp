# PCP-Übung zu Java 8, Teil 1 + 2 (Woche 8)

## 1 Default-Methoden & Mehrfach Vererbung

### Aufgabe a - Was gibt das Programm aus, wenn die main-Methode der Klasse `Exercise1` aufgerufen wird?

Printout des SpecificInterface.

### Aufgabe b - Die beiden Interfaces `GeneralInterface` und `SpecificInterface` implementieren beide die Methode public void doIt() und die Klasse `Exercise1` implementiert beide Interfaces. Warum führt dies zu keinen Problemen mit Mehrfachvererbung?

`GeneralInterface` überschreibt die **geerbte** Methode vom `SpecificInterface` weshalb es keine Konflikte auftreten.

### Aufgabe c - Angenommen, beim `SpecificInterface` würde `extends GeneralInterace` gestrichen. Gäbe es dann ein Problem mit Mehrfachvererbung? Falls Ja: Wie könnte dieses behoben werden? Falls Nein: Begründen Sie Ihre Antwort.

Nein, die `GeneralInterface` Methode müssete aber implementiert werden.

````java
@Override
public void doIt() {
    GeneralInterface.super.doIt();
}
````

## 2. Iterable.forEach: Zahlen und Quadratzahlen ausgeben

