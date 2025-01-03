


package ex.variaveis2;

import java.util.Scanner;

public class Varex2 {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System. out. println("Digite a distancia km: ");
		double distancia = scanner.nextDouble();
		
		System.out.println("Digite o tempo: ");
		double tempo = scanner.nextDouble();
		
		double  velocidadeMedia = distancia/tempo;
		System.out.println("A velocidade Média foi de: " + velocidadeMedia+ " km/h");
		
		scanner.close();

	}

}
