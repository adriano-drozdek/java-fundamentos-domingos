package br.com.fundamentos;

public class ProgresaoGeometrica {

	public static void main(String[] args) {
		int inicial = 1;
		int quociente = 2;
		int gn = inicial;
		int valor_maximo = 32;
		
		System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_maximo);
		while (gn <= valor_maximo) {
			System.out.println(gn);
			gn*= quociente;
		
		}
	}

}
