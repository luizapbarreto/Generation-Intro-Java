package ListaExtraLacoDecisao;

import java.util.Scanner;

public class Questao3extra {
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */
	public static void main(String[] args) {
		
		int segundos,horas,minutos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nTempo de dura��o do evento em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = ((segundos%3600)/60);
		segundos = ((segundos%3600)/60);
		
		System.out.println("\nA dura��o do evento foi de: "+horas+" horas "+minutos+" minutos "+segundos+" segundos");
			
		

	}

}
