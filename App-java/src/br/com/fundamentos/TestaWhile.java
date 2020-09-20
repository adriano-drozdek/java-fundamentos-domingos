package br.com.fundamentos;

public class TestaWhile {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while (contador <= 2) {
			System.out.println("Contador -> " + contador);
			// contador = contador + 1;
			// contador += 1;
			contador++;
			
		}
        // System.out.println("Valor final do contador " + contador);
		
		System.out.println("Decremente");
		
		int decremento = 2;
		
		while (decremento >= 0) {
			System.out.println("Contador decremento" + decremento);
			decremento--;
		}
	}

}
