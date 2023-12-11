package modulo10;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, x, y=0, multi=0; 
		float media=0;
		
		do {
		System.out.println("Entre com um número diferente de 0 ou digite 0 para sair: ");
		num = read.nextInt();
		
		if(num %3 ==0 && num !=0) {
			y+=num;
			multi++;
		}
		
		} while (num !=0); 
		if(num == 0) {
			System.out.println("\nNúmero inválido. Programa finalizado");
			
		}
	            
		media = (float) y/multi;
		 System.out.println("A médiados números múltiplos de 3 é: " +media);
		 
}
}


