import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner teclado = new Scanner(System.in);
        
		int intA = teclado.nextInt();
		int intB = teclado.nextInt();
		int intC = teclado.nextInt();
		int intD = teclado.nextInt();
        
		int dif = ((intA * intB) - (intC * intD));
        
		System.out.println("DIFERENCA = " + dif);
        
	}
}
