package modulo9;

import java.util.Scanner;

public class atvIfElse {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num%2 ==0 && num<=-1) {
			System.out.println("\nO número é par e negativo!");
		}else if(num%2 ==0 && num>=1){
			System.out.println("\nO número é par e positivo!");
		}else if(num >=1) {
			System.out.println("\nO número é ímpar e positivo!");
		}else {
			System.out.println("\nO número é ímpar e negativo!");}
		leia.close();
		}
	}