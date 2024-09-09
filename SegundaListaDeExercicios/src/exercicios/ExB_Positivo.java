package exercicios;

import java.util.Scanner;

public class ExB_Positivo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número: ");
		n = teclado.nextInt();
		
		if(n < 0) {
			n = n * (-1);
		}
		System.out.printf("\nO número positivo é: %d", n);
		
		teclado.close();

	}

}
