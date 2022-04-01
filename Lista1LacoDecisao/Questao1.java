package Lista1LacoDecisao;

import java.util.Scanner;

//1-	Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Questao1 {

	public static void main(String[] args) {
		
		int n1,n2,n3,maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		n3 = leia.nextInt();
		
		maior = n1;
		
		if(maior<n2)
		{
			maior = n2;
		}	
		if(maior<n3)
		{
			maior = n3;
		}
		System.out.println("\nO maior numero foi: "+maior);

	}
	
}
