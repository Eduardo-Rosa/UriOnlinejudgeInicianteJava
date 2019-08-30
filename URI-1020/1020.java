import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
        
		Scanner teclado = new Scanner(System.in);
		
		int intIdade, intAno, intMes;
		intIdade = teclado.nextInt();
		
		if (intIdade >= 365){
			intAno = intIdade / 365;
			intIdade = intIdade % 365;
			System.out.printf("%d ano(s)\n", intAno);
		}
		else{
			System.out.printf("0 ano(s)\n");
		}
		
		if (intIdade >= 30){
			intMes = intIdade / 30;
			intIdade = intIdade % 30;
			System.out.printf("%d mes(es)\n", intMes);
		}
		else{
			System.out.printf("0 mes(es)\n");
		}
		
		System.out.printf("%d dia(s)\n", intIdade);

	}
}