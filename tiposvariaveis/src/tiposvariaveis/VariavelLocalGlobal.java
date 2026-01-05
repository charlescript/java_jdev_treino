package tiposvariaveis;

public class VariavelLocalGlobal {
	
	/*Variável global é acessível a todos os métodos desse escopo, dessa classe*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um método auto executavel em Java*/
	public static void main(String[] args) {
		
		/*Variável local porque pertence somente a esse método e o valor fica dentro do método*/
		int maiorIdade = 18;
		System.out.println("Valor da váriavel Local = " + maiorIdade);
		System.out.println("Valor da váriavel Global acessada diretamente: " + maiorIdadeGlobal);
		
		metodo2();
	}
	
	
	public static void metodo2() {
		int varLocalMetodo2 = 10; // Só para demonstração
		System.out.println("Valor da váriavel Global acionada por método = " + maiorIdadeGlobal);
	}

}
