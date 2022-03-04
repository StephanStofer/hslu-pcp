%%%%%% recursive multiplication %%%%%%

mult(_,0,0).
%mult(N,1,N).
mult(0,_,0).
%mult(1,M,M).
mult(N,M,P) :-
    N > 0, 
    N1 is N - 1,
    mult(N1,M,P1),
    P is M + P1.
    
