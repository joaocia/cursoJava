package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(F - 32) x 5/9 = C
		
		
		final double AJUSTE = 32;
		final double CONTA = 5.0/9.0;
		
		double f = 67;
		double celsius = (f - AJUSTE) * CONTA;

		System.out.println("A temperatura exata = "  + celsius + "˚");
		
		
		f = 157;
		celsius = (f - AJUSTE) * CONTA;

		System.out.println("A temperatura exata = "  + celsius + "˚");
		
		
	   
		
		
				
		}

}
