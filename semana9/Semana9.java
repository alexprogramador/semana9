package semana9;


import java.util.Scanner;
public class Semana9
{

public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Entre com o Valor a sua idade");
int idade = scanner.nextInt();
if (idade <=14) {
System.out.println("Você foi classificada como criança!");
}
else {
System.out.println("Você não é uma criança!");

scanner.close();
}

}
}