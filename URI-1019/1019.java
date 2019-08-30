import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
        
		Scanner teclado = new Scanner(System.in);
        
		int N, intHora, intMinuto;
		N = teclado.nextInt();
		
		if (N >= 3600){
			intHora = N / 3600;
			N = N % 3600;
			System.out.printf("%d:", intHora);
		}
        
		else{
			System.out.printf("0:");
		}
		
		if (N >= 60){
			intMinuto = N / 60;
			N = N % 60;
			System.out.printf("%d:", intMinuto);
		}
        
		else{
			System.out.printf("0:");
		}
		
		System.out.printf("%d\n", N);
	}
}
