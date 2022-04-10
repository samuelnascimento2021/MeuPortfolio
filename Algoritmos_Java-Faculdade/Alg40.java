import java.util.Scanner;
public class Alg40 {
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		int num, contPos=0 , contNeg=0 , somaPos=0 , somaNeg=0;
		double mediaPos=0, mediaNeg=0;

		System.out.println("Entre com cinco valores");

		for(int i=1; i<=5; i++)
		{
			num=ler.nextInt();

			if(num!=0)
			{
				if(num>0)
				{
					contPos++;
					somaPos+=num;
				}
				else
				{
					contNeg++;
					somaNeg+=num;
				}
			}
			else
			{
				i--;
			}
		}

			if(contPos>0)
				{
					mediaPos=((double)somaPos/(double)contPos);
				}
			if(contNeg>0)
				{
					mediaNeg=((double)somaNeg/(double)contNeg);
				}

			System.out.println("A média dos números positivos é: " + mediaPos);
			System.out.println("A média dos números negativos é: " + mediaNeg);
	}

}