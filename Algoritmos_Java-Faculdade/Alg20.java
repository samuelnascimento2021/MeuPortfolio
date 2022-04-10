import java.util.Scanner;
public class Alg20 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int a, b, c;

		System.out.println("Informe o lado A do triângulo: ");
		a=ler.nextInt();

		System.out.println("Informe o lado B do triângulo: ");
		b=ler.nextInt();

		System.out.println("Informe o lado C do triângulo: ");
		c=ler.nextInt();


		if (a>(b+c) || b>(c+a) || c>(a+b))
		{
			System.out.println("Não atende às condições para ser considerado triângulo. ");
		}
		else if (a==b && b==c && a==c)
		{
			System.out.println("O triângulo é equilátero. ");
		}

		else if (a==b || b==c || a==c)
		{
			System.out.println("O triângulo é isósceles. ");
		}

		else
		{
			System.out.println("O triângulo é escaleno. ");
		}


	}
}