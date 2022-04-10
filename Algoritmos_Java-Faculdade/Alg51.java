import java.util.Scanner;
public class Alg51 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);

		int contAprov=0, contReprov=0, cont=0;
		double nota1, nota2, nota3, somaTotal=0;
		String nome="";

		while(!nome.equals("FIM") && !nome.equals("fim"))
			{
				System.out.println("Entre com seu nome- Digite FIM para encerrar");
				nome=ler.nextLine();
				if(!nome.equals("FIM") && !nome.equals("fim"))
				{
					System.out.println("Entre com suas três notas");
					nota1=leitura.nextDouble();
					nota2=leitura.nextDouble();
					nota3=leitura.nextDouble();

					double soma=(nota1+nota2+nota3);

					if(soma>=60)
					{
						contAprov++;
						somaTotal+=soma;
						cont++;
					}
					else
					{
						contReprov++;
						somaTotal+=soma;
						cont++;
					}
				}

			}
			double media=(somaTotal/cont);

			System.out.println("Quantidade de alunos aprovados: " + contAprov);
			System.out.println("Quantidade de alunos reprovados: " + contReprov);
			System.out.printf("A média da classe é: %.2f\n" , media);
	}
}