# Aufgaben Woche 04

## Fibonacci-Zahlen Berechnen mit CLP-R

In der Vorlesung wurde erwähnt, dass die gezeigte Berechnung (Prädikat fib_clp/2) von
Fibonacci-Zahlen mit CLP-R ein Problem hat, wenn das zweite Argument von fib_clp/2 gar keine
Fibonacci-Zahl ist (siehe Prolog 5, Folie 31). Dasselbe Problem tritt auch auf, wenn zu einer
gegeben Fibonacci-Zahl nach der ersten, korrekten Antwort weitere Lösungen (durch drücken von ; bzw.
der Leerschlagtaste) gesucht werden. a) Wie manifestiert sich dieses Problem in SWI-Prolog?

Stackoverflow

```console
ERROR: Stack limit (1.0Gb) exceeded
ERROR:   Stack sizes: local: 0.1Gb, global: 0.6Gb, trail: 33.0Mb
ERROR:   Stack depth: 39, last-call: 18%, Choice points: 719,682
ERROR:   In:
ERROR:     [39] class:attr_unify_hook(<compound class/5>, _150423614)
ERROR:     [38] '$attvar':uhook(class, <compound class/5>, _150423642)
ERROR:     [37] '$attvar':call_all_attr_uhooks(<compound att/3>, _150423668)
ERROR:     [36] '$attvar':'$wakeup'(<compound wakeup/3>)
ERROR:     [35] bv_r:equate([length:1], _150423718)
ERROR: 
ERROR: Use the --stack_limit=size[KMG] command line option or
ERROR: ?- set_prolog_flag(stack_limit, 2_147_483_648). to double the limit.
```

b) Wieso tritt dieses Problem auf?

Prolog sucht rekursiv Lösungen, findet aber keine weil die Rekursionsbasis nicht erreicht wird

c) Lässt sich das oben beschriebene Problem einfach beheben?

Zusätzlicher Contraint `F+1 >= N`

## Rätsel

a) Lösen Sie mit Hilfe von CLP in Prolog das folgende Rätsel:
"Die Tochter ist 15 Jahre alt, die Mutter dreimal so alt. In wie vielen Jahren wird die Mutter nur
noch doppelt so alt sein wie ihre Tochter?"

```prolog
use_module(library(clpr)).
{ T = 13, M = 3*T, M + X = (T + X) *2 }.
```