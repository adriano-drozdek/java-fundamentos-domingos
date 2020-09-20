package br.com.fundamentos;

public class TrabalhandoComPatinho {

	public static void main(String[] args) {
		int decremento = 5;
		
		while (decremento >= 0) {
			System.out.println( decremento+ " Patinho foram passear ");
			decremento--;
		}
	    
		
			int patinhos = 5;
			while (patinhos != 0) {
				
				if (patinhos != 1) {
					System.out.printf("%d patinhos foram passear\n", patinhos);
					System.out.println("Além das montanhas");
					System.out.println("Para brincar");
					System.out.println("A mamãe gritou: Quá, quá, quá, quá");
					System.out.printf("Mas só %d patinhos voltaram de lá.\n", --patinhos);
					System.out.println();
				} else {
					System.out.printf("%d patinho foi passear\n", patinhos);
					System.out.println("Além das montanhas");
					System.out.println("Para brincar");
					System.out.println("A mamãe gritou: Quá, quá, quá, quá");
					System.out.println("Mas nenhum patinho voltou de lá ");
					System.out.println();
					patinhos--;
				}

			}
			System.out.println("A mamãe patinha foi procurar");
			System.out.println("Além das montanhas");
			System.out.println("Na beira do mar");
			System.out.println("A mamãe gritou: Quá, quá, quá, quá");
			System.out.println("E os 5 patinhos voltaram de lá.");
		

			
				

	}

}
