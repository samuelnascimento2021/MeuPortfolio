import java.util.Scanner;
public class ExercicioE  {

	public static void main (String[] args) {

		Scanner ler= new Scanner (System.in);

		double valC, valV;

		System.out.println("Entre com o valor de compra do produto");
		valC=ler.nextDouble();

		if (valC<20)
		{
			valV=(valC*1.45);
			System.out.printf("O valor de venda do produto será de: %.2f \n" , valV);
		}

		else
		{
			valV=(valC*1.30);
			System.out.printf("O valor de venda do produto será de: %.2f \n" , valV);
		}

	}

}