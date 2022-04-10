import java.util.Scanner;
public class Alg39{
	public static void main(String[]args){

		Scanner ler = new Scanner(System.in);

		int num, contPar, contImp, somaPar, somaImp;
		contPar=0; contImp=0; somaPar=0; somaImp=0;

		System.out.println("Entre com dez números");

				for(int cnt=1; cnt<=10; cnt++)
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
						cnt--;
				}

			System.out.println("A quantidade de números pares é: " + contPar);
			System.out.println("A quantidade de números ímpares é: " + contImp);
			System.out.println("A soma dos valores pares é: " + somaPar);
			System.out.println("A soma dos valores ímpares é: " + somaImp);
	}
}