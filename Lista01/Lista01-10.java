import java.util.Scanner;
class questao10 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		float num;
		int cont = 0;
		System.out.print("Digite um numero a ser dividido >> ");
		num = input.nextFloat();
		while(num > 1) {
			cont++;
			num = num/2;
		}
		System.out.println("Qtd. de Divisões efetuadas >> " + cont);
		System.out.println("Resultado da ult. divisão >> " + num);
	}
}