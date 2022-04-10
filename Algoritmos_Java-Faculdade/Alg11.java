import java.util.Scanner;
public class Alg11  {

	public static void main (String[] args)  {

		Scanner ler = new Scanner(System.in);

		double preco, dist, imp, precof;

		System.out.println("Digite o valor do custo de fábrica para obter o valor final do carro: ");
		preco=ler.nextDouble();

		dist= 0.12*preco;
		imp = 0.45*preco;
		precof= preco+dist+imp;

		System.out.println("O valor final do carro é: " + precof);

	}
}