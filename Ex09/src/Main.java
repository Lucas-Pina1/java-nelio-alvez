import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//		ordem crescente ou decrescente

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int numberA = sc.nextInt();

		System.out.println("Digite outro numero inteiro: ");
		int numberB = sc.nextInt();

		boolean isMultiple = numberA % numberB == 0 || numberB % numberA == 0;

		if (isMultiple) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");

		}

		sc.close();

	}

}
