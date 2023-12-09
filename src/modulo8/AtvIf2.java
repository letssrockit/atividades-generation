package modulo8;

import java.util.Scanner;

public class AtvIf2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a,b,c, resul;
		
		System.out.println("\nDigite um número: ");
		a = leia.nextInt();
		System.out.println("\nDigite um número: ");
		b = leia.nextInt();
		System.out.println("\nDigite um número: ");
		c = leia.nextInt();
		
		resul = a+b;
		
		if(resul > c) {
			System.out.println("\nA Soma de A + B é Maior do que C ");
	  }
		if(resul < c) {
			System.out.println("\nA Soma de A + B é Menor do que C ");
		}
		
		if(resul == c) {
			System.out.println("\nA Soma de A + B é Igual a que C ");
		}
		leia.close();
	}
}
