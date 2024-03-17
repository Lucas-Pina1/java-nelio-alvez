import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto 1: ");
		int codeOfProduct1 = sc.nextInt();
		System.out.println("Quantas unidades do produto 1: ");
		int unitsOfProduct1 = sc.nextInt();
		System.out.println("Digite o preço por unidade: ");
		double priceOfProduct1 = sc.nextDouble();

		System.out.println("Digite o código do produto 2: ");
		int codeOfProduct2 = sc.nextInt();
		System.out.println("Quantas unidades do produto 2: ");
		int unitsOfProduct2 = sc.nextInt();
		System.out.println("Digite o preço por unidade: ");
		double priceOfProduct2 = sc.nextDouble();

		double total = unitsOfProduct1 * priceOfProduct1 + unitsOfProduct2 * priceOfProduct2;

		System.out.println("Produtos no carrinho: ");
		System.out.printf("ITEM: %d, QTD: %d%n", codeOfProduct1, unitsOfProduct1);
		System.out.printf("ITEM: %d, QTD: %d%n", codeOfProduct2, unitsOfProduct2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);

		sc.close();
	}

}
