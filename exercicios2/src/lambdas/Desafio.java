package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
	
//	1 - calcular o preço real do produto com desconto
//	2 - calcular imposto municipal: >=2500 (8,5%)/ < 2500 (isento)
//	3 - valor do frete: >= 3000,00 (100) / < 3000 (50)
//	4 - deixar com duas casas decimais
//	5 - Formartar valor (R$ 1234,55)
	
	Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
	UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
	UnaryOperator<Double> frete = preco -> preco >= 3000 ? + 100 : preco + 50;
	UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
	Function<Double, String> formatar= preco -> ("R$" + preco).replace(".", ",");
	
	Produto p = new Produto("iPad", 3220.99, 0.50);
	
	String preco = precoFinal
			.andThen(impostoMunicipal)
			.andThen(frete)
			.andThen(arredondar)
			.andThen(formatar)
			.apply(p);
	
	System.out.println("O preço final é: " + preco);

	
	
	
	
	
	}

}
