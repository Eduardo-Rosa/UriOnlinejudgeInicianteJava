import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner teclado = new Scanner(System.in);
        
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        
		System.out.printf("MEDIA = %.1f", media);
		System.out.println();
	}
}
