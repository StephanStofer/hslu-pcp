package ch.hslu.pcp.sw8;

@FunctionalInterface
public interface TripleIntOperator {
    int apply(int first, int second, int third);
}


//   Sie haben in der Vorlesung gesehen, dass wir selber eigene funktionale Interfaces implementieren können. Wir sprechen auch von SAM-Typen, für "Single Abstract Method".
//   a) Programmieren Sie ein eigenes funktionales Interface mit dem Namen TripleIntOperator, welches drei int-Argumente nimmt.
//   b) Wie muss die entsprechende SAM-Methode von ihrem Interface heissen?
//   c) Von welchem Typ muss dabei die Rückgabe der abstrakten Methode gemäss Namenskonvention des funktionalen Interfaces sein?
//   d) Instanziieren Sie Ihren eigenen Operator mit einem Lambda-Ausdruck, welcher die Summe der drei Argumente zurück liefert. Vervollständigen Sie also folgende Zeile:
//   TripleIntOperator tio = ...
//   Testen Sie ihre Lambda-Implementierung, indem Sie die entsprechende Interface-Methode aufrufen, z.B. mit den Argumenten 1, 2 und 3.