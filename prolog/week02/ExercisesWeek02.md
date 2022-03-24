# PCP - Exercises semester week 02

## prerequisites

Install swi-prolog

```console
brew install swi-prolog
```

run swi-prolog in cli
```console
swipl
```

## exercise 01

run following commands to check and execute solution.

```prolog
['ex01.pl'].
```

**A**

```prolog
listing(mother).  
listing(father).  
mother(X,tina).  
father(X,sue).  
father(X,jim).  
mother(X,jim).  
mother(mary,Y).
```

**B**

```prolog
listing(sibling).
sibling(mia,fred).
```

**C**

```prolog
listing(grandmother).
grandmother(X,ann).
grandmother(liz,Y).
```

**C**

```prolog
listing(offspring).
offspring(ann,mary).
offspring(sue,Y).
```

## exercise 02

hope it's readable :see_no_evil:

[solution02.pdf](ex02.pdf)

## exercise 03

run following commands to check and execute solution.

```prolog
['ex03.pl'].
listing(solution).
solution(L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12).
```

## exercise 04

There is one solution to the given problem.

run following commands to check and execute solution.

```prolog
['ex04.pl'].
listing(colormap).
colormap(LU,NW,OW,SZ,UR,ZG).
```

## exercise 05

run following commands to check and execute solution.

```prolog
['ex05.pl'].
op(1150, xfx, mother).
liz mother X.
op(1150, xfx, offspring).
ann offspring mike.
```

## exercise 06

run following commands to check and execute answers.

**A**

```prolog
X is 16 / 4 / 2.
```

Output: `X=2`

`/` has stronger precedence than `is` but includes type `yfx`. means, right operand of `/` must be a
value. terms get evaluated from left to right -> (16 / 4) / 2 = 2

**B**

```prolog
Y = 3, X = Y - 1.
```

Output: `Y=3, X=3-1.

**C**

```prolog
Y = 3, X is Y - 1.
```

Output: `Y=3, X=2.`

result of **B** to **C** divers because operand `=/2` only unify the terms instead of `is` which
evaluates arithmetic expressions.

## exercise 07

run following commands to check and execute answers.

**A**

```prolog
['ex07.pl'].
mult(3,4,X).
mult(3,4,11).
mult(3,0,X).
mult(0,8,X).
mult(1,8,X).
mult(99,1,X).
```

**B**

I had this when one of the factors where `1` only. To solve the issue I disabled the rule for
parameters with value `1` and change if-clause to `N > 0` than `N > 1`.

