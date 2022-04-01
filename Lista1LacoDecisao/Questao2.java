package Lista1LacoDecisao;

import java.util.Scanner;

public class Questao2 {
	//2-	Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero: ");
		a = leia.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		b = leia.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente: "+a+","+b+","+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente: "+a+","+c+","+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente: "+b+","+a+","+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente: "+b+","+c+","+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente: "+c+","+a+","+b);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+c+","+b+","+a);
		}
	}

}
