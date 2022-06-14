package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		/*
		 * Consegna base
		 * 
		 * Rettangolo rettangoloUtente = new Rettangolo();
		 * 
		 * System.out.println("Ciao bevenuto al calcola il tuo Rettangolo!");
		 * System.out.println("Inserisci i parametri del tuo rettangolo:");
		 * System.out.print("Inserisci la base: "); rettangoloUtente.base =
		 * scan.nextInt(); System.out.print("Inserisci l'altezza: ");
		 * rettangoloUtente.altezza = scan.nextInt();
		 * 
		 * System.out.println("L'area del tuo triangolo è " +
		 * rettangoloUtente.calcolaarea());
		 * System.out.println("Il Perimetro del tuo triangolo è " +
		 * rettangoloUtente.calcoloperimetro());
		 */

		// Bonus
		int areamaggiore = 0;
		Rettangolo ret1 = new Rettangolo();
		Rettangolo ret2 = new Rettangolo();

		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci la base del rettangolo");
			ret1.altezza = scan.nextInt();
			System.out.println("Inserisci l'altezza del rettangolo");
			ret1.base = scan.nextInt();

			if (ret1.calcolaarea() >= areamaggiore) {
				areamaggiore = ret1.calcolaarea();
				ret2.altezza = ret1.altezza;
				ret2.base = ret1.base;

			}

		}
		System.out.println(" Il rettangolo con area maggiore è " + ret2.calcolaarea());
		scan.close();
	}

}
