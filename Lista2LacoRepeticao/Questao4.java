package Lista2LacoRepeticao;

import java.util.Scanner;

public class Questao4 {
/*4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos 
 * indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
idade, sexo (1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.*/

	public static void main(String[] args) {
		
		int idade,sexo,op,pessoa=1,calmo=0,nervoso=0,agressivo=0,outro=0, pessoaNervosa=0, pessoaCalma=0;
		Scanner leia = new Scanner(System.in);
		
		while(pessoa<=150)
		{
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nSexo");
			System.out.println("\n(1)feminino  (2)maculino  (3)outro: ");
			sexo = leia.nextInt();
			System.out.println("\n(1)calmo  (2)nervoso  (3)agressivo: ");
			op = leia.nextInt();
			
			if(op==1)
			{
				calmo++;
			}
			if(sexo==2 && op==2)
			{
				nervoso++;
			}
			if(sexo==2 && op==3)
			{
				agressivo++;
			}
			
			if(sexo==3 && op==1)
			{
				outro++;
			}
			
			if(idade>40 && op==2)
			{
				pessoaNervosa++;
			}
			
			if(idade<18 && op==1)
			{
				pessoaCalma++;
			}
			pessoa++;
			
		}
		System.out.println("\nnúmero de pessoas calmas: "+calmo);
		System.out.println("\nnúmero de mulheres nervosas: "+nervoso);
		System.out.println("\nnúmero de homens agressivos: "+agressivo);
		System.out.println("\nnúmero de outros calmos: "+outro);
		System.out.println("\nnúmero de pessoas nervosas com mais de 40 anos: "+pessoaNervosa);
		System.out.println("\nnúmero de pessoas calmas com menos de 18 anos: "+pessoaCalma);
	}

}
