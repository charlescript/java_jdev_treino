package cursojava.executavel;

import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Alex", 35, "10/10/1991");
		Aluno aluno2 = new Aluno("João", 39, "10/10/1987");
		
		aluno1.setNome("Pedro");
		aluno1.setIdade(31);
		aluno1.setDataNascimento("10/03/1995");
		aluno1.setRegistroGeral("31.215.478-32");
		aluno1.setNumeroCpf("123.456.789-00");
		aluno1.setNota1(10);
		aluno1.setNota2(9);
		aluno1.setNota3(8);
		aluno1.setNota4(9);
		
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
		aluno2.setNota1(10);
		aluno2.setNota2(10);
		aluno2.setNota3(8);
		aluno2.setNota4(9);
		
		aluno1.retornaDados();
		aluno2.retornaDados();
		
		System.out.println("Nome: " +aluno1.getNome() + 
							"\nIdade: " + aluno1.getIdade() +
							"\nNacimento: " + aluno1.getDataNascimento() +
							"\nMedia: " + aluno1.mediaNota());
		
		System.out.println("-------------------------------");
		
		System.out.println("Nome: " +aluno2.getNome() + 
				"\nIdade: " + aluno2.getIdade() +
				"\nNacimento: " + aluno2.getDataNascimento() + 
				"\nMedia: " + aluno2.mediaNota() );
	}
}
