import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		double doubleA, doubleB, doubleC, doubleDelta, doubleBhaskara1, doubleBhaskara2;
		doubleA = teclado.nextDouble();
		doubleB = teclado.nextDouble();
		doubleC = teclado.nextDouble();

		doubleDelta = ((doubleB*doubleB) - (4*doubleA*doubleC));
		
		if (doubleDelta < 0 || doubleA == 0){
			System.out.printf("Impossivel calcular\n");	
		}
		else{
			doubleBhaskara1 = ((doubleB * -1) + Math.sqrt(doubleDelta))/(2 * doubleA);
			doubleBhaskara2 = ((doubleB * -1) - Math.sqrt(doubleDelta))/(2 * doubleA);

			System.out.printf("R1 = %.5f\n",doubleBhaskara1);	
			System.out.printf("R2 = %.5f\n",doubleBhaskara2);	
        }
    }
}
