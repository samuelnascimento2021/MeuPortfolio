import java.util.Scanner;
public class Alg47 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num, cntPos=0, cntNeg=0, cnt=1;
		double somaPos=0, somaNeg=0;

		do
		{
			System.out.println("Entre com um n�mero");
			num=ler.nextInt();

			if(num!=0)
			{
				if(num>0)
				{
					cntPos++;
					somaPos+=num;
				}
				else
				{
					cntNeg++;
					somaNeg+=num;
				}

					cnt++;

				ler = new Scanner(System.in);
			}
			else
			{
				System.out.println("O n�mero zero n�o � v�lido\n");
			}
		}
		while (cnt<=15);

			System.out.println("A quantidade de n�meros positivos �: " + cntPos);
			System.out.println("A quantidade de n�meros negativos �: " + cntNeg);
			System.out.println("A soma dos n�meros positivos �: " + somaPos);
			System.out.println("A soma dos n�meros negativos �: " + somaNeg);
	}
}