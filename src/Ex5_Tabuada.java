import java.util.Scanner;

public class Ex5_Tabuada {
	/*
	 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero
	 * inteiro entre 1 a 10. O usu�rio deve informar de qual numero ele deseja ver a
	 * tabuada. A sa�da deve ser conforme o exemplo abaixo: Tabuada de 5: 5 X 1 = 5
	 * 5 X 2 = 10 ... 5 X 10 = 50
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada de " + tabuada);
        System.out.println();
        
        for (int i = 0; i <=10; i++) {
        	System.out.println(tabuada + " x " + i + " = "+ tabuada*i);
        }
        	
        
		
		
		
		sc.close();
	}

}
