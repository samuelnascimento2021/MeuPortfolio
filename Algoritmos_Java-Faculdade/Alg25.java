import java.util.Scanner;
public class Alg25 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Informe a sua idade. ");
		idade=ler.nextInt();

		if (idade<18)
		{
			System.out.println("Menor de idade. ");
		}

		else if (idade>=18 && idade<=65)
		{
			System.out.println("Maior de idade. ");
		}

		else
		{
			System.out.println("Idoso. ");
		}
	}
}