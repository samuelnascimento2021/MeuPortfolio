import java.util.Scanner;
public class Alg15 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);

		String time1, time2;
		int gol1, gol2;

		System.out.println("Digite o nome do primeiro time. ");
		time1=ler.nextLine();

		System.out.println("Digite o número de gols do primeiro time. ");
		gol1=ler.nextInt();

		System.out.println("Digite o nome do segundo time. ");
		time2=leitura.nextLine();

		System.out.println("Digite o número de gols do segundo time. ");
		gol2=leitura.nextInt();

		if (gol1>gol2)
		{
			System.out.println("O time " + time1 + " marcou " + gol1 + " gols e é o vencedor! ");
		}

		else if (gol1<gol2)
		{
			System.out.println("O time " + time2 + " marcou " + gol2 + " gols e é o vencedor! ");
		}

		else
		{
			System.out.println("O resultado do jogo foi empate! ");
		}
	}
}