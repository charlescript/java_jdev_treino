package javacore.operadoresLogicos;

public class estruturaWhile {
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
	 /*Estrutura de repetição While*/
	 int cont = 1;
	 while(cont <= 12) {
		 System.out.println("Posição: " + cont + "º");
		 cont++;
	 }
	 
	 /*---------------------------------------*/
	 System.out.println("\n--------DO While-------------------");
	 
	 int i = 1;
	 do {
		 System.out.println("Position: " + i + "º");
		 i++;
	 }while(i <= 10);
		
	}
}
