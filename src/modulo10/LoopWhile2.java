package modulo10;

import java.util.Scanner;

public class LoopWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, genero=0,soma=0,categoria=0, back=0, front=0, mobile=0, full=0, cont=0, media=0;
		String continua ="s";
		

        while (continua.equalsIgnoreCase("s")) {

            System.out.println("Digite a idade: ");
            idade = leia.nextInt();
            
            System.out.println("Digite o gênero (\n1 – Mulher Cis\n 2 - Homem Cis\n 3 - Não Binário\n 4 - Mulher Trans\n 5 - Homem Trans\n 6 - Outros)");
            genero = leia.nextInt();
           
            System.out.println("Digite a categoria: ");
            System.out.println("(1-Back/2-Front/3-Mobile/4-FullStack)");
            categoria = leia.nextInt();
            
            System.out.println("Deseja continuar? (S/N)?");
            continua = leia.next();
            
  
            }

            if (categoria == 1) {
                back++;
            } if (categoria == 2 && (genero == 1 || genero == 4)) {
                front++;
            } if (categoria == 3 && ((genero == 2 || genero == 5) && idade == 40)) {
                mobile++;
            } if (categoria == 4 && genero == 3 && idade == 30) {
                full++;
            }
            
            cont++;
            soma += idade;
            leia.nextLine();

        
	          System.out.println("Média de idade das pessoas que responderam a pesquisa: " + (cont > 0 ? soma / cont : 0));
	          System.out.println("Número de pessoas desenvolvedoras Backend: " + back);
	          System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + front);
	          System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobile);
	          System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + full);
	          System.out.println("Número de total de pessoas que responderam à pesquisa:" + cont);
	          
 }
}

