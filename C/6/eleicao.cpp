// 7-
// Uma eleição existem três candidatos identificados pelos números 1, 2 e 3. 
// Faça um algoritmo que compute o resultado de uma eleição. Inicialmente o 
// programa deve pedir o número total de votantes. Em seguida, deve pedir 
// para cada votante votar (informando o número do candidato) e ao final 
// mostrar o número de votos de cada candidato.

#include <stdio.h>
#include <stdlib.h>

int main(){

    int votantes, i,voto;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int votos_invalidos;


    printf("indique a quantidade de eleitores: ");
    scanf("%i",&votantes);

    system("cls");

    for(i = 0; i < votantes; i++){
        printf("votante %i\n",i+1);

        printf("digite 1 para votar no candidato c1");
        printf("\ndigite 2 para votar no candidato c2");
        printf("\ndigite 3 para votar no candidato c3");
        printf("\nvoto: ");
        scanf("%i",&voto);

        if(voto == 1){
            c1++;
        }else if(voto == 2){
            c2++;
        }else if(voto == 3){
            c3++;
        }else{
            votos_invalidos++;
        }
        system("cls");
    }

    printf("\nvotos do candidato 1: %i",c1);
    printf("\nvotos do candidato 2: %i",c2);
    printf("\nvotos do candidato 3: %i",c3);
    printf("\nvotos anulados: %i",votos_invalidos);

    return 0;
}

