import java.util.Scanner;
public class Alg50 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int	quantidade;
		double preco, total;
		String descricao="";

			while(!descricao.equals("FIM") && !descricao.equals("fim"))
			{
					System.out.println("Digite a descri��o do produto - Digite FIM para encerrar a execu��o.");
					descricao=ler.nextLine();

					if(!descricao.equals("FIM") && !descricao.equals("fim"))
					{
						System.out.println("Digite a quantidade do produto.");
						quantidade=ler.nextInt();
						System.out.println("Digite o pre�o unit�rio do produto.");
						preco=ler.nextDouble();

						total=(preco*quantidade);

						System.out.printf("O valor total da compra �: %.2f\n" , total);
						System.out.println();

					}

					ler = new Scanner(System.in);
			}
		}


	}
