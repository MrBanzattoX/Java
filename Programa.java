
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ol� ! Eu sou Zeus.");
		System.out.println("Qual o seu nome ?");
				
		String nome = input.nextLine();
		
		if (nome.contentEquals("Banzatto"))
			System.out.println("Ol� mestre, bemvindo de volta");
		else
			System.out.println("Prazer em conhec�-lo "+ nome + "\nSeja bemvindo");
		
		System.out.println("Qual o seu ano de nascimento?");
		int ano = input.nextInt();
		int corrente = 2019;
		int idade = corrente - ano;
		
		System.out.println( nome +" Sua idade � " + idade );
				
		System.out.println("A B C D E F G" .toCharArray());
		System.out.println("Aula de Java" .split(""));
		
		
		System.out.println("Vamos fazer uma contagem:");
				
		int contador = 0;
		while ( contador <= 5) { System.out.println("Repeti��o nr: " + contador);
		contador ++;
		
		}
				

	}

}
