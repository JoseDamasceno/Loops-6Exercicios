import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/
public class Ex3_MaiorMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		int larger = 0;
		int plus = 0;

		System.out.println("Enter five notes Studant:");
		int count = 0;

		do {
			System.out.print("Enter note: ");
			number = sc.nextInt();

			plus = plus  + number;

			if (number > larger)
				larger = number;

			count += 1;
		} while (count < 5);

	
		System.out.println("Larger: " + larger);
		System.out.println("Avagere: " + ( plus/5));

		sc.close();
	}

}
