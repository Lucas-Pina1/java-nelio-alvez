import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//		decimais

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero referente ao funcionario: ");
		int id = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas referente ao funcionario: ");
		double workedHours = sc.nextDouble();
		System.out.println("Digite o valor por de hora de trabalho referente ao funcionario: ");
		double perHourValue = sc.nextDouble();

		double salary = workedHours * perHourValue;

		System.out.println("NUMBER: " + id);
		System.out.printf("SALARY: U$ %.2f", salary);

		sc.close();

	}

}
