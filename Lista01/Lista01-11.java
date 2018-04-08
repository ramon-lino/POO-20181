import java.util.Scanner;
class questao11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantProd, aux;
		float somaResult = 0;
		System.out.print("Digite a Qtd. de produtos >> ");
		quantProd = input.nextInt();
		System.out.println("## Digite o código do produto ##");
		for ( int i = 0; i < quantProd; i++ ) {
			System.out.print("Código do produto >> ");
			aux = input.nextInt();

			if ( aux == 10 ) {
				somaResult += 1.5;
			} else if ( aux == 11 ) {
				somaResult += 1.8;
			} else if ( aux == 12 ) {
				somaResult += 1.9;
			} else if ( aux == 20 ) {
				somaResult += 10.0;
			} else if ( aux == 30 ) {
				somaResult += 8.0;
			} else if ( aux == 50 ) {
				somaResult += 2.5;
			}
		}
		if ( somaResult > 50 ) {
			somaResult -= ( somaResult * 5 ) / 100;
		}
		System.out.println("Valor a pagar >> R$ " + somaResult);
	}
}