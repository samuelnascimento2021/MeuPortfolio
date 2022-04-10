import java.util.Scanner;
public class Alg29 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;

		System.out.println("Digite um número de 1 a 12 para descobrir o mês correspondente ao mesmo e o número de dias do mês. ");
		num=ler.nextInt();

			switch (num) {
				case 1:
					System.out.println("Janeiro tem 31 dias.");
					break;

				case 2:
					System.out.println("Fevereiro tem 28/29 dias.");
					break;

				case 3:
					System.out.println("Março tem 31 dias.");
					break;

				case 4:
					System.out.println("Abril tem 30 dias.");
					break;

				case 5:
					System.out.println("Maio tem 31 dias.");
					break;

				case 6:
					System.out.println("Junho tem 30 dias.");
					break;

				case 7:
					System.out.println("Julho tem 31 dias.");
					break;

				case 8:
					System.out.println("Agosto tem 31 dias.");
					break;

				case 9:
					System.out.println("Setembro tem 30 dias.");
					break;

				case 10:
					System.out.println("Outubro tem 31 dias.");
					break;

				case 11:
					System.out.println("Novembro tem 30 dias.");
					break;

				case 12:
					System.out.println("Dezembro tem 31 dias.");
					break;

				default:
					System.out.println("Mês invalido.");

			}
	}
}