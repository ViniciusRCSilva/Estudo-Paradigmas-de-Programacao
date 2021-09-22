package qst2;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner ler_teclado = new Scanner(System.in);
		Properties aluno = new Properties();
		
		System.out.println("Digite a nota 1: ");
		aluno.nota1 = ler_teclado.nextFloat();
		System.out.println("Digite a nota 2: ");
		aluno.nota2 = ler_teclado.nextFloat();
		System.out.println("Digite a nota 3: ");
		aluno.nota3 = ler_teclado.nextFloat();
		
		aluno.media();
		
		aluno.result();
		
		ler_teclado.close();
	}

}
