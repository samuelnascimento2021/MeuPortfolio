import java.util.Scanner;
public class Alg37 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont, pares, impares;
		cont=1; pares=0; impares=0;
		double num;

		System.out.println("Entre com dez números");

			while(cont<=10)
			{
				num=ler.nextDouble();

				if(num==0)
				{
					System.out.println("O número zero não é válido \n");
					break;
				}
				else if(num%2==0)
				{
					pares++;
				}
				else
				{
					impares++;
				}
					cont++;
			}

					System.out.println("O número de algorismos pares é: " + pares);
					System.out.println("O número de algorismos ímpares é: " + impares);

	}
}