package modulo9;

import java.util.Scanner;

public class IfelseAtt2 {

	public static void main(String[] args) {
		
		/*
		 *Operador Lógico E -- &&
		 
		 Entrada1	Entrada2	Saída
		 V			V			V
		 V			F			F
		 F			V			F
		 F			F			F
		 
		 Operador Lógico OU -- ||
		 
		 Entrada1	Entrada2	Saída
		 V			V			V
		 V			F			V
		 F			V			V
		 F			F			F
		 
		 */
	
		String nome;
		int idade;
		boolean sim, nao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=18 && idade<60) {
			System.out.println("Você está apto a doar sangue");
		}else if(idade>=60 && idade<69) {
			System.out.println("\nEssa é sua primeira vez doando? ");
			nao = leia.nextBoolean();{
				if(nao) {
					System.out.println("Você está apto a doar sangue");
				}
			}
		}else {
			System.out.println(" Você não está apto a doar sangue");
		}
	}

}