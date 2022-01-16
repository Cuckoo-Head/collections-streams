package com.dio.exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		nomes.set(2, "Roberto");
		System.out.println("Substitua Carlos por Roberto: " + nomes);
		
		System.out.println("Retorne o valor da posição 1: " + nomes.get(1));
		
		nomes.remove(4);
		System.out.println("Remova o valor da posição 4: " + nomes);
		
		nomes.remove("João");
		System.out.println("Remova 'João' :" + nomes);
		
		System.out.println("Retorne a quantidade de itens: " + nomes.size());
		
		System.out.println("A lista contém o nome 'Juliano'? " + nomes.contains("Juliano"));
		
		ArrayList<String> chamada = new ArrayList<String>();
		chamada.add("Ismael");
		chamada.add("Rodrigo");
		System.out.println("Crie uma nova lista com o nome Ismael e Rodrigo: " + chamada);
		
		for(int i = 0; i < chamada.size(); i++) {
			String nome = chamada.get(i);
			nomes.add(nome);
		}
		System.out.println("Adicione todos os itens da nova lista à primeira:" + nomes);
		
		Collections.sort(nomes);
		System.out.println("Lista em ordem alfabetica: " + nomes);
		
		System.out.println("A lista está vazia? " + nomes.isEmpty());
	}
	
	
}
