package br.com.fundamentos;

public class TrabalhandoComVariaveis {
	public static void main(String[] args) {
		/*tipos de dados primitivos
		 * https://medium.com/@mauriciogeneroso/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5
		 */
		int quantidade;      // Declarando variavel inteiro
		quantidade = 10;     // Atribuindo valor 10
		
		System.out.println(quantidade);
		
		quantidade = 15;
		
		System.out.println(quantidade);
		
		double numeroComvirgula;
		numeroComvirgula = 1.3; 
		
		System.out.println("Numero decimal -> " + numeroComvirgula);
		
		float numeroComvirgulaPontoFlutuante = 1.5f;
		System.out.println("Numero decimal com float -> " +  numeroComvirgulaPontoFlutuante );
		
		long numeroInteiroGrande = 25l;
		System.out.println("Numero inteiro com long -> " + numeroInteiroGrande);
		
		double precoProduto = 9.43;
		
		boolean alunoMatriculado = true;
		boolean clienteBloqueado = false;
		
		char turmaAluno1 = 'A';
		char tipoCliente = '2';
		char simbolo = '@';
		
		String nomePessoa = "Adriano";
        
		long populacaoUberlandia = 650000;
		System.out.println(populacaoUberlandia);
		
		long populacaoMundial = 70000000l;
		System.out.println(populacaoMundial);
		
		float saldoConta = 1030.43f;
		System.out.println(saldoConta);
	}

}
