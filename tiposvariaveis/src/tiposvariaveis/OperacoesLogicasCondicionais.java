package tiposvariaveis;

public class OperacoesLogicasCondicionais {
	public static void main(String[] args) {
		
		int mediaAluno = 49;
		
		if(mediaAluno >= 70 ) {
			System.out.println("Parábens você esta aprovado");
		} else if(mediaAluno >= 50) {
			System.out.println("Aluno de recuperação.");
		} else {
			System.out.println("Aluno reprovado");
		}
		
	}
}
