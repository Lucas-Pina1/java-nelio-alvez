import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//		mensagem explicativa, conforme exemplos.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int firstNumber = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int secondNumber = sc.nextInt();

		int sum = firstNumber + secondNumber;

		System.out.printf("A soma é: %d", sum);

		sc.close();

	}

}
