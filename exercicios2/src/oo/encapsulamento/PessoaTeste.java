package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro" , "Amoedo", -45);
		p1.setIdade(130); 
		
		System.out.println(p1.getIdade()); //ler o valor da variavel 
		System.out.println(p1); //ler o valor da variavel 
		System.out.println(p1.getNomeCompleto());
	}

}
