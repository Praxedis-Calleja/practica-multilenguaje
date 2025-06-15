% Convierte un número a lista de dígitos
numero_a_lista(N, Lista) :-
    number_chars(N, Chars),
    maplist(atom_number, Chars, Lista).

% Verifica si una lista es igual a su reverso
es_palindromo(N) :-
    numero_a_lista(N, Lista),
    reverse(Lista, Lista).
