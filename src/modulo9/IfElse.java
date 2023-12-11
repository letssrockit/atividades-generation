package modulo9;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao = true;
		
		System.out.println("\nDigite o seu nome: ");
		nome = read.next();
		
		System.out.println("\nDigite sua idade: ");
		idade = read.nextInt();
		
		if(idade <18 && idade> 69) {
			System.out.println("\nVocênão está apto a doar sangue");
		}else if (idade >60 && idade <69 ) {
			System.out.println("\nEssa é sua primeira doação?: ");
			doacao= read.nextBoolean();
					{
				if(doacao == true) {
					System.out.println("Você não está apto a doar sangue");
				}else if(doacao == false) {
					System.out.println("Você está apto a doar sangue");
				}
			}
		}
		if(idade >18 && idade<60) {
			System.out.println("Você está apto a doar sangue");
		}

	}

}
