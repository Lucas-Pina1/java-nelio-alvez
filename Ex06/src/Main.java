import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//		mostre: 
//		a) a área do triângulo retângulo que tem A por base e C por altura. 
//		b) a área do círculo de raio C. (pi = 3.14159) 
//		c) a área do trapézio que tem A e B por bases e C por altura. 
//		d) a área do quadrado que tem lado B. 
//		e) a área do retângulo que tem lados A e B.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double PI = 3.14159;

		System.out.println("Digite o valor de A: ");
		double A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double C = sc.nextDouble();

		double triangleArea = A * C / 2;
		double circleArea = PI * Math.pow(C, 2);
		double trapezeArea = (A + B) / 2.0 * C;
		double squareArea = Math.pow(B, 2);
		double rectangleArea = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangleArea);
		System.out.printf("CIRCULO: %.3f%n", circleArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);
		System.out.printf("QUADRADO: %.3f%n", squareArea);
		System.out.printf("RETANGULO: %.3f%n", rectangleArea);

		sc.close();

	}

}
