package cursojava.classes;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

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
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public List<Disciplina> getDisciplinas(){
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
 

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
	
	public double mediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}
	
	
	
	
	public boolean getAlunoAprovado() {
		double media = mediaNota();
		if(media >= 7) {
			return true;
		}
		return false;
	}
	
	
	
	public String getAlunoAprovado2() {
		double media = mediaNota();
		if(media >= 5) {
			if(media >= 7) {
				return "Aprovado.";
			} else {
				return "Recuperação.";
			}
		} else {
			return "Reprovado.";
		}
	}
	
	
	
	public void retornaDados(){
		JOptionPane.showMessageDialog(null,"Nome: "+ this.getNome() + 
				"\nIdade: "+ this.getIdade() + 
				"\nNascimento: "+ this.getDataNascimento() +
				"\nRG: " + this.getRegistroGeral() + 
				"\nCPF: " + this.getNumeroCpf() +
				"\nPAI: " + this.getNomePai() +
				"\nMÃE: " + this.getNomeMae() +
				"\nData Matricula: " + this.getDataMatricula() +
				"\nNome da escola: " + this.getNomeEscola() +
				"\nSérie: " + this.getSerieMatriculado() +
				"\nAprovação: " + this.getAlunoAprovado() +
				"\nSituação: " + this.getAlunoAprovado2() );
	}

	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado +"]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

	

}
