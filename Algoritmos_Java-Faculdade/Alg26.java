import java.util.Scanner;
public class Alg26 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		double valc, valv, lucro;

		System.out.println("Informe o nome do produto. ");
		nome=ler.nextLine();

		System.out.println("Informe o valor de compra do produto. ");
		valc=ler.nextDouble();


		if (valc<100)
		{
			lucro=(valc*0.7);
		}

		else if (valc>=100 && valc<=200)
		{
			lucro=(valc*0.5);
		}

		else
		{
			lucro=(valc*0.3);
		}

		valv=(valc+lucro);

		System.out.println("Nome do produto: " + nome);
		System.out.println("Valor de compra: " + valc);
		System.out.println("Valor do lucro: " + lucro);
		System.out.printf("Valor de venda: %.2f \n" , valv);
	}
}