package ListaExtraLacoDecisao;

import java.util.Scanner;

public class Questao2Extra {
/*2. Faça um sistema que leia a idade de uma pessoa expressa 
 * em dias e mostre-a expressa em anos, meses e dias. 
 */
	public static void main(String[] args) {
		
		int idadeDias,ano,mes,dia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade expressa em dias: ");
		idadeDias = leia.nextInt();
		
		ano = idadeDias / 365;
		mes = (idadeDias%365) /30;
		dia = idadeDias - ano*365 - mes*30;
		
		System.out.println("\nSua idade é "+ano+" anos "+mes+" meses "+dia+" dias");

	}

}
