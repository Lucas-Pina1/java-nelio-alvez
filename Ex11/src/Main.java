import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//		seguir, calcule e mostre o valor da conta a pagar.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do item que quer pedir (1 até 5): ");
		int itemCode = sc.nextInt();

		double price;
		int qtd;
		double total;

		if (itemCode == 1) {
			price = 4.0;
			System.out.println("Digite a quantidade de itens: ");
			qtd = sc.nextInt();
			total = price * qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemCode == 2) {
			price = 4.50;
			System.out.println("Digite a quantidade de itens: ");
			qtd = sc.nextInt();
			total = price * qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemCode == 3) {
			price = 5.00;
			System.out.println("Digite a quantidade de itens: ");
			qtd = sc.nextInt();
			total = price * qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemCode == 4) {
			price = 2.00;
			System.out.println("Digite a quantidade de itens: ");
			qtd = sc.nextInt();
			total = price * qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (itemCode == 5) {
			price = 1.50;
			System.out.println("Digite a quantidade de itens: ");
			qtd = sc.nextInt();
			total = price * qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else {
			System.out.println("Item invalido");
		}

		sc.close();

	}

}
