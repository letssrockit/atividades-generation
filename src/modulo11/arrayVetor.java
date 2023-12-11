package modulo11;

import java.util.Scanner;

public class arrayVetor {

	public static void main(String[] args) {
		float media[] = new float[4]; //media pode ser float ou int e new float é pra colocar o tamanho do array
		String nomes[]= new String[4];
		float n1,n2,n3,mediaGeral,somaMedia=0;
		int x; //variavel de loop, percorre todas as posições do array
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<4;x++) { // x++ = x+1
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3; //guarda a média do aluno na posição x (declarada em float(x=0...)
		
			System.out.println("\nMédia alune "+(x+1)+" foi de: "+media[x]);
			
			somaMedia += media[x]; //soma+= é igual a somaMedia = somaMedia + media[x]
		
		}
		
		mediaGeral = somaMedia/x;// ele soma e4 pra sair do programa, o programa só funciona até 3
		
		System.out.println("\nMédia geral foi de: "+mediaGeral);
		for(x=0;x<4;x++) {
			System.out.println("Média alune " +(x+1)+" foi de: " +media[x]);
		}
		
		System.out.println("\nMédia do primeiro alune: "+media[0]); //para ver uma média específica de um único aluno
		
		
		

	}

}
