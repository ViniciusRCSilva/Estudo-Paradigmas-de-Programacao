package qst1;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        Scanner ler_teclado = new Scanner(System.in);
        Properties number = new Properties();
        
		System.out.println("Digite em valor: ");
        number.value = ler_teclado.nextInt();
		
		number.pi();
		number.pn();
		number.result();

		ler_teclado.close();
	}

}
