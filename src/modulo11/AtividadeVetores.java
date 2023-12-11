package modulo11;

import java.util.Scanner;

public class AtividadeVetores {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int vetor[] = {2,10,1,9,3,8,6,3,7,5};
		int x,pesquisar,posicao=-1;
		
				
			
				System.out.println("\nDigite um número entre 1 e 10 a ser pesquisado: ");
				pesquisar = read.nextInt();
				
				for(x=0;x<=10;x++) {
					if (vetor[x] == pesquisar) {
						posicao = x;
						break;
					}
				}
				
				if(posicao != -1) {
				System.out.println("\nO numero pesquisado entá na posição: "+x+" no vetor.");
				}else{
		
					System.out.println("\nNúmero não encontrado.");
				}
				

	}

}
