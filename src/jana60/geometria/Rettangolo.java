package jana60.geometria;

public class Rettangolo {

//Parametri base
	int base;
	int altezza;

	// Calcolo area
	int calcolaarea() {
		int area = base * altezza;
		return area;
	}

// Calcolo perimetro
	int calcoloperimetro() {
		int perimetro = (base * 2) + (altezza * 2);
		return perimetro;
	}
}
