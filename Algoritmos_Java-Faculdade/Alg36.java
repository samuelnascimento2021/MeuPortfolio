import java.util.Scanner;
public class Alg36 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont, idade;
		cont=1;
		double contIdade21, contIdade50;
		contIdade21=0; contIdade50=0;


		System.out.println("Entre com a idade de 10 pessoas");

		while(cont<=10)
		{
			idade=ler.nextInt();

				if (idade<21)
				{
					contIdade21++;
				}
				else if (idade>50)
				{
					contIdade50++;
				}
				else
				{
					System.out.println("Idade inválida \n");
					break;
				}
				cont++;
		}
				System.out.println("O total de pessoas com menos de 21 anos é: " + contIdade21);
				System.out.println("O total de pessoas com mais de 50 anos é: " + contIdade50);
	}

}

