import java.util.Scanner;
public class Alg13 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um número para saber se ele é positivo, negativo ou nulo. ");
		num=ler.nextInt();

		if (num==0)
		{
			System.out.println("O número " + num + " é nulo. ");
		}
		else if (num>0)
		{
			System.out.println("O número " + num + " é positivo. ");
		}
		else
		{
			System.out.println("O número " + num + " é negativo. ");
		}

	}
}