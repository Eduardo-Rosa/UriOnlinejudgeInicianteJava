import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
        
		float floatValor1, floatValor2, floatValor3, floatValor4,
        floatMedia,floatExame,floatExameFinal;
		
		floatValor1 = teclado.nextFloat();
		floatValor2 = teclado.nextFloat();
		floatValor3 = teclado.nextFloat();
		floatValor4 = teclado.nextFloat();

		floatMedia = (floatValor1 * 2 + floatValor2 * 3 + floatValor3 * 4 + floatValor4 * 1 )/10;
		
		
		System.out.printf("Media: %.1f\n",floatMedia);
		
		if (floatMedia >= 7.0){
			System.out.printf("Aluno aprovado.\n");	
		}
        
		else if (floatMedia < 5.0){
			System.out.printf("Aluno reprovado.\n");	
		}
        
		else {
			System.out.printf("Aluno em exame.\n");
			floatExame = teclado.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",floatExame);
			floatExameFinal = ((floatMedia + floatExame) / 2); 
            
			if(floatExameFinal >= 5.0){
				System.out.printf("Aluno aprovado.\n");
				System.out.printf("Media final: %.1f\n",floatExameFinal);
			}
			else{
				System.out.printf("Aluno reprovado.\n");
				System.out.printf("Media final: %.1f\n",floatExameFinal);
			}
		}
	}
}