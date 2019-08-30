import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		int intValor;
		intValor = teclado.nextInt();

		System.out.println(intValor);

		System.out.printf("%d nota(s) de R$ 100,00\n", intValor/100);
		intValor = intValor % 100;

		System.out.printf("%d nota(s) de R$ 50,00\n", intValor/50);
		intValor = intValor % 50;

		System.out.printf("%d nota(s) de R$ 20,00\n", intValor/20);
		intValor = intValor % 20;

		System.out.printf("%d nota(s) de R$ 10,00\n", intValor/10);
		intValor = intValor % 10;

		System.out.printf("%d nota(s) de R$ 5,00\n", intValor/5);
		intValor = intValor % 5;

		System.out.printf("%d nota(s) de R$ 2,00\n", intValor/2);
		intValor = intValor % 2;

		System.out.printf("%d nota(s) de R$ 1,00\n", intValor/1);
		intValor = intValor % 1;
	}
}