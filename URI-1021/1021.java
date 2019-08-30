import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		float dinheiro;
		int intValor , intValorCentavos;
		dinheiro = teclado.nextFloat();
		intValor = (int)dinheiro;
		intValorCentavos = (int)Math.round((dinheiro - (int)dinheiro) * 100);
		
	
		System.out.println("NOTAS:");

		System.out.printf("%d nota(s) de R$ 100.00\n", intValor/100);
		intValor = intValor % 100;

		System.out.printf("%d nota(s) de R$ 50.00\n", intValor/50);
		intValor = intValor % 50;

		System.out.printf("%d nota(s) de R$ 20.00\n", intValor/20);
		intValor = intValor % 20;

		System.out.printf("%d nota(s) de R$ 10.00\n", intValor/10);
		intValor = intValor % 10;

		System.out.printf("%d nota(s) de R$ 5.00\n", intValor/5);
		intValor = intValor % 5;

		System.out.printf("%d nota(s) de R$ 2.00\n", intValor/2);
		intValor = intValor % 2;

		if (intValor == 1){
            
			intValorCentavos = intValorCentavos + 100;
		}
            
		System.out.println("MOEDAS:");
		
		System.out.printf("%d moeda(s) de R$ 1.00\n", intValorCentavos/100);
		intValorCentavos = intValorCentavos % 100;

		System.out.printf("%d moeda(s) de R$ 0.50\n", intValorCentavos/50);
		intValorCentavos = intValorCentavos % 50;

		System.out.printf("%d moeda(s) de R$ 0.25\n", intValorCentavos/25);
		intValorCentavos = intValorCentavos % 25;

		System.out.printf("%d moeda(s) de R$ 0.10\n", intValorCentavos/10);
		intValorCentavos = intValorCentavos % 10;

		System.out.printf("%d moeda(s) de R$ 0.05\n", intValorCentavos/5);
		intValorCentavos = intValorCentavos % 5;

		System.out.printf("%d moeda(s) de R$ 0.01\n", intValorCentavos/1);
		intValorCentavos = intValorCentavos % 1;

	}
}