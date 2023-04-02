package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trab1 = false;
		boolean trab2 = true ;
		
		boolean tv50 = trab1 && trab2;
		
		boolean tv32 = trab1 ^ trab2;
		
		boolean sorvete = trab1 || trab2;
		// Operador Unario
		boolean saudavel = !sorvete;
		
		
		System.out.println("Comprou TV 50\"? " + tv50);
		System.out.println("Comprou TV 32\"? " + tv32);
		System.out.println("Comprou TV 32\" Sorevete? " + sorvete);
		System.out.println("Mais Saudável?" + saudavel);
	}

}
