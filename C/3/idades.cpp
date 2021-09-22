// 3-Leia um número indeterminado de linhas contendo cada uma a idade de 
// um indivíduo.A última linha que não entrará nos cálculos, contém o valor da 
// idade igual a zero.
// Calcule e escreva a idade média deste grupo de indivíduos e escreva
// também a maior idade e a menor.

#include <stdio.h>

#define MAX 100

int main() {
	int   idade = 1;
	int   soma = 0;
	int   contador = 0;
	int   maior = -9999;
	int   menor = 9999;
	float media = 0;
	
	do {
		printf("Digite a idade %d: ", contador+1);
		fflush(stdin);
		scanf("%d", &idade);
		contador++;
		soma += idade;
		
		if(idade > maior) {
			maior = idade;
		}
		if(idade < menor && idade > 0) {
			menor = idade;
		}	
		
	} while(idade > 0);
	
	media = soma / (contador-1);
	
	printf("Idade media = %.2f\n", media);
	printf("Maior idade = %d, menor idade = %d\n", maior, menor);
	
	return 0;
}
