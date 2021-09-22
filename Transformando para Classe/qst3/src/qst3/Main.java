package qst3;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i;
		int total = 1000;
		int qtd = 0;
		
		Scanner ler_teclado = new Scanner(System.in);
		
		Person[] pessoas = new Person[total];
		Calculations calculos = new Calculations();
		
		for(i=0; i<total; i++) {
			pessoas[i] = new Person();
			System.out.println("Digite a idade "+ (i+1) +": ");
			pessoas[i].setIdade(ler_teclado.nextInt());
			qtd++;
			
			if(pessoas[i].getIdade() == 0) {
				qtd--;
				break;
			}
		}
		
		for(i=0; i<qtd; i++) {
			calculos.maiorOuMenor(pessoas[i].getIdade());
		}
		for(i=0; i<qtd; i++) {
			calculos.somarIdades(pessoas[i].getIdade());
		}
		calculos.media(qtd);
		calculos.result();
		
		ler_teclado.close();
	}
}
