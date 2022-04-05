package Lista3Arrays;

import java.util.Scanner;

public class Questao4 {
/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido 
e o resultado da adição da constante deve ser armazenado na própria matriz.*/

	public static void main(String[] args) {
		
		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		int[][] m3 = new int[2][2];
		int l, c, op, a;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++) 
			{
				System.out.println("\nDigite um valor: ");
				m1[l][c] = leia.nextInt();
			}
		}
		for(l=0;l<2;l++)
		{
			for(c=0;c<2;c++) 
			{
				System.out.println("\nDigite um valor: ");
				m2[l][c] = leia.nextInt();
			}
		}
		System.out.println("\n-----------------MENU OPÇÕES-----------------");
		System.out.println("\n(1) somar as duas matrizes");
		System.out.println("\n(2) subtrair a primeira matriz da segunda");
		System.out.println("\n(3) adicionar uma constante as duas matrizes");
		System.out.println("\n(4) imprimir as matrizes ");
		System.out.println("\n----------------------------------------------");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		if(op==1)
		{
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++) 
				{
					m3[l][c] = m1[l][c] + m2[l][c];
					System.out.println("\nSoma das matrizes: "+m3[l][c]);
				}
			}
		}
		if(op==2)
		{
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++) 
				{
					m3[l][c] = m1[l][c] - m2[l][c];
					System.out.println("\nDiferença das matrizes: "+m3[l][c]);
				}
			}
		}
		if(op==3)
		{
			System.out.println("\nDigite o valor da constante: ");
			a = leia.nextInt();
			m1[0][0] = a;
			m2[0][0] = a;
			System.out.println("\nAdicionando constante...");
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++) 
				{
					System.out.println("\nMatriz 1: "+m1[l][c]);
					System.out.println("\nMatriz 2: "+m2[l][c]);
					
				}
			}
		}
		if(op==4)
		{
			for(l=0;l<2;l++)
			{
				for(c=0;c<2;c++) 
				{
					System.out.println("\nMatriz 1");
					System.out.println(m1[l][c]);
					System.out.println("\nMatriz 2");
					System.out.println(m2[l][c]);
					System.out.println("\nMatriz Resultado");
					System.out.println(m3[l][c]);
					
				}
			}
		}
		

	}

}
