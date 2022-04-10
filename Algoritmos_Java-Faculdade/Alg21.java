import java.util.Scanner;
public class Alg21 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		int num1, num2, soma;

		System.out.println("Entre com dois valores para serem somados. ");
		num1=leitura.nextInt();
		num2=leitura.nextInt();

		soma = num1+num2;

		if (soma>10)
		{
			System.out.println("O resultado da soma é: " + soma);
		}

	}
}