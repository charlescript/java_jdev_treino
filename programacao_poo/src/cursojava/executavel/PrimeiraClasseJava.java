package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;


public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Nome do aluno?");
		String idade = JOptionPane.showInputDialog("Idade do aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Data nascimento do aluno: ");
		String rgAluno = JOptionPane.showInputDialog("Registro Geral (RG): ");
		String cpfAluno = JOptionPane.showInputDialog("CPF do aluno: ");
		String nomePai = JOptionPane.showInputDialog("Nome do pai: ");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe: ");
		String dataMatricula = JOptionPane.showInputDialog("Data matricula: ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola: ");
		String periodoMatriculado = JOptionPane.showInputDialog("Período matriculado: ");
		
		
		String[] disciplinas = new String[4];
		double[] notasAlunos = new double[4];
		for(int i = 0; i <= 3; i++) { 
			disciplinas[i] = JOptionPane.showInputDialog("Digite a " + (i+1) +"º disciplina: ");
			notasAlunos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de " + disciplinas[i] +": "));
		}
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rgAluno);
		aluno1.setNumeroCpf(cpfAluno);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(periodoMatriculado);
		
		aluno1.getDisciplina().setDisciplina1(disciplinas[0]);
		aluno1.getDisciplina().setDisciplina2(disciplinas[1]);
		aluno1.getDisciplina().setDisciplina3(disciplinas[2]);
		aluno1.getDisciplina().setDisciplina4(disciplinas[3]);
		
		aluno1.getDisciplina().setNota1(notasAlunos[0]);
		aluno1.getDisciplina().setNota2(notasAlunos[1]);
		aluno1.getDisciplina().setNota3(notasAlunos[2]);
		aluno1.getDisciplina().setNota4(notasAlunos[3]);

		aluno1.retornaDados();
		
		System.out.println("Nome: " +aluno1.getNome() + 
							"\nIdade: " + aluno1.getIdade() +
							"\nNacimento: " + aluno1.getDataNascimento() +
							"\nPAI: " + aluno1.getNomePai() +
							"\nMÃE: " + aluno1.getNomeMae() +
							"\nData Matricula: " + aluno1.getDataMatricula() +
							"\nNome da escola: " + aluno1.getNomeEscola() +
							"\nSérie: " + aluno1.getSerieMatriculado() +
							"\nDisciplinas: " + aluno1.getDisciplina().getDisciplina1() + " / " + aluno1.getDisciplina().getDisciplina2() + " / " + aluno1.getDisciplina().getDisciplina3() + " / " + aluno1.getDisciplina().getDisciplina4() +
							"\nMedia: " + aluno1.getDisciplina().mediaNota() +
							"\nAprovação: " + aluno1.getAlunoAprovado() + 
							"\nSituação: " + aluno1.getAlunoAprovado2() );
		
		System.out.println(aluno1.toString());
		
		
	} /*  End method main */
}
