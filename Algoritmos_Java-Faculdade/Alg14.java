import java.util.Scanner;
public class Alg14 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um número e veja se ele nulo, par, ou ímpar. ");
		num=ler.nextInt();

		if (num==0)
		{
			System.out.println("O número " + num + " é nulo. ");
		}

		else if (num%2==0)
		{
			System.out.println("O número " + num + " é par. ");
		}

		else
		{
			System.out.println("O número " + num + " é ímpar. ");
		}
	}
}