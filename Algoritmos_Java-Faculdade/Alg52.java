import java.util.Scanner;
public class Alg52{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int idade=0, contMasculino=0, contFeminino=0, genero=0;
		double peso=0, somaIdadeM=0, somaPesoF=0;


		while(idade!=-1)
		{
			System.out.println("Entre com a sua idade- digite -1 para finalizar");
			idade=ler.nextInt();

			if(idade!=-1)
			{
				System.out.println("Entre com seu peso");
				peso=ler.nextDouble();
				System.out.println("Entre com seu gênero-> 1- Masculino, 2- Feminino");
				genero=ler.nextInt();
				System.out.println();

				if(genero==1)
				{
					contMasculino++;
					somaIdadeM+=idade;
				}
				if(genero==2)
				{
					contFeminino++;
					somaPesoF+=peso;
				}


			}

		}
			double mediaIdadeM=(somaIdadeM/contMasculino);
			double mediaPesoF=(somaPesoF/contFeminino);

			System.out.println("Total de homens: " + contMasculino);
			System.out.println("Total de mulheres: " + contFeminino);
			System.out.println("Média das idades dos homens: " + mediaIdadeM);
			System.out.printf("Média dos pesos das mulheres: %.2f\n" , mediaPesoF);
			System.out.println();

	}
}