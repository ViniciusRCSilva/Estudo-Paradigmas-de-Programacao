// 7-
// Uma eleição existem três candidatos identificados pelos números 1, 2 e 3. 
// Faça um algoritmo que compute o resultado de uma eleição. Inicialmente o 
// programa deve pedir o número total de votantes. Em seguida, deve pedir 
// para cada votante votar (informando o número do candidato) e ao final 
// mostrar o número de votos de cada candidato.

Program Votacao;
var
    votantes, i, voto, c1, c2, c3, votos_invalidos : integer;
Begin
    c1 := 0;
    c2 := 0;
    c3 := 0;
    
    writeln('Indique a quantidade de eleitores: ');
    readln(votantes);
    
    FOR i := 0 to votantes-1 do
    begin
        writeln('Votante ', i+1);

        writeln('Digite 1 para votar no candidato c1');
        writeln('Digite 2 para votar no candidato c2');
        writeln('Digite 3 para votar no candidato c3');
        readln(voto);
        
        if voto = 1 then
            c1 := c1 + 1
        else 
            if voto = 2 then
                c2 := c2 + 1
            else
                if voto = 3 then
                    c3 := c3 + 1
                else
                    votos_invalidos := votos_invalidos + 1;
    end;
    
    writeln('Votos do candidato 1: ', c1);
    writeln('Votos do candidato 2: ', c2);
    writeln('Votos do candidato 3: ', c3);
    writeln('Votos anulados: ', votos_invalidos);
    
End.
