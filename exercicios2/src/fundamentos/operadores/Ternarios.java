package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 9.9;
		String resultadoFinal = media >= 7.0 ? 
				"Aprovado" : " Em Recuperação";
		
		System.out.println("O Aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "não";
		
		
		System.out.println("Tem Desconto? " + resultado);
		
	}

}
