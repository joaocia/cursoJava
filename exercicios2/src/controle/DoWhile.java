package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if (...) sentença ou {}
		// while (...) sentença; ou {}
        // for (..;...;..) sentença; ou {}

		// do {} a expressão vem depois while (...)
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Voce precisa falar " + "as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
;		} while(!texto.equalsIgnoreCase ("Por Favor"));

		System.out.println("Obrigado!");
		entrada.close();
	
	}

}
