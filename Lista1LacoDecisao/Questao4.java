package Lista1LacoDecisao;

import java.util.Scanner;

public class Questao4 {
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) {
		
		float numero;
		double raiz,quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		numero = leia.nextFloat();
		
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf(numero+" É um numero par e sua raiz quadrada é: %2.2f",raiz);
		}
		else
		{
			quadrado = Math.pow(numero, 2);
			System.out.println(numero+" É um numero ímpar");
			System.out.println("\nelevado ao quadrado é: "+quadrado);
		}

	}

}
