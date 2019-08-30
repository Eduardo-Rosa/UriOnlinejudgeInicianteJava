import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		double doubleDistancia, doubleTempo;

		doubleDistancia = teclado.nextDouble();
		
		doubleTempo = 150 / 60 * doubleDistancia;

		System.out.printf("%.0f minutos\n", doubleDistancia*2);
		
	}
}