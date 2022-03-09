import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age = 0;
		
		while (true){
			System.out.print("Nome: ");
			name = sc.next();
			if (name.equals("0"))break;
			
			System.out.print("Idade: ");
			age = sc.nextInt();
		}
		
		
		System.out.println("Fim");
		
		
		
		
		
		sc.close();
	}

}
