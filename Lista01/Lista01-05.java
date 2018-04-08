import java.util.Scanner;
class questao05 {
	public static void mesAno(int idem) {
		String primSemestre[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho"};
		String seguSemestre[] = {"Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		if ( idem <= 6 ) {
			System.out.println("Mes >> " + primSemestre[idem-1]);
		} else {
			System.out.println("Mes >> " + seguSemestre[idem-1]);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numMes;
		char mesResult[];
		System.out.print("Informe o numero correspondente ao mês do ano >> ");
		numMes = input.nextInt();
		mesAno(numMes);
	}
}