import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner teclado = new Scanner(System.in);
		int intNum = teclado.nextInt();
		int intHrs = teclado.nextInt();
		double valorHora = teclado.nextDouble();
		double sal = intHrs * valorHora;
		
		System.out.println("NUMBER = " + intNum);
		System.out.printf("SALARY = U$ %.2f", sal);
		System.out.println();
	}
}
