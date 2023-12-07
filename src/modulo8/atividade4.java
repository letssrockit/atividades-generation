package modulo8;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, num3, num4, prod;
		
		System.out.println("\nDigite o primeiro valor: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo valor: ");
		num2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro valor: ");
		num3 = leia.nextFloat();
		System.out.println("\nDigite o quarto valor: ");
		num4 = leia.nextFloat();
		
		prod = (num1*num2) - (num3*num4);
		System.out.println("\nO produto é: " +prod);

	}

}
