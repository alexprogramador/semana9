package variav;

import java.util.Scanner;
public class variAv3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System. out. println ("Digite o salário em R$: ");
		double salario = scanner. nextDouble();
		double taxaImposto = 5;
		double impostoRenda = salario - taxaImposto/100.0;
		System. out.println("O imposto a pagar é R$: " + impostoRenda);
		
		scanner.close();
		

	}

}
