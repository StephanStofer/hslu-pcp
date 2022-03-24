%%%%%% Endrekursion, Memoization %%%%%%
%%%%%% predicates %%%%%%
fib_tr(N, F) :- fib_tr(N, 0, 1, F).
fib_tr(0, A, _, A).
fib_tr(N, A, B, F) :-
	N1 is N - 1,
	N1 >= 0,
	Sum is A + B,
	fib_tr(N1, B, Sum, F).

%%%%%% predicates %%%%%%

io_fib() :- 
    read_number(Nr),
    fib_tr(Nr,Result),
    write_line(Nr,Result).

read_number(Number) :-
    write("Gib eine Zahl ein: "),
    read(Number).

write_line(N, Res) :-
    write("Die "),
    write(N),
    write(" Fibonacci-Zahl ist "),
    write(Res).
