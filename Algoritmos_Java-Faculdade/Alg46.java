import java.util.Scanner;
public class Alg46 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int	quantidade;
		double preco, total;
		String descricao;

		do
		{
			System.out.println("Digite a descrição do produto - Digite FIM para encerrar a execução.");
			descricao=ler.nextLine();

			if(!descricao.equals("FIM"))
			{
				System.out.println("Digite a quantidade do produto.");
				quantidade=ler.nextInt();
				System.out.println("Digite o preço unitário do produto.");
				preco=ler.nextDouble();

				total=(preco*quantidade);

				System.out.printf("O valor total da compra é: %.2f\n" , total);

			}
				ler = new Scanner(System.in);
		}
		while(!descricao.equals("FIM"));


	}
}