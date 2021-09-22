package qst5;

public class Properties {

	public float fahrenheit;
	public float celsius;

	public void conversao() {
		
		celsius = 5*((fahrenheit-32)/9);
	}
	
	public void result() {
		
		System.out.println("Temperatura em Fahrenheit: "+fahrenheit);
		System.out.println("Temperatura em Celsius: "+celsius);
	}
}
