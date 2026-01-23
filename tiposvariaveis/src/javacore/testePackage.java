package javacore;

public class testePackage {
	/*Main é um método auto executavel em Java*/
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 90;
		int media = 0;
		
		media =  (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*SWITCH CASE: OPERAÇÕES EXATAS*/
		int dia = 2;
		switch(dia) {
		   case 1:
			   System.out.println("Domingo");
		   break;
		   
		   case 2:
			   System.out.println("Segunda-feira");
		   break;
		   
		   case 3:
			   System.out.println("Terça-feira");
		   break;
		   
		   case 4: 
			   System.out.println("Quarta-feira");
		   break;
		   
		   case 5:
			   System.out.println("Quinta-feira");
		   break;
		   
		   case 6:
			   System.out.println("Sexta-feira");
		   break;
		   
		   case 7:
			   System.out.println("Sábado");
		   break;
		   
		   default: System.out.println("Outro dia qualquer");
		}
	}
}
