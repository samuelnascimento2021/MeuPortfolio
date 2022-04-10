import java.util.Scanner;
public class Alg41 {
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		int num, contPar=0 , contImp=0 , somaPar=0 , somaImp=0;
		double mediaPar=0, mediaImp=0;

		System.out.println("Entre com cinco valores");

		for(int i=1; i<=5; i++)
		{
			num=ler.nextInt();

			if(num!=0)
			{
				if(num%2==0)
				{
					contPar++;
					somaPar+=num;
				}
				else
				{
					contImp++;
					somaImp+=num;
				}
			}
			else
			{
				i--;
			}
		}

			if(contPar>0)
				{
					mediaPar=((double)somaPar/(double)contPar);
				}
			if(contImp>0)
				{
					mediaImp=((double)somaImp/(double)contImp);
				}

			System.out.println("A média dos números pares é: " + mediaPar);
			System.out.println("A média dos números ímpares é: " + mediaImp);
	}

}