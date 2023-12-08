package modulo10;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, x=0, y=0;
		
		System.out.println("Olá! \nDigite uma idade: ");
		idade = leia.nextInt();
		
		while(idade !=-1) {
			if(idade<21) {
				x++;
			}
			if(idade>50) {
				y++;
			} System.out.println("Digite uma idade (ou -1 para sair): ");
            idade = leia.nextInt();
		} System.out.println("O número de pessoas abaixo de 25 anos é: " +x);
		  System.out.println("O número de pessoas acima de 50 anos é: " +y);
		  leia.close();

	}

}
