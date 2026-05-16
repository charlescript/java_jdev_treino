package cursojava.classes;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno() {}
	
	public Aluno(String nome, int idade, String dataNascimento) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setDataNascimento(dataNascimento);
	}
	
	/*Métodos Getters e Setters para acesso dos atributos privados*/
	/*Set adicionado dados no atributo da instância em tempo de execução*/
	/*Get recuperando dados do atributo da instância em tempo de execução*/
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	//-//////////////////////////////////
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	//-//////////////////////////////////
	
	public void setDataNascimento(String data) {
		this.dataNascimento = data;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	//-//////////////////////////////////
	
	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	//-//////////////////////////////////

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	//-//////////////////////////////////

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	//-//////////////////////////////////

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	//-//////////////////////////////////
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	//-//////////////////////////////////

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	//-//////////////////////////////////

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	//-//////////////////////////////////
	
	public Double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	//-//////////////////////////////////
	
	public Double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	//-//////////////////////////////////
	
	public Double getNota3() {
		return nota3;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	//-//////////////////////////////////
	
	public Double getNota4() {
		return nota4;
	}
	
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	//-//////////////////////////////////
	
	public double mediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	
	public void retornaDados(){
		JOptionPane.showMessageDialog(null,"Nome: "+ this.getNome() + 
				"\nIdade: "+ this.getIdade() + 
				"\nNascimento: "+ this.getDataNascimento() +
				"\nRG: " + this.getRegistroGeral() + 
				"\nCPF: " + this.getNumeroCpf() +
				"\nMedia: " + this.mediaNota());
	}

}
