package cursojava.executavel;

import cursojava.classes.Aluno;
import javax.swing.JOptionPane;


public class EqualsHashcode {
	
	public static void main(String[] args) {
		
		/*Equals e hashcode (Diferenciar e comparar objetos )*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123.456.789-10");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNome("234.789.102-99");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais.");
		} else {
			System.out.println("Alunos não são iguais.");
		}
		
	}
}
