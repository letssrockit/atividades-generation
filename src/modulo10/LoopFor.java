package modulo10;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 int num1, num2,x;
		
		System.out.println("\nDigite um número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite um número menor ao número anterior: ");
		num2 = leia.nextInt();
		
		if (num2>num1) {
			System.out.println("\nIntervalo inválido. O segundo número deve ser menor que o primeiro.");
			leia.close();
		}
		
		System.out.println("Múltiplos de 3 e 5 nesse intervalo é: ");
		for (x = num1; x <= num2; x++) {
			if (x%3==0&&x%5==0) {
				System.out.println(x+" é multiplo de 3 e 5");				
			};
			leia.close();
		}
	}
}
