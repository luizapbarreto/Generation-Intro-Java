package Lista1LacoDecisao;

import java.util.Scanner;

public class Questao4 {
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) {
		
		float numero;
		double raiz,quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		numero = leia.nextFloat();
		
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf(numero+" � um numero par e sua raiz quadrada �: %2.2f",raiz);
		}
		else
		{
			quadrado = Math.pow(numero, 2);
			System.out.println(numero+" � um numero �mpar");
			System.out.println("\nelevado ao quadrado �: "+quadrado);
		}

	}

}
