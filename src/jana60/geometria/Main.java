package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Rettangolo rettangoloUtente = new Rettangolo();

		System.out.println("Ciao bevenuto al calcola il tuo Rettangolo!");
		System.out.println("Inserisci i parametri del tuo rettangolo:");
		System.out.println("Inserisci la base: ");
		rettangoloUtente.base = scan.nextInt();
		System.out.println("Inserisci l'altezza: ");
		rettangoloUtente.altezza = scan.nextInt();

		scan.close();
	}

}
