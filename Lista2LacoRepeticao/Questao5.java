package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao5 {
/*5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, 
 * mostre a soma dos números digitados.(DO...WHILE)
 */
	public static void main(String[] args) {
		
		int numero,soma=0;
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nDigite um numero: ");
			numero = leia.nextInt();
			soma += numero;
		}
		while(numero!=0);
		System.out.println("\nA soma dos numeros é: "+soma);

	}

}
