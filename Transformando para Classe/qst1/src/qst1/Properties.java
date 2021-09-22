package qst1;

public class Properties {
	// Atributos
	int value;
	
	// Métodos
	public String pi() {
		if(value%2 == 0) {
			return "Par";
		} else {
			return "Impar";
		}
	}
	
	public String pn() {
		if(value >= 0) {
			return "positivo!";
		} else {
			return "negativo!";
		}
		
	}

	public void result(){
		System.out.println("O numero digitado e : " + pi() + " e " + pn());
	}
}
