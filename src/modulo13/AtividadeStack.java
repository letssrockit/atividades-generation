package modulo13;

import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;

public class AtividadeStack {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Stack<String> pilha = new Stack <String>();
		
		int op=0;
		
		
		do {
			System.out.println("\n------------------------------");
			System.out.println("\n\t\tPilha de livros");
			System.out.println("\n(1) Adicionar um novo livro");
			System.out.println("\n(2) Listar todos os livros");
			System.out.println("\n(3) Retirar livro da pilha");
			System.out.println("\n(0) Sair");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = read.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				String livro = read.next();
				pilha.push(livro);
				System.out.println("Livro adicionado!");
				break;
				
			case 2:
				System.out.println("\nLivros na pilha: ");
				System.out.println(pilha);
				if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia.");
				}
				break;
				
			case 3:
				if (!pilha.isEmpty()) {
			        System.out.println(pilha);
			        System.out.println("\nLivro retirado da pilha: " + pilha.pop());
			        if (pilha.isEmpty()) {
			            System.out.println("A pilha está vazia.");
			        }
				}else {
					System.out.println("A pilha está vazia. Não é possível retirar livro");
				}
				break;
			}	
			}while (op != 0);
			
			System.out.println("\nPrograma concluído ");
		
	        read.close();
		

	}

}
