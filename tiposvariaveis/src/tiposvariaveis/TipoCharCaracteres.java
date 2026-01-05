package tiposvariaveis;

public class TipoCharCaracteres {
	
	public static void main(String[] args) {
		
		/* CHAR representa uma letra */
		char pessoa = 'f';
		
		if(pessoa == 'F' || pessoa == 'f') {
			System.out.println("Pessoa Física");
		} else {
			System.out.println("Pessoa Jurídica");
		}
	}
}
