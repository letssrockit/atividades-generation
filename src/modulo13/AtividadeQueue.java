package modulo13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeQueue {

	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<String>();
		Scanner read = new Scanner(System.in);
		
		String opcao = "";
		
		do {
			System.out.println("\n------------------------------");
			System.out.println("\n\t\tFila do banco");
			System.out.println("\n(1) Adicionar cliente na fila");
			System.out.println("\n(2) Listar cliente");
			System.out.println("\n(3) Remover cliente da fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			opcao = read.next();
			
			switch (opcao) {
			
			case "1":
				System.out.println("\nDigite o nome do cliente: ");
				filaBanco.add(read.next());
				break;
				
			case "2":
				read.nextLine();
				System.out.println("\nClientes na fila: ");
				System.out.println(filaBanco);
				if (filaBanco.isEmpty()) {
                    System.out.println("A fila está vazia.");
				}
				break;
				
			case "3":
				read.nextLine();
				System.out.println("\nDigite o nome do cliente: "); if (!filaBanco.isEmpty()) {
                    System.out.println("\nNome: " + filaBanco.remove() + " atendimento concluído");
                } else {
                    System.out.println("A fila está vazia.");
                }
				break;
				
			 }
        } while (!opcao.equals("0"));
		System.out.println("\nPrograma concluído ");
		
        read.close();
}
}
