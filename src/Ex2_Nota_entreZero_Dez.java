import java.util.Scanner;
/*
Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido
e continue pedindo
at� que o usu�rio informe um valor v�lido.
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
