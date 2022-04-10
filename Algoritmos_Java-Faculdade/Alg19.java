import java.util.Scanner;
public class Alg19 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		int idade;

		System.out.println("Informe a idade para saber sua classe eleitoral. ");
		idade=leitura.nextInt();

			if (idade<16)
			{
				System.out.println("Não eleitor. ");
			}
			else if (idade>=16 && idade<18 || idade>65)
			{
				System.out.println("Eleitor facultativo. ");
			}
			else
			{
				System.out.println("Eleitor obrigatório. ");
			}
	}
}