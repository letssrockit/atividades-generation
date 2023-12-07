package modulo9;

import java.util.Scanner;

public class SwitchCaseAtv {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
		int qtdd, cod, valor;
		
		System.out.println("\n\tMenu: ");
		System.out.println("\nCódigo: \t Produto\t Valor");
		System.out.println("\n1 \t Cachorro Quente\t R$ 10.00");
		System.out.println("\n2 \t X-Salada\t R$ 15.00");
		System.out.println("\n3 \t X-Bacon\t R$ 18.00");
		System.out.println("\n4 \t Bauru\t R$ 12.00");
		System.out.println("\n5 \t Refrigerante\t R$ 8.00");
		System.out.println("\n6 \t Suco de laranja\t R$ 13.00");
		System.out.println("\nDigite a opção: ");
		cod = leia.nextInt();
		
		valor = cod*qtdd;
		
		System.out.println("\nQual a quantidade?: ");
		qtdd = leia.nextInt();
		
		switch (cod){
		
		case 1:
			System.out.println("\n O valor total é: " + 10*qtdd);
		break;
		case 2:
			System.out.println("\n O valor total é: " + 15*qtdd);
		break;
		case 3:
			System.out.println("\n O valor total é: " + 18*qtdd);
		break;
		case 4:
			System.out.println("\n O valor total é: " + 12*qtdd);
		break;
		case 5:
			System.out.println("\n O valor total é: " + 8*qtdd);
		break;
		case 6:
			System.out.println("\n O valor total é: " + 13*qtdd);
		break;
		default:
			System.out.println("\nCódigo inválido");
		}
	}
}
