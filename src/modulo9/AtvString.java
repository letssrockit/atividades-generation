package modulo9;

import java.util.Scanner;

public class AtvString {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String vertebra, comida, tipo;
		
		System.out.println("\nÉ um animal vertebrado ou invertebrado?");
		vertebra = read.nextLine();
		
		if (vertebra.equalsIgnoreCase("vertebrado")) {
			System.out.println("Digite se o animal é ave ou mamífero");
			tipo = read.nextLine();
			
			if(tipo.equalsIgnoreCase("ave")) {
				System.out.println("Digite se o animal é carnívoro ou onívoro");
			comida = read.nextLine();
			
				if(comida.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÁguia");
				}else if(comida.equalsIgnoreCase("onívoro")) {
					System.out.println("\nPomba");
				}
			} else if(tipo.equalsIgnoreCase("mamífero")) {
				System.out.println("Digite se o animal é herbívoro ou onívoro");
			comida = read.nextLine();
			
				if(comida.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nVaca");
				}else if(comida.equalsIgnoreCase("onívoro")) {
					System.out.println("\nHomem");
				}
			}
		}
		if (vertebra.equalsIgnoreCase("invertebrado")) {
			System.out.println("Digite se o animal é inseto ou anelídeo");
			tipo = read.nextLine();
			
			if(tipo.equalsIgnoreCase("inseto")) {
				System.out.println("Digite se o animal é hematófago ou herbívoro");
			comida = read.nextLine();
			
				if(comida.equalsIgnoreCase("hematófago")) {
					System.out.println("\nPulga");
				}else if(comida.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nLagarta");
				}
			} else if(tipo.equalsIgnoreCase("anelídeo")) {
				System.out.println("Digite se o animal é hematófago ou onívoro");
			comida = read.nextLine();
			
				if(comida.equalsIgnoreCase("hematófago")) {
					System.out.println("\nSanguessuga");
				}else if(comida.equalsIgnoreCase("onívoro")) {
					System.out.println("\nMinhoca");

	}
}
		}
	}
}

