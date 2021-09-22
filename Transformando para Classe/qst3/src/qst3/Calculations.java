package qst3;

public class Calculations {
	int maior = -9999;
	int menor = 9999;
	float media = 0;
	int soma = 0;
	
	public void maiorOuMenor(int idades) {
		if(idades > maior) {
			maior = idades;
		}
		if(idades < menor) {
			menor = idades;
		}	
	}
	
	public void somarIdades(int idades) {	
		soma += idades;
	}
	
	public void media(int qtd) {
		media = ((float)soma/qtd);
	}
	
	public void result() {
		System.out.println("Media das idades: "+ media);
		System.out.println("Maior idade: "+ maior);
		System.out.println("Menor idade: "+ menor);
	}
}
