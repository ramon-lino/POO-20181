import java.util.Scanner;
class questao04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float nota1,  nota2, nota3, nota4;
		float media;
		System.out.println("## Informe as 4 notas do aluno ##");
		System.out.print("Nota 1 >> ");
		nota1 = input.nextFloat();
		System.out.print("Nota 2 >> ");
		nota2 = input.nextFloat();
		System.out.print("Nota 3 >> ");
		nota3 = input.nextFloat();
		System.out.print("Nota 4 >> ");
		nota4 = input.nextFloat();
		
		media = ( nota1 + nota2 + nota3 + nota4 ) / 4;
		if ( media >= 7.0 ) {
			System.out.println("Aluno Aprovado !!");
		} else if ( media >= 5.0 && media < 7.0 ) {
			System.out.println("Aluno na Final !!");
		} else {
			System.out.println("Aluno Reprovado !!");
		}
		
	}
}