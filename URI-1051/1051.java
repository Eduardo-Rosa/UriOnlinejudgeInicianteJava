import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		double doubleRenda, doubleAux;

		doubleRenda = teclado.nextDouble();
		
		if (doubleRenda >= 0.00 && doubleRenda <= 2000.00) {
			System.out.println("Isento");
		}
		else if (doubleRenda > 2000.00 && doubleRenda <= 3000.00) {
			System.out.printf("R$ %.2f\n",(doubleRenda-2000)*8/100);
		}
		else if (doubleRenda > 3000.00 && doubleRenda <= 4500.00) {
			doubleAux = (1000*8/100) + ((doubleRenda-3000)*18/100);
			System.out.printf("R$ %.2f\n",doubleAux);
		}
		else {
			doubleAux = (1000*8/100) + (1500*18/100) + ((doubleRenda-4500)*28/100);
			System.out.printf("R$ %.2f\n",doubleAux);
		}

	}
}