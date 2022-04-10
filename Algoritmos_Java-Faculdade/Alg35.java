import java.util.Scanner;
public class Alg35 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont;
		cont=1;
		double num, soma;
		soma=0;


		System.out.println("Entre com dez números");

		while(cont<=10)
		{
			num=ler.nextDouble();

			if (num<40)
			{
				soma+=num;
			}

			cont++;
		}

			System.out.println("A soma dos números inferiores a 40 é: " + soma);

	}

}