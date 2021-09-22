package qst7;

public class Calculations {
	float maior = -9999;
	float menor = 9999;
	float media = 0;
	float porc_f = 0;
	float porc_m = 0;
	int soma_f = 0;
	int qtd_f = 0;
	int qtd_m = 0;
	
	public void altura(float altura) {
		if(altura > maior) {
			maior = altura;
		}	
		if(altura < menor) {
			menor = altura;
		}			
	}
	
	public void qtd(char sexo, float altura) {	
		if(sexo == 'f') {
			soma_f += altura;
			qtd_f++;
		} else {
			qtd_m++;
		}
	}
	
	public void media_feminina() {
		media = soma_f/qtd_f;
	}
	
	public void porcentagem(int total) {
		porc_f = ((float)qtd_f/total)*100;
		porc_m = ((float)qtd_m/total)*100;
	}
	
	public void result() {
		System.out.println("Maior altura: "+ maior +", menor altura: "+ menor);
		System.out.println("Media da altura feminina: "+ media);
		System.out.println("Quantidade de homens: "+ qtd_m);
		System.out.println("Porcentagem masculina: "+ porc_m +", porcentagem feminina: "+ porc_f);
	}
}
