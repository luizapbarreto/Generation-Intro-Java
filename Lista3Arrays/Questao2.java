package Lista3Arrays;

import java.util.Scanner;

public class Questao2 {
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int x, somaPar=0, contImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nDigite um numero: ");
			numeros[x] = leia.nextInt();
			if(numeros[x]%2==0)
			{
				somaPar += numeros[x];	
			}
			else
			{
				contImpar++;
			}
		}
		
		for(x=0;x<6;x++)
		{
			if(numeros[x]%2==0)
			{
				System.out.println("Numeros pares: "+numeros[x]);		
			}
			
		}
		for(x=0;x<6;x++)
		{
			if(numeros[x]%3==0)
			{
				System.out.println("Numeros imapres: "+numeros[x]);	
			}
		}
		
		System.out.println("\nSoma dos numeros pares: "+somaPar);
		System.out.println("\nQuantidade de numeros impares: "+contImpar);

	}

}
