import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		String strAnimal1,strAnimal2,strAnimal3;
		
		strAnimal1 = teclado.nextLine();
		strAnimal2 = teclado.nextLine();
		strAnimal3 = teclado.nextLine();
		
		if (strAnimal1.equals("vertebrado")) {
			if (strAnimal2.equals("ave")) {
				if (strAnimal3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else {
				if (strAnimal3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if (strAnimal2.equals("inseto")) {
				if (strAnimal3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
			}
			else {
				if (strAnimal3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
		}
	}
}