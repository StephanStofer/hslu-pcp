%%%%%% Verwandtschaftsbeziehungen %%%%%%
%%%%%% facts %%%%%%
female(mary). female(liz). female(mia). female(tina). female(ann). female(sue).% all females
male(mike). male(jack). male(fred). male(tom). male(joe). male(jim). % all males
parent(mary, mia). parent(mary, fred). parent(mary, tina). % all children of mary
parent(mike, mia). parent(mike, fred). parent(mike, tina). % all children of mike
parent(liz, tom). parent(liz, joe). % allchildren of liz
parent(jack, tom). parent(jack, joe). % all children of jack
parent(mia, ann). % all children of mia
parent(tina, sue). parent(tina, jim). % all childern of tina
parent(tom, sue). parent(tom, jim). % all childern of tom

%%%%%% predicates - exercise A %%%%%%

mother(M,C) :- parent(M,C), female(M). % get mother (M) of children (C)
father(F,C) :- parent(F,C), male(F). % get father (F) of children (C)
children(P,C) :- parent(P,C). % list all children (C) of parent (P)

%%%%%% predicates - exercise B %%%%%%

sibling(C1, C2) :- mother(M, C1), father(F,C1), mother(M, C2), father(F,C2). 

%%%%%% predicates - exercise C %%%%%%

grandmother(GM, GC) :- parent(X,GC),mother(GM,X).

%%%%%% predicates - exercise D %%%%%%

offspring(X,Y) :- children(Y,X).
offspring(X,Y) :- children(Y,Z),children(Z,X).

