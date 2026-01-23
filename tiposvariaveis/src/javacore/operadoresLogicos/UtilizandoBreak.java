package javacore.operadoresLogicos;

public class UtilizandoBreak {
	
	public static void main(String[] args) {
		
		// Estrutura e repetição FOR com Break (Parada)
		for(int numero = 0; numero <= 10; numero++) {
			System.out.println("Numero atual é: " + numero);
			if(numero == 7) {
				System.out.println("Parada programada no 7º giro. ");
				break;
			}
		}
	}
}
