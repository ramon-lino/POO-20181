import java.util.Scanner;
class questao09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero1, numero2;
		int maior, menor, quant;
		int par, impar, soma;
		System.out.println("Digite dois numers inteiros");
		System.out.print("Primeiro numero >> ");
		numero1 = input.nextInt();
		System.out.print("Segundo numero >> ");
		numero2 = input.nextInt();

		if ( numero1 >= numero2 ) {
			maior = numero1;
			menor = numero2;
		} else {
			maior = numero2;
			menor = numero1;
		}
		
		soma = numero1 + numero2;
		quant = maior - menor +1;
		if ( quant % 2 == 0 ) {
			par = quant / 2;
			impar = quant / 2;	
		} else  {
			if ( menor % 2 == 0 ) {
				par = ((quant-1)/2) +1;
				impar = (quant-1)/2;
			} else {
				par = (quant-1)/2;
				impar = ((quant-1)/2) +1;
			}
		}
		System.out.println("Soma entre os numeros >> " + soma);
		System.out.println("Quantidade de Pares >> " + par);
		System.out.println("Quantidade de Impares >> " + impar);
	}
}