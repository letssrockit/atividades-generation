package modulo10;

import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, genero=0,soma=0,categoria=0, back=0, front=0, mobile=0, fullstack=0, cont=0, media=0;
		String continua ="S";
		
		while (continua.equals("S")) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o gênero (1-M/2-F/3-Outros)");
			genero = leia.nextInt();
			
			while(genero <1 || genero >3) {
				System.out.println("Digite o gênero (1-M/2-F/3-Outros)");
			}
			
			System.out.println("Digite a categoria: ");
			System.out.println("(1-Back/2-Front/3-Mobile/4-Full");
			categoria = leia.nextInt();
			
			while (categoria <1 || categoria > 4);
			System.out.println("Digite a categoria: ");
			System.out.println("(1-Back/2-Front/3-Mobile/4-Full");
			categoria = leia.nextInt();{
				if (categoria ==1) {
					}
				back++;
				}
			   if (categoria == 2 && genero == 2) {
				   front++;
			   }
			   if (categoria == 3 && genero == 21 && idade == 40) {
				   mobile++;
			   }
			   if (categoria == 4 && genero == 2 && idade ==30) {
				   fullstack++;
			   }
			   cont++;
			   soma += idade;
			   
			   System.out.println("Deseja continuar? (S/N)?");
			   leia.nextLine();

}
	
	media = soma/cont;//fora do while
	
	leia.close();
 }
}
