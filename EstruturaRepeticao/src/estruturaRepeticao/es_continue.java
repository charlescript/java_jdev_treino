package estruturaRepeticao;

public class es_continue {
	public static void main(String[] args) {
		
		// Estrutura de repetição FOR e Continue
		
		for(int numero = 0; numero <= 10; numero++) {
			System.out.print(numero);
			if(numero == 3 || numero == 6 || numero == 9) {
				System.out.println(" Obaa encontrei o número " + numero);
				//break;
				continue;
			}
			System.out.println(" Processando laço de repetição ");
		}
	}
}
