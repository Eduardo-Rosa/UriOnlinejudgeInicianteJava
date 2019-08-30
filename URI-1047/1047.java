import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		int intHoraInicio, intMinutoInicio, intHoraFim, intMinutoFim, intTempoInicial, intTempoFim, intDuracaoHora, intDuracaoMinuto;
        
		intHoraInicio = teclado.nextInt();
		intMinutoInicio = teclado.nextInt();
		intHoraFim = teclado.nextInt();
		intMinutoFim = teclado.nextInt();

		intTempoInicial = intMinutoInicio + (intHoraInicio * 60);
		intTempoFim = intMinutoFim + (intHoraFim * 60);
		
		if (intTempoInicial >= intTempoFim){
			intDuracaoHora = ((1440 - intTempoInicial) + intTempoFim)/60;
		}
		else {
			intDuracaoHora = (intTempoFim - intTempoInicial)/60;
		}
		
		if (intMinutoInicio > intMinutoFim){
			intDuracaoMinuto = (60 - intMinutoInicio) + intMinutoFim;
		}
		else {
			intDuracaoMinuto = Math.abs(intMinutoFim - intMinutoInicio);
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",intDuracaoHora,intDuracaoMinuto);

	}
}