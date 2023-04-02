package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "branca";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai");
		case "marrom":
			System.out.println("Sei o Shodan");
		case "roxa":
			System.out.println("Sei o Godan");
		case "verde":
			System.out.println("Sei o Yodan");
		case "laranja":
			System.out.println("Sei o Sandan");
		case "vermelha":
			System.out.println("Sei o Nidan");
		case "amarela":
			System.out.println("Sei o Shodan");
		break;
		
		default:
			System.out.println("Não sei Karate");
			}
		
		System.out.println("Fim!");
		
		
	}

}
