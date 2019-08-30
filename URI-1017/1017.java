import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
        
		Scanner teclado = new Scanner(System.in);
        
		double doubleTempo, doubleVelocidade, doubleDistancia, doubleConsumo;

		doubleTempo = teclado.nextDouble();
		doubleVelocidade = teclado.nextDouble();
		
		doubleDistancia = doubleTempo * doubleVelocidade;
		doubleConsumo = doubleDistancia / 12;

		System.out.printf("%.3f\n", doubleConsumo);
		
	}
}