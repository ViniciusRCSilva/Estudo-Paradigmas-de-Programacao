package qst5;

import java.util.Scanner;

public class Temperature {

	
	public static void main(String[] args) {
		
		Scanner ler_teclado = new Scanner(System.in);
		Properties valores = new Properties();
		
		System.out.println("Digite o valor da temperaturea em Fahrenheits: ");
		valores.fahrenheit = ler_teclado.nextFloat();
		
		valores.conversao();
		valores.result();
		
	}
}
