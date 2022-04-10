import java.util.Scanner;
public class Alg43 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);

		int contAprov=0, contReprov=0, cont=0;
		double nota1, nota2, nota3, somaTotal=0;
		String nome;

		for(int i=1; i<=10; i++)
		{
			System.out.println("Entre com seu nome e suas três notas respectivamente");
			nome=ler.nextLine();
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
			double media=(somaTotal/cont);

			System.out.println("Quantidade de alunos aprovados: " + contAprov);
			System.out.println("Quantidade de alunos reprovados: " + contReprov);
			System.out.println("A média da classe é: " + media);
	}
}