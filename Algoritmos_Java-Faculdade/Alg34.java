import java.util.Scanner;
public class Alg34 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont;
		cont=1;
		double num, somaPos, somaNeg;
		somaPos=0; somaNeg=0;

		System.out.println("Digite 10 (dez) números");

		while(cont<=10)
		{
			num=ler.nextDouble();

			if (num>0)
			{
				somaPos+=num;
			}
			else
			{
				somaNeg+=num;
			}

			cont++;
		}

			System.out.println("A soma dos números positivos é: " + somaPos);
			System.out.println("A soma dos números negativos é: " + somaNeg);

	}

}