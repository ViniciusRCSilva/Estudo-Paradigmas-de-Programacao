// 8-Tem-se um conjunto de dados contendo a altura e o sexo (masculino, 
// feminino) de 50 pessoas. Fazer um algoritmo que calcule e escreva:
// • - a maior e a menor altura do grupo;
// • - a média de altura das mulheres;
// • - o número de homens;
// • - A porcentagem de homens e de mulheres. 

Program Votacao;
const
    MAX = 50;

type
    Pessoa = array [1..MAX] of record
    altura : integer;
    sexo : integer;
end;

var
    maior, menor, soma_f, qtd_f, qtd_m, i : integer;
    media, porc_f, porc_m : real;
    p : Pessoa;
Begin
    maior := -9999;
    menor := 9999;
    soma_f := 0;
    qtd_f := 0;
    qtd_m := 0;
    media := 0;
    porc_f := 0;
    porc_m := 0;
    
    FOR i := 1 to MAX do
    begin
        writeln('Digite a altura da pessoa ', i, ' em cm:');
        readln(p[i].altura);
        writeln('Digite o sexo da pessoa ', i, ' (1 - M / 2 - F):');
        readln(p[i].sexo);
    end;
    
    FOR i := 1 to MAX do
    begin
        if p[i].altura > maior then
            maior := p[i].altura;
        if p[i].altura < menor then
            menor := p[i].altura;
    end;
    
    writeln('Maior altura: ', maior, ' cm');
    writeln('Menor altura: ', menor, ' cm');

    FOR i := 1 to MAX do
    begin
        if p[i].sexo = 2 then
        begin
            soma_f := p[i].altura + soma_f;
            qtd_f := qtd_f + 1;
        end
        else
            qtd_m := qtd_m + 1;
    end;
    
    media := soma_f / qtd_f;
    
    writeln('Media das alturas femininas: ', media:6:2, ' cm');
    writeln('Numero de homens: ', qtd_m);
    
    porc_f := (qtd_f/MAX)*100;
    porc_m := (qtd_m/MAX)*100;
    
    writeln('Porcentagem feminina: ', porc_f:6:2, '%');
    writeln('Porcentagem masculina: ', porc_m:6:2, '%');
End.