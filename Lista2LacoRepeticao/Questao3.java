package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao3 {
/*3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
	public static void main(String[] args) {
		
		int menorIdade=0,maiorIdade=0,idade=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99)
		{
			System.out.println("\nDigite idade ou -99 para sair do sistema: ");
			idade = leia.nextInt();
			if(idade<0)
			{
				System.out.println("\nSaindo...");
			}
			else
			{
				if(idade<21)
				{
					menorIdade++;
				}
				else if(idade>50)
				{
					maiorIdade++;
				}
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+menorIdade);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+maiorIdade);
		

	}

}
