# Programmierübung zu Clojure 3+4

## Rekursive Datentypen

### 1. Aufgabe

Folgende Definitionen liegen vor:

```clojure
(def couple (list
              (cons "Adam" (cons "Eva" ()))
              (cons "Paul" (cons "Paula" ()))))
(def spec-list (list 1 (list 2 3 (list 5 7) 9)))
```

a) Welche Ergebnisse bringen folgende Funktionsaufrufe?

```clojure
(rest (first couple))
(first (rest couple))
(rest (rest couple))
(first (first (rest couple)))
(rest (first (rest couple)))
(empty? (rest (rest couple)))
```

```console
=> ("Eva")
=> ("Paul" "Paula")
=> ()
=> "Paul"
=> ("Paula")
=> true
```

b) Gibt es eine Kombination von first und rest an, mit der man den Wert 7 aus der `spec-list` herausfiltern kann?

```clojure
(rest (first (rest (rest (first (rest spec-list))))))
```

### 2. Aufgabe

Verallgemeinern Sie die Funktion redoubler (Folie Beispiel: Listen-Elemente verdoppeln) so, dass jedes Element einer Zahlen-Liste mit einem beliebigen Faktor
multipliziert wird.

### 3. Aufgabe

Untersuchen Sie die folgenden Funktionen. Was bewirken diese Funktionen? a)

```clojure

(defn f [a-list]
  (if (empty? a-list)
    ()
    (if (empty? (rest a-list))
      (first a-list)
      (f (rest a-list)))))
```

Gibt letztes Element zurück, egal welcher Datentyp

````console
(f (list 1 2 3 4))
=> 4
````

b)

```clojure
(defn g [a-list] (cond
                   (empty? a-list) ()
                   (empty? (rest a-list)) (first a-list)
                   :else
                   (if (> (first a-list) (g (rest a-list)))
                     (first a-list)
                     (g (rest a-list)))))
```

Findet grössten nummerischen Wert -> `max`

```console
(g (list 1 22 3 4))
=> 22
```

```clojure
(defn list-filter [rel-op a-list value]
  (cond
    (empty? a-list) () :else
    (cond
      (rel-op (first a-list) value)
      (cons (first a-list)
            (list-filter rel-op (rest a-list) value)) :else (list-filter rel-op (rest a-list) value))
    ))
```

a) Suche ein bestimmtes Symbol in einer Liste von Symbolen

b) Suche ein bestimmtes Zeichen in einer Liste von Zeichen

c) Suche einen bestimmten String in einer Liste von Strings

### 9. Aufgabe

a) Untersuchen Sie die folgende Funktion. Was macht die Funktionen genau?

````clojure
(defn a-op [a]
  (cond
    (>= a 0) + :else -))
````
Gibt ein ``+`` operator zurück wenn Eingabe grösser gleich 0 ist, sonst minus. Zum Beispiel führt Eingabe

````clojure
((a-op 3) 3 3)
````
zu 
````console
6
````