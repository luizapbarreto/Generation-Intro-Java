package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao6 {
/*6-	Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
	public static void main(String[] args) {
		
		int numero,cont=0,soma=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite um numero ou 0 para sair do sistema: ");
			numero = leia.nextInt();
			if(numero==0)
			{
				System.out.println("finalizando...");
			}
			else
			{
				if(numero%3==0)
				{
					soma += numero;
					cont++;
				}
				
			}
		}
		while(numero != 0);
		media = soma/cont;
		System.out.printf("\nMedia dos numeros multiplos de 3 é %6.2f: ",media);

	}

}
