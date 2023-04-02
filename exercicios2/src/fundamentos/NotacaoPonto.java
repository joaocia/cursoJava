package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y = " Bom Dia X "
				.replace("X", "joão")
				.toUpperCase()
				.concat("!!!");
				
		
		System.out.println(y);
				
		//Tipos Primitivos não tem operador "
		
		
	}

}
