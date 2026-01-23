package tiposvariaveis;

public class OperacoesLogicasCondicionais {
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 95;
		int nota4 = 68;		
		
		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/** Condições lógicas com IF e Else*/
		if(mediaAluno >= 70 ) {
			System.out.println("Parábens você esta aprovado");
		} 
		 else if(mediaAluno >= 50) {
			System.out.println("Aluno de recuperação.");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		
		/** Operadores ternários são para micro validações */
		System.out.println("\n---------- Ternários ----------");
		String saidaResultado;
		saidaResultado = mediaAluno >= 70 ? "Aprovado" : mediaAluno >= 50 ? "Recuperação" : "Reprovado";
		System.out.println("Aluno: " + saidaResultado);
		
		
		/** Operações lógicas aninhadas: Operações dentro de operações*/		
		System.out.println("\n--------------Operações lógicas aninhadas-----------------------");
		mediaAluno = 35;
		if(mediaAluno >= 50) {
			if(mediaAluno >= 70) {
				System.out.println("Aluno aprovado - Parabéns " + mediaAluno);
			} else if(mediaAluno >= 50) {
				System.out.println("Aluno recuperação. -> " + mediaAluno);				
			}	
		} else {
			System.out.println("Aluno reprovado. -> " + mediaAluno);
		}
		
	}
}
