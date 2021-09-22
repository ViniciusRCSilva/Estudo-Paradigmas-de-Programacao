// 3-Leia um número indeterminado de linhas contendo cada uma a idade de 
// um indivíduo.A última linha que não entrará nos cálculos, contém o valor da 
// idade igual a zero.
// Calcule e escreva a idade média deste grupo de indivíduos e escreva
// também a maior idade e a menor.

Program Idade_individuo;
var
    idade, soma, contador, maior, menor : integer;
    media : real;
Begin
    idade := 1;
    soma := 0;
    contador := 0;
    maior := -9999;
    menor := 9999;
    media := 0;
    
    while idade > 0 do 
    begin
        writeln('Digite a idade', contador+1,': ');
        readln(idade);
        soma := soma + idade;
        contador := contador + 1;
        
        if idade > maior then
            maior := idade;
        if (idade < menor) and (idade > 0) then
            menor := idade;
    end;
    
    media := soma / (contador-1);
    
    writeln('A idade media = ', media:6:2);
    writeln('Maior idade: ', maior, '| Menor idade: ', menor);
    
End.
