package cursojava.classes;

import javax.swing.JOptionPane;

public class Aluno {
	
	public String nome;
	public int idade;
	public String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {}
	
	public Aluno(String nome, int idade, String dataNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}
	
	
	public void retornaDados(){
		JOptionPane.showMessageDialog(null,"Nome: "+ this.nome + "\nIdade: "+ this.idade + "\nNascimento: "+this.dataNascimento);
	}
}
