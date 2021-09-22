// 6-Faça um algoritmo que lê uma temperatura em Fahrenheit e calcule a
// temperatura correspondente em Celsius. Ao final o programa deve exibir 
// as duas temperaturas.
// – Usar a fórmula:
// C = (5 * (F-32) / 9)

Program Temperatura;
var
    fah, cel : real;
Begin
    writeln('Informe a temperatura em Fahrenheit: ');
    readln(fah);
    
    cel := 5*((fah-32)/9);
    
    writeln('Temperatura em:');
    writeln('Fahrenheit: ', fah:6:2);
    writeln('Celsius: ', cel:6:2);
End.
