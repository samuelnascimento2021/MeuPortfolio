import java.util.Scanner;
public class Alg49{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num=1, cntNeg=0, cntPos=0, somaPos=0;

		while(num!=0)
		{
			System.out.println("Digite um n�mero. Digite <0> para encerrar");
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

				}
			}


		}

			System.out.println("Soma dos n�meros positivos: " + somaPos);
			System.out.println("Quantidade de n�meros negativos: " + cntNeg);

	}
}