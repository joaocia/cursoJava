package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Add e Offer -> add elementos na fila
		//* quando a fila está vazia
		
		fila.add("Ana"); // retorna falso*
		fila.offer("Bia"); // lança um execeção*
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element - obtem o próximo elemento sem remover
		//* quando a fila está vazia
		
		System.out.println(fila.peek()); // retorna falso*
		System.out.println(fila.peek());
		System.out.println(fila.element());// lança uma execeção*
		System.out.println(fila.element());
		
		
		
		
		// Poll e Remove - Obtem o próximo elemento da fila e remove
		//* quando a fila está vazia
		
		System.out.println(fila.poll()); //retorna falso*
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // exceção*
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//System.out.println(fila.poll());
		//System.out.println(fila.remove());
		
		        // fila.size();
				// fila.clear();
				// fila.isEmpty();
		
		
		
	}

}
