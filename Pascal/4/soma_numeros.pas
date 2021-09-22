// 4-Faça um algoritmo que calcule a soma dos números inteiros de 1 a 100.

Program Soma_num;
var
    soma, i : integer;
Begin
    soma := 0;
    
    FOR i := 1 to 100 do
    begin
        soma := soma + i;
    end;
    
    writeln('Soma dos numeros inteiros de (1-100) = ', soma);
End.
