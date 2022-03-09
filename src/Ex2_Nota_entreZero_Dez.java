import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota_entreZero_Dez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int note = 0;
		
		System.out.print("Enter with number at 0 the 10 :");
		note = sc.nextInt();

		while (note > 10 || note < 0) {
			System.out.print("Note invalid! Enter again: to exit Enter [00] ");
			note = sc.nextInt();
			if (note==00)break;
		}
		
		System.out.println("Note Entered " + note + ":" + "Finished");

		sc.close();
	}

}
