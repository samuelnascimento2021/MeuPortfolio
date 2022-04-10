import java.util.Scanner;
public class Alg16 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um número para saber se ele é ou não divisível por 5. ");
		num=ler.nextInt();

		if (num%5==0)
		{
			System.out.println("O número " + num + " é divisível por 5. ");
		}

		else
		{
			System.out.println("O número " + num + " não é divisível por 5. ");
		}
	}
}