import java.util.Scanner;
public class Alg16 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um n�mero para saber se ele � ou n�o divis�vel por 5. ");
		num=ler.nextInt();

		if (num%5==0)
		{
			System.out.println("O n�mero " + num + " � divis�vel por 5. ");
		}

		else
		{
			System.out.println("O n�mero " + num + " n�o � divis�vel por 5. ");
		}
	}
}