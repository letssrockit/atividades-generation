package modulo10;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,x,y,soma=0;
		
		do {
			System.out.println("\n Entre com um número que não seja 0: ");
			num = leia.nextInt();
			soma +=num;
		} while(num !=0);
		
		if(num==0) {
			System.out.println("\nPrograma finalizado");
		}
		
		 System.out.println("A soma dos números positivos digitados é: " + soma);
	} 

}
