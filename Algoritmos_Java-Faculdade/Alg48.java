import java.util.Scanner;
public class Alg48{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num=0, cntPar=0, cntImpar=0, somaImpar=0;

		while(num!=-1)
		{
			System.out.println("Digite um número. Digite <-1> para encerrar");
			num=ler.nextInt();

			if(num!=-1)
			{
				if(num%2==0)
				{
					cntPar++;
				}
				else
				{
					cntImpar++;
					somaImpar+=num;
				}
			}


		}

			System.out.println("Quantidade de números pares: " + cntPar);
			System.out.println("Soma dos números ímpares: " + somaImpar);
	}
}