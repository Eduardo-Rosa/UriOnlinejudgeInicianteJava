import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		float floatA, floatB, floatC, floatPerimetro, floatArea;
		
		floatA = teclado.nextFloat();
		floatB = teclado.nextFloat();
		floatC = teclado.nextFloat();

		floatPerimetro = floatA + floatB + floatC;
		floatArea = (floatC * (floatA + floatB)) /2;

		if (((floatB + floatC) > floatA) && ((floatA + floatB) > floatC) && ((floatA + floatC) > floatB)){
            // calcular o perimetro ;)
			System.out.printf("Perimetro = %.1f\n",floatPerimetro);
		}
		else{			
            // calcular a area ;)
			System.out.printf("Area = %.1f\n",floatArea);
		}
	}
}