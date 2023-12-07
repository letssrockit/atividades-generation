package modulo8;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nA média é: " +media);
	}

}
