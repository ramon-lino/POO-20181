import java.util.Scanner;
class questao01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int metrosSeg;
		double kiloHora;
		System.out.print("Informe a distancia (m/s) >> ");
		metrosSeg = input.nextInt();
		
		kiloHora = metrosSeg * 3.6;
		System.out.println("Distancia em (km/h) >> "+ kiloHora);
	}
}