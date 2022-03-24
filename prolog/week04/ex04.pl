%%% 4. Problem Solver %%%

% b) relationship Solver
:- ensure_loaded('../week02/ex01.pl').
:- ensure_loaded('../../PCP-public-Code/Prolog/prolog6.pl').
:- use_module(library(http/http_client)).
:- use_module(library(http/http_json)).

% tests
% get: http_get('http://wherever.ch/pcp.txt', Reply, []).
% post: http_post('http://localhost:16316/test',json(['say hi to http post']),SolutionResponse,[]).
% better json parsing: json([firstPerson=FirstPerson, problemKey=ProblemKey, relationship=Relationship, secondPerson=SecondPerson]) - source R.Arnold

send_request(ProblemType, Id, Response) :-
    format(atom(RequestUrl), 'http://localhost:16316/problem/~s/~d',[ProblemType, Id]),
        http_get(RequestUrl, json(Response), []).

send_response(ProblemType, Id, Solution) :-
    format(atom(ResponseUrl), 'http://localhost:16316/problem/~s',ProblemType),
        http_post(ResponseUrl,json(json([solution=Solution,problemKey=Id])),_,[]).

solve(relationship, Id) :-
	send_request(relationship, Id, Reply),
    member(firstPerson=FirstPerson, Reply),
    member(problemKey=ProblemKey, Reply),
    member(relationship=Relationship, Reply),
    member(secondPerson=SecondPerson, Reply),
    handle_relationship_problem(Relationship, FirstPerson, SecondPerson, Solution),
    send_response(relationship, ProblemKey, Solution).

solve(sudoku, Id) :-
	send_request(sudoku, Id, Reply),
    member(sudoku=Sudoku, Reply),
    member(problemKey=ProblemKey, Reply),
    maplist(replace_0, Sudoku, Puzzle),
    Puzzle = [A,B,C,D,E,F,G,H,I],
    sudoku([A,B,C,D,E,F,G,H,I]),
    send_response(sudoku, ProblemKey, Puzzle).

handle_relationship_problem(Predicate, FirstPerson, SecondPerson, Result) :-
    call(Predicate, FirstPerson, SecondPerson), 
    !, Result = true.
    
handle_relationship_problem(_, _, _, Result) :-
   Result = false.
    
replace_0(Input, Output) :-
    maplist(replace, Input, Output).
    
replace(Zero, _) :-
    Zero = 0, !.

replace(No, No). 

% solve(relationship, 135).
% solve(sudoku, 875).
