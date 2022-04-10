import java.util.Scanner;
public class Alg20 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Informe o lado A do tri�ngulo: ");
		a=ler.nextInt();

		System.out.println("Informe o lado B do tri�ngulo: ");
		b=ler.nextInt();

		System.out.println("Informe o lado C do tri�ngulo: ");
		c=ler.nextInt();


		if (a>(b+c) || b>(c+a) || c>(a+b))
		{
			System.out.println("N�o atende �s condi��es para ser considerado tri�ngulo. ");
		}
		else if (a==b && b==c && a==c)
		{
			System.out.println("O tri�ngulo � equil�tero. ");
		}

		else if (a==b || b==c || a==c)
		{
			System.out.println("O tri�ngulo � is�sceles. ");
		}

		else
		{
			System.out.println("O tri�ngulo � escaleno. ");
		}


	}
}