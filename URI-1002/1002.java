import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner teclado = new Scanner(System.in);
        
		double doublePi = 3.14159;
		double doubleRaio = teclado.nextDouble();
		double doubleArea = doublePi * Math.pow(raio, 2);
		System.out.printf("A=%.4f", doubleArea);
		System.out.println();
 
    }
 
}
