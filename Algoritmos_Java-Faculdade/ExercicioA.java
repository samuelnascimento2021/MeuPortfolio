import java.util.Scanner;
public class ExercicioA  {

	public static void main (String[] args) {

		Scanner leitura= new Scanner (System.in);

		double alt, base, area;

		System.out.println("Entre com a altura e a base do tri�ngulo para descobrir sua �rea: ");
		alt=leitura.nextDouble();
		base=leitura.nextDouble();

		area=(base*alt)/2;

		System.out.println("A �rea do tri�ngulo �: " + area);
	}
}