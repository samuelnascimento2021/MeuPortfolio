import java.util.Scanner;
public class Alg17 {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Digite a idade do nadador. ");
		idade=ler.nextInt();

		if (idade>= 5 && idade<=12)
		{
			System.out.println("O nadador se encontra na categoria Infantil. ");
		}

		else if (idade>=13 && idade<=17)
		{
			System.out.println("O nadador se encontra na categoria Juvenil. ");
		}

		else if (idade>=18 && idade<=25)
		{
			System.out.println("O nadador se encontra na categoria Profissional. ");
		}

		else
		{
			System.out.println("O nadador se encontra fora da faixa etária das categorias Infantil, Juvenil e Profissional. ");
		}
	}
}