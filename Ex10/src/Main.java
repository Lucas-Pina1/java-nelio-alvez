import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial do jogo (0 a 24): ");
		int startTime = sc.nextInt();

		System.out.println("Digite a hora final do jogo (0 a 24): ");
		int finalTime = sc.nextInt();

		int duration;

		if (startTime < finalTime) {
			duration = finalTime - startTime;
		} else {
			duration = 24 - startTime + finalTime;
		}

		System.out.printf("O jogo durou %d Hora(s)", duration);

		sc.close();

	}

}
