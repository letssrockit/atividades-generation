package modulo12;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AtividadeArraySet {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		for(int x=0;x<10;x++) {
			System.out.println("\nDigite um número: ");
			int num = read.nextInt();

		if(numeros.contains(num)) {
			System.out.println("Esse número já existe. Digite outro: ");
			} else {
				numeros.add(num);
				 
			}
		}
		  Iterator<Integer> iterator = numeros.iterator();

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
		}
			
		read.close();
			
		}
				
		
		

	}

