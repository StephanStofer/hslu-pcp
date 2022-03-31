# Programmierübung zu Clojure 1+2

## Interaktionsübungen mit REPL

### Aufgabe 1

Was fällt auf?

```clojure
(/ 1 (+ 1 1))
=> 1/2
(/ 1 (+ 1 (/ 1 (+ 1 1))))
=> 2/3
(/ 1 (+ 1 (/ 1 (+ 1 (/ 1 (+ 1 1))))))
=> 3/5
```

Darstellung als Bruch, strikte arithmetische Auswertung von links nach rechts

### Aufgabe 4

#### Temperaturen

```clojure
(cond
  (> temperatur 35) "heiss" (> temperatur 25) "warm" (> temperatur 15) "mittel" :else "kalt")
```

Nein, ändert Aussage, bzw. Range > 15 trifft auch auf andere Conditionals zu.

#### Teilbar

```clojure
(cond
  (zero? (rem zahl 2)) "durch 2 teilbar" (zero? (rem zahl 3)) "durch 3 teilbar" :else "weder durch 2 noch durch 3 teilbar")
```

Ja, ändert Aussage nicht, zwei voneinander unabhängige Conditionals.

### Aufgabe 4

```clojure

(defn toll [total-weight] (cond
                            (not (number? total-weight)) "Eingabe muss Zahl sein!" (<= total-weight 0) "Zahl muss größer 0 sein!"
                            (<= total-weight 1000) 20
                            (<= total-weight 2000) 30
                            (<= total-weight 5000) 50 
                            (<= total-weight 10000) 100 
                            :else 250))
```

#### Welchen Sinn haben die beiden ersten Klauseln?

Typprüfung, da Clojure dynamische Sprache

#### Begründen Sie, weshalb man hier die Reihenfolge der Klauseln nicht ändern darf
Falls es keine `number` ist, fällt Vergleich fehl.

#### Nennen Sie ein konkretes Beispiel, bei dem man die Klauseln ändern darf
Die Condition auf Range ändern `[lower upper]`

### Aufgabe 6

```clojure
(* (cond 
     (> a b) a 
     (< a b) b
         :else -1) 
   (+ a 1))
```
#### Handelt es sich um einen korrekten Clojure-Ausdruck? Begründung!
Ja sofern `a` und `b` definiert sind

#### Definieren Sie a und b jeweils so, dass alle Klauseln einmal zutreffen. Welche Ergebnisse erhalten Sie?
```clojure
(def a 3) (def b 2) ; cond 1
(def a 2) (def b 3) ; cond 2
(def a 2) (def b 2) ; cond 3
```

