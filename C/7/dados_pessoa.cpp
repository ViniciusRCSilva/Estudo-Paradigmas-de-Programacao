// 8-Tem-se um conjunto de dados contendo a altura e o sexo (masculino, 
// feminino) de 50 pessoas. Fazer um algoritmo que calcule e escreva:
// • - a maior e a menor altura do grupo;
// • - a média de altura das mulheres;
// • - o número de homens;
// • - A porcentagem de homens e de mulheres. 

#include <stdio.h>
#define MAX 50

typedef struct {
	int altura;
	int sexo;
}Pessoa;

int main(){
	Pessoa p[MAX];
	int   maior = -9999;
	int   menor = 9999;
	int   soma_f = 0;
	int   qtd_f = 0;
	float media = 0;
	int   qtd_m = 0;
	float porc_f = 0;
	float porc_m = 0;
	
	for(int i=0; i<MAX; i++) {
		printf("Digite a altura da pessoa %d em cm: ", i+1);
		scanf("%d", &p[i].altura);
		printf("Digite o sexo da pessoa %d (1 - M / 2 - F): ", i+1);
		scanf("%d", &p[i].sexo);
	}

	printf("\n\n");

	for(int i=0; i<MAX; i++) {
		if(p[i].altura > maior) {
			maior = p[i].altura;
		} 
		if(p[i].altura < menor) {
			menor = p[i].altura;
		}
	}
	
	printf("Maior altura: %d cm\n", maior);
	printf("Menor altura: %d cm\n", menor);
	
	for(int i=0; i<MAX; i++) {
		if(p[i].sexo == 2) {
			soma_f += p[i].altura;
			qtd_f++;
		}else {
			qtd_m++;
		}
	}
	
	media = soma_f / qtd_f;
	
	printf("Media das alturas femininas: %.2f cm\n", media);
	
	printf("Numero de homens: %d\n", qtd_m);
	
	porc_f = ((float)qtd_f / MAX)*100;
	
	porc_m = ((float)qtd_m / MAX)*100;
	
	printf("Porcentagem feminina: %.1f%%\nPorcentagem masculina: %.1f%%\n", porc_f, porc_m);
	
    return 0;
}
