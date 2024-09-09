package exercicios;

import java.util.Scanner;

public class ExA_Diferença {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, result;
		
		System.out.print("Digite o primeiro o número: ");
		a = teclado.nextInt();
		
		System.out.print("Digite outro número: ");
		b = teclado.nextInt();
		
		if (a >= b) {
			result = a - b;
		}
		else {
			result = b - a;
		}
		System.out.printf("\nA difereça entre eles é: %d", result);
		
		teclado.close();
		

	}

}
