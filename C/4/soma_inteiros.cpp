// 4-Faça um algoritmo que calcule a soma dos números inteiros de 1 a 100.

#include <stdio.h>

int main() {
	int soma = 0;
	
	// 1+2+3+4...+100
    for(int i=1; i<=100; i++) {
    	soma += i;
	}

	printf("Soma dos numeros inteiros de (1-100) = %d", soma);

    return 0;
}
