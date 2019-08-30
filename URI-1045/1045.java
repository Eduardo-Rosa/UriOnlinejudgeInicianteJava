import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		
		float floatValorA,floatValorB,floatValorC,floatTemp;
		floatValorA = teclado.nextFloat();
		floatValorB = teclado.nextFloat();
		floatValorC = teclado.nextFloat();

	    if (floatValorA < floatValorB) {
	        floatTemp = floatValorA;
	        floatValorA = floatValorB;
	        floatValorB = floatTemp;
	    }
	    if (floatValorB < floatValorC) {
	        floatTemp = floatValorB;
	        floatValorB = floatValorC;
	        floatValorC = floatTemp;
	    }
	    if (floatValorA < floatValorB) {
	        floatTemp = floatValorA;
	        floatValorA = floatValorB;
	        floatValorB = floatTemp;
	    }

		if (floatValorA >= (floatValorB+floatValorC)){
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if ((floatValorA*floatValorA) == (floatValorB*floatValorB+floatValorC*floatValorC)){
			System.out.println("TRIANGULO RETANGULO");
		}
		else if ((floatValorA*floatValorA) > (floatValorB*floatValorB+floatValorC*floatValorC)){
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if ((floatValorA*floatValorA) < (floatValorB*floatValorB+floatValorC*floatValorC)){
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (floatValorA == floatValorB && floatValorB == floatValorC){
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if (floatValorA == floatValorB || floatValorB == floatValorC){
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}