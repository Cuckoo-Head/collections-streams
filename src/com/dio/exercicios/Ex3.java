package com.dio.exercicios;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex3 {

	public static void main(String[] args) {

		TreeSet<Integer> lista = new TreeSet<>();
		
		lista.add(3);
		lista.add(88);
		lista.add(20);
		lista.add(44);
		System.out.println("Crie uma lista: " + lista);
		
		Iterator<Integer> iteratorLista = lista.iterator();
		while(iteratorLista.hasNext()) {
			System.out.println(">" + iteratorLista.next());
		}
		lista.remove(lista.first());
		System.out.println("Removido o primeiro elemento: " + lista);
		
		lista.add(23);
		System.out.println("Adicionado o valor 23: " + lista);
		
		System.out.println("A lista possui " + lista.size() + "elementos.");
		
		System.out.println("A lista está vazia? " + lista.isEmpty());
	}

}
