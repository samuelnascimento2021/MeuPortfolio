import java.util.Scanner;
public class Alg13 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um n�mero para saber se ele � positivo, negativo ou nulo. ");
		num=ler.nextInt();

		if (num==0)
		{
			System.out.println("O n�mero " + num + " � nulo. ");
		}
		else if (num>0)
		{
			System.out.println("O n�mero " + num + " � positivo. ");
		}
		else
		{
			System.out.println("O n�mero " + num + " � negativo. ");
		}

	}
}