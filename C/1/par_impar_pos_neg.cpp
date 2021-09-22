// 1-Determinar se um n�mero � par ou �mpar e positivo ou negativo.

#include <stdio.h>

int main() {
    int num;
    
    printf("Digite um numero: ");
    scanf("%d", &num);
    
    if(num%2 == 0 && num >= 0) {
    	printf("Par\n");
    	printf("Positivo");
	}else if(num%2 == 0 && num < 0){
		printf("Par\n");
    	printf("Negativo");	
	} else if(num%2 != 0 && num > 0){
		printf("Impar\n");
	    printf("Positivo");	
	} else if(num%2 != 0 && num < 0){
		printf("Impar\n");
	    printf("Negativo");	
	}	
			
    return 0;
}