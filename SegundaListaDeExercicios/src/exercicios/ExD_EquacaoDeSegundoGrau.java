package exercicios;

import java.util.Scanner;

public class ExD_EquacaoDeSegundoGrau {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c, delta;
		
		System.out.print("Digite o valor de \"A\": ");
		a = teclado.nextDouble();
		System.out.print("Digite o valor de \"B\": ");
		b = teclado.nextDouble();
		System.out.print("Digite o valor de \"C\": ");
		c = teclado.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		if (delta < 0) {
			System.out.printf("\nNão há solução real.\nDelta é: %.2f", delta);
		}
		else if(delta > 0) {
			System.out.printf("\nHá duas soluções reais, e diferentes.\nDelta é: %.2f", delta);
		}
		else if(delta == 0) {
			System.out.printf("\nHá apenas uma solução real.\nDelta é: %.2f", delta);
		}
		else {
			System.out.print("\nAlgo deu errado!\nTente novamente!");
		}
		
		teclado.close();

	}

}
