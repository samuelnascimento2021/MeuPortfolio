import java.util.Scanner;
public class Alg22 {

	public static void main(String[] args){


		Scanner ler = new Scanner(System.in);


		int a, b, c, soma, mult;

		System.out.println("Digite dois n�meros inteiros. ");
		a=ler.nextInt();
		b=ler.nextInt();

		soma=a+b;
		mult=a*b;

		if (a==b)
		{
			System.out.println("Os valores informados s�o iguais, portanto o resultado da soma dos n�meros informados �: " + soma);
			c=soma;
			System.out.println("A vari�vel A �: " + a + " A vari�vel B �: " + b + " A vari�vel C �: " + c);
		}

		else
		{
			System.out.println("Os valores informados s�o diferentes, portanto o resultado da multiplica��o dos n�meros informados �: " + mult);
			c=mult;
			System.out.println("A vari�vel A �: " + a + " A vari�vel B �: " + b + " A vari�vel C �: " + c);

		}

	}

}