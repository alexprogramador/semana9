package livroexercicios;

import java.util.Scanner;

public class variaveisexer {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System. out.println("Digite o valor do deposito:");
		double valorDeposito = scanner.nextDouble();
		double taxaDeJuros = 1.19;
		double rendimentoMes = valorDeposito + taxaDeJuros/100.0;
		System.out.println("Rendimento ao mês: " + rendimentoMes);
		
		System.out.println("Digite o periodo:");
		double tempo = scanner.nextDouble();
		
		double resultado =  rendimentoMes + tempo; 
		
		System.out.println("Resultado R$: " + resultado);
		
		scanner.close();
	
		
		
		
		
		
		
		
		
		

	}

}
