import java.util.Scanner;
public class ExercicioD  {

	public static void main (String[] args) {

		Scanner ler= new Scanner (System.in);

		double m1, m2, media;

		System.out.println("Digite as duas notas");
		m1=ler.nextDouble();
		m2=ler.nextDouble();

		media=((m1+m2)/2);

		if (media>=6)
		{
			System.out.println("Aprovado");
		}

		else
		{
			System.out.println("Reprovado");
		}

	}

}