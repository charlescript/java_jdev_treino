package entradaDados.executaveis;

import javax.swing.JOptionPane;

public class entradaOpcoes {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja visualizar o resultado da divisão ?");
				
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão ficou: " + divisao + " carros por pessoa.");
		} else {
			System.out.println("Não quis ver resultado.");
		}
		
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja visualizar os carros que sobraram ? ");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobrou " + resto + " carro(s).");
		} else {
			System.out.println("Não quis ver resultado.");
		}
		
	}
}
