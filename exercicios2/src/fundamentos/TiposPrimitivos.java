package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informaçoes do funcionario
		
		// Tipo Numericos Inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 128;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numericos 
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos Primitivos
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens 
		System.out.println(numeroDeVoos / 2 );
		
		//Ponrtos por Real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "ganha - >" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
	}

}
