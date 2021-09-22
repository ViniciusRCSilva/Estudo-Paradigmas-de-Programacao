// 2-Ler três notas de um aluno, calcular a média e informar se ele foi aprovado 
// ou reprovado.

Program Media_aluno;
var
    nota1, nota2, nota3, media : real;
Begin
    writeln('Digite a primeira nota: ');
    readln(nota1);
    writeln('Digite a segunda nota: ');
    readln(nota2);
    writeln('Digite a terceira nota: ');
    readln(nota3);
    
    media := (nota1+nota2+nota3) / 3;
    
    if media >= 6 then
        writeln('Media:', media:6:2,' aluno aprovado!')
    else
        writeln('Media:', media:6:2,' aluno reprovado!');

End.
