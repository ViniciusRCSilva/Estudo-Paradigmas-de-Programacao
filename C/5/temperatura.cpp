// 6-Fa�a um algoritmo que l� uma temperatura em Fahrenheit e calcule a
// temperatura correspondente em Celsius. Ao final o programa deve exibir 
// as duas temperaturas.
// � Usar a f�rmula:
// C = (5 * (F-32) / 9)

#include <stdio.h>

int main(){

    float fah, cel;

    printf("informe a temperatura em fahrenheit: ");
    scanf("%f",&fah);

    cel = 5*((fah-32)/9);

    printf("\ntemperatura em:\nFahrenheit: %.2f\nCelsius: %.2f",fah,cel);

    return 0;
}

