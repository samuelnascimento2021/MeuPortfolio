import java.util.Scanner;
public class Alg38 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont,contPos,contNeg;
		cont=1; contPos=0; contNeg=0;
		double num, somaPos, somaNeg;
		somaPos=0; somaNeg=0;

		System.out.println("Entre com dez números");

			while(cont<=4)
			{
				num=ler.nextDouble();

				if(num!=0)
				{

					if(num<0)
					{
						contNeg++;
						somaNeg+=num;
					}
					else
					{
						contPos++;
						somaPos+=num;
					}
					cont++;
				}
			}

					System.out.println("O número de algorismos positivos é: " + contPos);
					System.out.println("O número de algorismos negativos é: " + contNeg);
					System.out.println("A soma dos algorismos positivos é: " + somaPos);
					System.out.println("A soma dos algorismos negativos é: " + somaNeg);

	}
}