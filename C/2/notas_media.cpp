// 2-Ler três notas de um aluno, calcular a média e informar se ele foi aprovado 
// ou reprovado.

#include <stdio.h>

int main(){

    float nota1, nota2, nota3, media;
	
	printf("Digite a primeira nota: ");
    scanf("%f",&nota1);
    printf("Digite a segunda nota: ");
    scanf("%f",&nota2);
    printf("Digite a terceira nota: ");
    scanf("%f",&nota3);

    media = (nota1+nota2+nota3)/3;

    if(media >= 6){
        printf("media: %.2f\taluno aprovado!",media);
    }else{
        printf("media: %.2f\taluno reprovado!",media);
    }
    return 0;
}
