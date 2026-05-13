package entradaDados.executaveis;

import javax.swing.JOptionPane;

public class calculoMedia {
	
	public static void main(String[] args) {
		
		double total = 0;
		double media = 0;
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas serão apuradas ?"));
		
		for(int i = 1; i <= quantidade; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + i +"º nota: "));			
			total += nota;
		}
		
		media = (total / quantidade);
		
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno está de recuperação, com média: " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: " + media );
		}
		
	} // Fim método main
} 
