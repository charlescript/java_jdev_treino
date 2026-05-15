package cursojava.executavel;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Alex", 35, "10/10/1991");
		Aluno aluno2 = new Aluno("João", 39, "10/10/1987");
		
		aluno1.retornaDados();
		
		aluno2.setNome("João 2");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/11/1987");
		aluno2.setRegistroGeral("41.325.147-6");
		aluno2.setNumeroCpf("330.682.554-47");
		aluno2.setNomeMae("Maria");
		aluno2.setNomePai("Edgar");
		aluno2.setDataMatricula("10/03/2026");
		aluno2.setNomeEscola("FATEC");
		aluno2.setSerieMatriculado("2º Semestre");
		
		aluno2.retornaDados();
	}

}
