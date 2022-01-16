package com.dio.exercicios;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		System.out.println("Crie uma fila: " + fila);
		
		Iterator<String> iteratorFila = fila.iterator();
		System.out.println("Navegue pela fila e exiba os itens: ");
		while(iteratorFila.hasNext()) {
			System.out.println(">" + iteratorFila.next());
		}
		
		System.out.println("Primeiro elemento: " + fila.peek());
		
		System.out.println("Primeiro elemento, removido após mostrar: " + fila.poll());
		System.out.println(fila);
		
		fila.add("Daniel");
		System.out.println("Daniel adicionado: " + fila);
		
		System.out.println("Fila possui " + fila.size() + " elementos.");
		
		System.out.println("A fila está vazia? " + fila.isEmpty());
		
		System.out.println("A fila possui um item 'Carlos'? " + fila.contains("Carlos"));
	}

}
