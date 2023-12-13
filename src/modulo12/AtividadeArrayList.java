package modulo12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AtividadeArrayList {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		ArrayList<String> listaCores = new ArrayList <String>();
		
		for(int x=0;x<5;x++){
			System.out.println("Entre com a cor #"+(x+1));
			String cor = read.nextLine();
			listaCores.add(cor);
		}
		read.close();
		
		System.out.println("Lista de cores: \n");
		for(String cor : listaCores) {
			System.out.println(cor);
		}
		
		  Collections.sort(listaCores);
	       System.out.println("Lista de cores em ordem alfabética: ");
	       for (String cor : listaCores) {
	            System.out.println(cor);
	        }
	 
	}

}
