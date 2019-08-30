import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner teclado = new Scanner(System.in);
        
		String strNome = teclado.nextLine();
		double salarioFixo = teclado.nextDouble();
		double totalVendas = teclado.nextDouble();
		
		double salarioTotal = salarioFixo + (totalVendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f", salarioTotal);
		System.out.println();
	}
}
