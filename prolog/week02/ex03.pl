%%%%%% crossword puzzle %%%%%%
%%%%%% facts %%%%%%

word(n,e,u).
word(t,o,p).
word(t,o,t).
word(b,r,o,t).
word(g,r,a,u).
word(h,a,l,t).
word(a,l,l,e).
word(j,e,t,z,t).
word(s,a,g,e,n).
word(u,n,t,e,n).
word(z,e,c,k,e).

%%%%%% predicate %%%%%%

solution(L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12) :-
    word(L1,L2,L3,L4), % first horizontal line
    word(L5,L2,L6,L7), % first vertical
    word(L7,L8,L9,L10,L11), % second horizontal line
    word(L4,L12,L9). % second vertical
