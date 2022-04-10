import java.util.Scanner;
public class Alg22 {

	public static void main(String[] args){


		Scanner ler = new Scanner(System.in);


		int a, b, c, soma, mult;

		System.out.println("Digite dois números inteiros. ");
		a=ler.nextInt();
		b=ler.nextInt();

		soma=a+b;
		mult=a*b;

		if (a==b)
		{
			System.out.println("Os valores informados são iguais, portanto o resultado da soma dos números informados é: " + soma);
			c=soma;
			System.out.println("A variável A é: " + a + " A variável B é: " + b + " A variável C é: " + c);
		}

		else
		{
			System.out.println("Os valores informados são diferentes, portanto o resultado da multiplicação dos números informados é: " + mult);
			c=mult;
			System.out.println("A variável A é: " + a + " A variável B é: " + b + " A variável C é: " + c);

		}

	}

}