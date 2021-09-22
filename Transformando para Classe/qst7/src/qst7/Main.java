package qst7;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i;
		
		Scanner ler_teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas: ");
		int total = ler_teclado.nextInt();
		
		Person[] pessoas = new Person[total];
		Calculations calculo = new Calculations();
		
		for(i=0; i<total; i++) {
			pessoas[i] = new Person();
			System.out.println("Pessoa "+ (i+1));
			System.out.println("Altura da pessoa:");
			pessoas[i].setAltura(ler_teclado.nextFloat());
			System.out.println("Masculino ou Feminino? (m - f):");
			pessoas[i].setSexo(ler_teclado.next().charAt(0));
			
			while(pessoas[i].getSexo() != 'm' && pessoas[i].getSexo() != 'f') {
				System.out.println("Caracter indisponivel!");
				System.out.println("Masculino ou Feminino? (m - f):");
				pessoas[i].setSexo(ler_teclado.next().charAt(0));
			} 	
		}
		
		for(i=0; i<total; i++) {
			calculo.altura(pessoas[i].getAltura());
		}
		for(i=0; i<total; i++) {
			calculo.qtd(pessoas[i].getSexo(), pessoas[i].getAltura());
		}
		calculo.media_feminina();
		calculo.porcentagem(total);
		calculo.result();
		
		ler_teclado.close();
	}
}
