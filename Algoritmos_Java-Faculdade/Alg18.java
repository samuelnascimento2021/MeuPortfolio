import java.util.Scanner;
public class Alg18 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		double salario, reajuste15, reajuste10, reajuste5;

		System.out.println("Informe o valor do sal�rio .");
		salario=ler.nextDouble();

		reajuste15= (salario*0.15);
		reajuste10= (salario*0.10);
		reajuste5=  (salario*0.5);

		if (salario<500)
		{
			System.out.printf("O valor do reajuste de quinze porcento �: %.2f \n" , reajuste15);
			System.out.printf("O valor do novo sal�rio �: %.2f \n" , salario+reajuste15);
		}

		else if (salario>=500 && salario<=1000)
		{
			System.out.printf("O valor do reajuste de dez porcento �: %.2f \n" , reajuste10);
			System.out.printf("O valor do novo sal�rio �: %.2f \n" , salario+reajuste10);
		}

		else
		{
			System.out.printf("O valor do reajuste de cinco porcento �: %.2f \n" , reajuste5);
			System.out.printf("O valor do novo sal�rio �: %.2f \n" , salario+reajuste5);
		}
	}
}