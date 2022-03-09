import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
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
