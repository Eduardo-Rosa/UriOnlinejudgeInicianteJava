import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		int intHorarioInicio, intHorarioFim, intDuracao;
        
		intHorarioInicio = teclado.nextInt();
		intHorarioFim = teclado.nextInt();

		if (intHorarioInicio >= intHorarioFim){
			intDuracao = (24 - intHorarioInicio) + intHorarioFim;
		}
		else {
			intDuracao = intHorarioFim - intHorarioInicio;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n",intDuracao);
	}
}