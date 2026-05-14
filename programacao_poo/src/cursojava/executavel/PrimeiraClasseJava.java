package cursojava.executavel;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Alex", 35, "10/10/1991");
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		aluno1.retornaDados();
	}

}
