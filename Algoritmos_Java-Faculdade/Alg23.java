import java.util.Scanner;
public class Alg23 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite dois n�meros. ");
		num1=ler.nextInt();
		num2=ler.nextInt();

		if (num1<num2)
		{
			System.out.println("Os n�meros em ordem crescente s�o: " + num1 + " e " + num2);
		}

		else
		{
			System.out.println("Os n�meros em ordem crescente s�o: " + num2 + " e " + num1);
		}


	}

}