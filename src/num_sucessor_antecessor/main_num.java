package num_sucessor_antecessor;
import java.util.Scanner;

//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

public class main_num {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		
		System.out.println("O sucessor do numero " + num + " e: " + (num - 1)  + " e seu antecessor e: " + (num + 1));
	}

}
