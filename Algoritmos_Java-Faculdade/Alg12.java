import java.util.Scanner;
public class Alg12 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

			System.out.println("Entre com um n�mero para saber se ele � positivo ou negativo ");
			num=ler.nextInt();

			if (num>0)
			{
 				System.out.println("O n�mero " + num + " � positivo");
			}
			else
			{
				System.out.println("O n�mero " + num + " � negativo");
			}
	}


}