package modulo11;

import java.util.Scanner;

public class arrayMatriz {

	public static void main(String[] args) {
		
		/*
		  Modelo do meu array tipo matriz
		  
		 Linha X Coluna (tem 2 linhas e 3 colunas)
		  0,0     0,1
		  1,0     1,1   
		  2,0     2,1
		 */
		
		int numeros[][] = new int[3][2];
		int countPares=0, somaImpar=0,linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				//entra na linha 0, coluna 0
				
				System.out.println("\nEntre com um número: na linha "+linha+" e coluna "+coluna);;
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 2 ==0) {
					countPares++;
				}else {
					somaImpar +=numeros[linha][coluna];
				}
			}
		}
		System.out.println("\nEu tenho: "+countPares+" números pares");
		System.out.println("\nSomatório de números ímpares: "+somaImpar );
		

	}

}
