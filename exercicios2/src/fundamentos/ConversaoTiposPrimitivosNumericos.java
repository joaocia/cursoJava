package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.12345888888; // explícita (cast)
		System.out.println(b);
		
		int c = 240;
		byte d = (byte) c; // explícita (cast)
		System.out.println(d);
		
		double e = 1.999999;   
		int f = (int) e;  // explícita (cast)
		System.out.println(f);
		
		
		
		
	}

}
