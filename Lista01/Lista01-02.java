import java.util.Scanner;
class questao02 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int AnoNasc;
		System.out.print("Informe o seu ano de Nascimento >> ");
		AnoNasc = input.nextInt();

		AnoNasc = 2018 - AnoNasc;
		System.out.println("Sua idade é >> "+ AnoNasc);
	}
}