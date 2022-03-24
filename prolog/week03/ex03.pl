%%%%%% Listen %%%%%%
%%%%%% predicates %%%%%%
add_tail(X,[],[X]).
add_tail(X,[Head|[]],[Head,X]).
add_tail(X,[Head|Tail],[Head|Result]) :- add_tail(X,Tail,Result).

% del([],_,[]).
% del([X],X,[]).
% del([X|Y],X,Y).
del(List, X, Result) :-
    del([Result|Tail],X,Result).