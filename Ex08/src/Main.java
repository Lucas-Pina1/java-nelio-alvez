import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou
		// ímpar

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int number = sc.nextInt();

		boolean isEven = number % 2 == 0;

		if (isEven) {
			System.out.println("O numero é PAR");
		} else {
			System.out.println("O numero é IMPAR");
		}

		sc.close();

	}

}
