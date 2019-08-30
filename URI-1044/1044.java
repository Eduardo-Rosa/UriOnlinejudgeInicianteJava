import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		int intA, intB;
		
		intA = teclado.nextInt();
		intB = teclado.nextInt();

		if ((intA % intB == 0) || (intB % intA == 0)){
			System.out.println("Sao Multiplos");
		}
		else{
			System.out.println("Nao sao Multiplos");
		}
	}
}