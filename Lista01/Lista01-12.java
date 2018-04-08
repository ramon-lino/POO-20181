import java.util.Scanner;
class questao12 {
	public static void main (String[] args) {
		System.out.println(" Quadrado |   Cubo ");
		for (int i = 1; i <= 10; i++) {
			double quadrado, cubo;
			quadrado = Math.pow( i, 2 );
			cubo = Math.pow( i, 3 );
			System.out.print("| " + quadrado);
			formata(quadrado);
			System.out.print(cubo);
			formata(cubo);
			System.out.println("");
		}
	}
	public static void formata(double q) {
		if ( q < 10.0) {
			System.out.print("     |  ");
		} else if ( q < 100.0 && q >= 10) {
			System.out.print("    |  ");
		} else if ( q >= 100.0 && q < 1000.0 ) {
			System.out.print("   |  ");
		} else {
			System.out.print("  |  ");
		}
	}
}