import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

public class Ex4_ImparPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantNumeros;
		int par = 0, impar = 0;

		System.out.print("Qunatidade de numeros: ");
		quantNumeros = sc.nextInt();
		System.out.println();

		int count = 0;

		do {
			System.out.print("Digite: ");
			int N = sc.nextInt();

			if (N % 2 == 0) par++;
			else impar++;

			count++;

		} while (count < quantNumeros);

		System.out.println("quantidades par: " + par +" quantidades Impares: " + impar);

		sc.close();
	}

}
