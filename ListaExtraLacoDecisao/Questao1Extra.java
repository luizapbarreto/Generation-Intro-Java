package ListaExtraLacoDecisao;

import java.util.Scanner;

public class Questao1Extra {
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.*/
	public static void main(String[] args) {
		
		int idade,dias,meses,ano,total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade em anos: ");
		ano = leia.nextInt();
		System.out.println("\nDigite sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite sua idade em dias: ");
		dias = leia.nextInt();
		
		total = ano * 365 + meses * 30 + dias;
		
		System.out.println("\nSua idade em dias: "+total);
	}

}
