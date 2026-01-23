package javacore.operadoresLogicos;

public class condicionaisRelacionais {
	public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 90;
		
		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		} else {
			System.out.println("As notas são diferentes");
		}
		
		/*----------------------------------------------*/
		System.out.println("\n-------------------------\n");
		
		if(nota1 != nota2) {
			System.out.println("As notas são diferentes");
		} else {
			System.out.println("As notas são iguais");
		}
		
		/*----------------------------------------------*/
		System.out.println("\n-------------------------\n");
		
		if(nota1 >= nota2) {
			System.out.println("Nota 1 é maior ou igual a nota 2");
		} else {
			System.out.println("Nota 2 é maior quer nota 1");
		}
		
		/*----------------------------------------------*/
		System.out.println("\n-------------------------\n");

		
		
	
	} // fim método main

}
