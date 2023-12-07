package modulo8;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float sal, ab, nvsal;
		
		System.out.println("\nDigite o salário: ");
		sal = leia.nextFloat ();
		System.out.println("\nDigite o abono: ");
		ab = leia.nextFloat ();
		
		nvsal = sal + ab;
		System.out.println("\nO novo salário é: " +nvsal);

	}

}
