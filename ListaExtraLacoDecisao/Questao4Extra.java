package ListaExtraLacoDecisao;

import java.util.Scanner;

public class Questao4Extra {
/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e 
 * calcule a seguinte expressão: d = r+s/2 onde r = (a+b)2 e s= (b+c)2
 */
	public static void main(String[] args) {
		
		int a,b,c=0;
		double r,s,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero");
		a = leia.nextInt();
		System.out.println("\nDigite o segundo numero");
		b = leia.nextInt();
		System.out.println("\nDigite o terceiro numero");
		c = leia.nextInt();
		
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		
		
		d = (r + s) / 2;
		
		System.out.println("\nResultado: "+d);
		
		
		

	}

}
