import java.util.Scanner;
class questao08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero; 
		float media = 0.0f;
		int maior = 0;
		int menor = 999999;
		System.out.println("## Digite Dez numeros inteiro ##");
		for (int i = 0; i < 10; i++) {
			System.out.print("Numero 0"+ (i+1) + " >> ");
			numero = input.nextInt();
			media += numero;
			if ( numero >= maior ) {
				maior = numero;
			} else if ( numero <= menor ) {
				menor = numero;
			}
		}
		media = media/10;
		System.out.println("Media >> " + media);
		System.out.println("Maior numero >> " + maior);
		System.out.println("Menor numero >> " + menor);
	}
}