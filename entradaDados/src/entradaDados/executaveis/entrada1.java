package entradaDados.executaveis;

import javax.swing.JOptionPane;

public class entrada1 {
	
	/* Main é um método auto executavel em Java*/
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe o número de pessoas: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
				
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisao + " carros por pessoa\n e sobrou " + resto + " carro(s).");
	}
}
