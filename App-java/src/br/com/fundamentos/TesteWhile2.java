package br.com.fundamentos;

public class TesteWhile2 {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {

			
			total = total + contador;

			System.out.println("Contador " + contador);

			contador++;
		}
       System.out.println("Resultado da soma de 1 até 10 = " + total);
	}

}
