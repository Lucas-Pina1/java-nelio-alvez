import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int C = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int D = sc.nextInt();

		int differenceBetweenProducts = ((A * B) - (C * D));

		System.out.printf("A diferença dos produtos de A * B - C * D : %d", differenceBetweenProducts);

		sc.close();

	}

}
