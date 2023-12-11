package modulo10;

import java.util.Scanner;

public class LoopFor2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1,num2, num3,num4, num5, num6, num7, num8, num9, num10, x=0, par=0, impar=0;
		
		System.out.println("Entre com o 1° número");
		num1 = read.nextInt();
		System.out.println("Entre com o 2° número");
		num2 = read.nextInt();
		System.out.println("Entre com o 3° número");
		num3 = read.nextInt();
		System.out.println("Entre com o 4° número");
		num4 = read.nextInt();
		System.out.println("Entre com o 5° número");
		num5 = read.nextInt();
		System.out.println("Entre com o 6° número");
		num6 = read.nextInt();
		System.out.println("Entre com o 7° número");
		num7 = read.nextInt();
		System.out.println("Entre com o 8° número");
		num8 = read.nextInt();
		System.out.println("Entre com o 9° número");
		num9 = read.nextInt();
		System.out.println("Entre com o 10° número");
		num10 = read.nextInt();
				
		 for (x = num1; x <= num10; x++) {
	            if (x % 2 == 0) {
	                par++;
	            } else {
	                impar++;
	            }
	        }

	        System.out.println("A quantidade de números pares nesse intervalo é: " + par);
	        System.out.println("A quantidade de números ímpares nesse intervalo é de: " + impar);

	        read.close();
	    }
	}