package Lista3Arrays;

import java.util.Scanner;

public class Questao3 {
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int linha,coluna,cont=0,maior10;
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nDigite um valor: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					cont++;
					maior10 = matriz[linha][coluna];
					System.out.println(maior10);
				}
			}
		}
		System.out.println("\nQuantidade de valores maiores que 10: "+cont);

	}

}
