package br.com.fundamentos;

public class ProgressaoAritimeticaWhile {

	public static void main(String[] args) {
		int inicial = 1;
		int razao = 3;
		int an= inicial;
		int valor_maximo = 20;
		
		System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n ", inicial, razao, valor_maximo);
	    while (an <= valor_maximo) {
	    	System.out.println(an);
	    	an += razao;
	    }
	}

}
