package modulo8;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float bruto, noturno, horas, desc, liq;
		
		System.out.println("\nDigite o salário bruto: ");
		bruto = leia.nextFloat();
		System.out.println("\nDigite o adicional noturno: ");
		noturno = leia.nextFloat();
		System.out.println("\nDigite as horas trabalhadas: ");
		horas = leia.nextFloat();
		System.out.println("\nDigite os descontos: ");
		desc = leia.nextFloat();
		
		liq = bruto + noturno + (horas*5) - desc;
		System.out.println("\nDigite o salário líquido é: " +liq);
		
		
		

	}

}
