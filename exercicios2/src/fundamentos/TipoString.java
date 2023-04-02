package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
	System.out.println("Ola Pessal" .charAt(2));	
	
	String s = "Boa Tarde";
	
	System.out.println(s.concat("!!!"));
	System.out.println(s + "!!!");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.endsWith("tarde!"));
	System.out.println(s.length());
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.equalsIgnoreCase("boa tarde"));
	
	var nome = "Pedro";
	var sobrenome = "Santos";
	var idade = 33;
	var salario = 12345.67;
	System.out.println("nome:" + nome + "\nsobrenome:" + sobrenome + "\nidade:" + idade + "\nsalario:" + salario + "\n\n" ); 
	
	System.out.printf("O Senhor %s %s tem %s anos e recebe R$ %s de salario" , nome, sobrenome, idade, salario);
	
	String frase = String.format("\n\nO Senhor %s %s tem %s anos e recebe R$ %s de salario" , nome, sobrenome, idade, salario);
	System.out.println(frase);
	
	
	
	
	
	
	
	

	}

}
