package modulo11;

import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numMatriz[][] = {{1,3,5},{2,4,6},{7,9,11},{8,10,12}};
		int x, somaDPrin=0,somaDSec=0;
		
		System.out.println("\nElementos da Diagonal Principal\n: ");
		for(x=0;x<3;x++) {
			System.out.println(numMatriz[x][x]+" ");
		}
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(x=0;x<3;x++) {
			System.out.println(numMatriz[x][2-x]+" ");
		}
		
		for(x=0;x<3;x++) {
			somaDPrin += numMatriz[x][x];
		}
		
		System.out.println("\nA Soma de todos os elementos da Diagonal Principal: " +somaDPrin);
		
		for(x=0;x<3;x++) {
			somaDSec += numMatriz[x][2-1];
		}
		
		System.out.println("\nA Soma de todos os elementos da Diagonal Secundária: " +somaDSec);
		
		
		

	}

}
