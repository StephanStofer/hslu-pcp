%%% 2. Anwendung der Negation: Mengen-Differenz %%%


% set_difference([a, b, c, d], [b, d, e, f], [a, c]).
% true.
% set_difference([1, 2, 3, 4, 5, 6], [2, 4, 6], L). 
% L = [1, 3, 5] .

% simple case, leere Liste und irgendwas -> Set ist leer
set_difference([],_,[]).

% Head von Set1 ist nicht in Set2
set_difference([Head1 | Tail1], Set2, [Head1 | TailResult]) :-
    \+member(Head1, Set2),
    set_difference(Tail1, Set2, TailResult).

% Head von Set1 ist in Set2
set_difference([Head1 | Tail1], Set2, Result) :-
    member(Head1, Set2),
    set_difference(Tail1, Set2, Result).