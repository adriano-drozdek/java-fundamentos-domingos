package br.com.fundamentos;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
		System.out.println(str);
		String valor = "Trabalhando com String";

		/*
		 * -> charAt o nosso primeiro método é bem simplies e consiste emretornar apenas
		 * um caractere em determinada posição de nossa String.
		 * 
		 */

		System.out.println(valor.charAt(0));

		System.out.println(valor.codePointAt(0));

		String treinamento = "Treinamento com String";
		System.out.println(treinamento.compareTo("Treinamento com String") == 0 ? true : false);
		System.out.println(treinamento.compareTo("TREINAMENTO COM STRING") == 0 ? true : false);
		System.out.println(treinamento.compareToIgnoreCase("TREINAMENTO COM STRING") == 0 ? true : false);

		System.out.println(treinamento.endsWith("Treinamento"));
		System.out.println(treinamento.startsWith("Trei"));
		System.out.println(treinamento.startsWith("I", 3));
		
		System.out.println("Tamanho da String -> " + treinamento.length());
        
		
		// FOREACH  exclusivo para percorrer objetos.
		for (char c : treinamento.toCharArray()) {
			System.out.println("Char:" + c);
		}
		// Outra opçaõ de quebrar e percorrer um objeto, mais indicado usar o FOREACH
		for (int i = 0; i < treinamento.length(); i++) {
			char c = treinamento.toCharArray()[i] ;
			System.out.println(c);
			
		}
		
		for (byte b : treinamento.getBytes()) {
			System.out.println(" byte: " + b);
		}
		
		String nome = "aa";
		System.out.println(nome.isEmpty());
		
		String curso = "fundamento-em-java";
        String[] valorComSplit = curso.split("-");
        
        for (String s : valorComSplit) {
        	System.out.println(s);
        }
        
        String usandoSplitElimit = "Fundamentos - java - software - engenharia - computação";
        String[] valorComSplitComLimit =  usandoSplitElimit.split("-", 2);
        
        for (String s : valorComSplitComLimit) {
        	System.out.println(s);
        }
        
        System.out.println(valor.subSequence(0, 5));
        System.out.println(valor.substring(0, 5));
	
	
	String maiusculoEMinusculo = " Treinamento em java - trabalhando com classe string  ";
	
    System.out.println(maiusculoEMinusculo.toLowerCase());
    System.out.println(maiusculoEMinusculo.toUpperCase());
    System.out.println(maiusculoEMinusculo.trim());
    
    boolean myBoolean = true;
    System.out.println(String.valueOf(myBoolean));
    
    float myFloat = -10;
    System.out.println(String.valueOf(myFloat));
    
    int myInt = 9;
    System.out.println(String.valueOf(myInt));
    
    double myDouble = 10.30;
    System.out.println(String.valueOf(myDouble));
    
    String result = String.format("Hoje nós processamos %,d transações", 100000);
    System.out.println(result);
    
    result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
    System.out.println(result);
  }
}

