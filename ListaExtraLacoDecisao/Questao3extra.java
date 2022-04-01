package ListaExtraLacoDecisao;

import java.util.Scanner;

public class Questao3extra {
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */
	public static void main(String[] args) {
		
		int segundos,horas,minutos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nTempo de duração do evento em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = ((segundos%3600)/60);
		segundos = ((segundos%3600)/60);
		
		System.out.println("\nA duração do evento foi de: "+horas+" horas "+minutos+" minutos "+segundos+" segundos");
			
		

	}

}
