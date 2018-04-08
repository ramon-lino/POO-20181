import java.util.Scanner;
class questao06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int diarias;
		float total;
		System.out.print("Digite o numero de Diarias >> ");
		diarias = input.nextInt();
		total = somaDispesas(diarias);
		System.out.println("Dispesas total >> R$ "+ total);
	}
	public static float somaDispesas(int d) {
		float diaBruto = 60 * d;
		float taxa;
		float total;
		if ( d >= 15 ) {
			taxa = 5.50f * d;
		} else if ( d == 15 ) {
			taxa = 6 * d;
		} else {
			taxa = 8 * d;
		}
		total = diaBruto + taxa;
		return total;
	}
}