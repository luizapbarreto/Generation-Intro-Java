package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao2 {
/*2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	public static void main(String[] args) {
	
		int x,numero,quantPar=0,quantImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nDigite o "+x+"� numero: ");
			numero = leia.nextInt();
			if(numero%2==0)
			{
				quantPar++;
			}
			else
			{
				quantImpar++;
			}
		}
		System.out.println("\nQuantidade de numeros pares digitados: "+quantPar);
		System.out.println("\nQuantidade de numeros impares digitados: "+quantImpar);

	}

}
