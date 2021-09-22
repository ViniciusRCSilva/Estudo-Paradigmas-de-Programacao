package qst2;

public class Properties {
	float nota1;
	float nota2;
	float nota3;
	float media;
	
	public float media() {
		media = (nota1 + nota2 + nota3) / 3;
		
		return media;
	}
	
	public void result() {
		if(media >= 6) {
			System.out.println("Media: " + media + ", aluno aprovado!");
		} else {
			System.out.println("Media: " + media + ", aluno reprovado!");
		}
		
	}
}
