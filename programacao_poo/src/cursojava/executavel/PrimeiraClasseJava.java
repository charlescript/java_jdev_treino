package cursojava.executavel;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Alex", 35, "10/10/1991");
		Aluno aluno2 = new Aluno("João", 39, "10/10/1987");
		Aluno aluno3 = new Aluno();
		
		aluno1.retornaDados();
		
		aluno2.nome = "João 2";
		aluno2.idade = 40;
		aluno2.retornaDados();
	}

}
