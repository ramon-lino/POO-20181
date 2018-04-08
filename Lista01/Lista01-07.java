import java.util.Scanner;
class questao07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nota;
		System.out.print("Nota >> ");
		nota = input.nextInt();
		
		if ( nota >= 0 && nota <= 49 ) {
			System.out.println("Insuficiente !!");
		} else if ( nota >= 50 && nota <= 64 ) {
			System.out.println("Regular !!");
		} else if ( nota >= 64 && nota <=84 ) {
			System.out.println("Bom !!");
		} else {
			System.out.println("Otimo !!");
		}
	}
}