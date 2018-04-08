import java.util.Scanner;
class questao03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float nota1, nota2, nota3;
		float media;
		System.out.print("Digite a nota 1 >> ");
		nota1 = input.nextFloat();
		System.out.print("Digite a nota 2 >> ");
		nota2 = input.nextFloat();
		System.out.print("Digite a nota 3 >> ");
		nota3 = input.nextFloat();
		media = ( (nota1 * 2) +(nota2 * 3) + (nota3 * 5) ) / ( 2+3+5 );
		System.out.println("A Media do aluno é >> " + media);
	}
}