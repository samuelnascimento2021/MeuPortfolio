import java.util.Scanner;
public class Alg45 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num, cnt=0;
		double soma=0;

		do
		{
			System.out.println("Entre com um número - Digite zero para finalizar a execução");
			num=ler.nextInt();

			if(num!=0)
			{
				if(num>5)
				{
					soma+=num;
				}

				ler = new Scanner(System.in);
			}
		}
		while (num!=0);

			System.out.println("A soma dos números maiores que cinco é: " + soma);
	}
}