import java.util.Scanner;
public class Alg14 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um n�mero e veja se ele nulo, par, ou �mpar. ");
		num=ler.nextInt();

		if (num==0)
		{
			System.out.println("O n�mero " + num + " � nulo. ");
		}

		else if (num%2==0)
		{
			System.out.println("O n�mero " + num + " � par. ");
		}

		else
		{
			System.out.println("O n�mero " + num + " � �mpar. ");
		}
	}
}