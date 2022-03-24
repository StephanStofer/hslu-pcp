%%%%%% color map %%%%%%
%%%%%% facts %%%%%%

n(red, green). n(green, red). n(yellow, red).
n(red, yellow). n(green, yellow). n(yellow, green).

%%%%%% predicate %%%%%%

colormap(LU, NW, OW, SZ, UR, ZG) :-
    UR = yellow,
    SZ = red,
    n(NW, OW), n(NW,LU),n(NW,UR),n(NW,SZ),
    n(OW,LU), n(OW,UR),
    n(ZG,LU), n(ZG,SZ).
