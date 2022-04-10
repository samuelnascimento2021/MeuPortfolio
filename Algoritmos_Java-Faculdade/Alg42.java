import java.util.Scanner;
public class Alg42 {
	public static void main(String[]args) {

		Scanner ler = new Scanner(System.in);

		int idade, contNota70=0, cont=0, contIdade=0;

		double notaf, somaNota=0;

			for(int i=1; i<=30; i++)
			{
				 System.out.println("Entre com sua nota final e idade respectivamente");
				 notaf=ler.nextDouble();
				 idade=ler.nextInt();

				 if(notaf>70)
				 {
				 	somaNota+=notaf;
				 	contNota70++;
				 	cont++;
				 }
				 else
				 {
				 	somaNota+=notaf;
				 	cont++;
				 }

				 if(idade>20)
				 {
				 	contIdade++;
				 }
				 else
				 {}

			}
					double media=(somaNota)/(cont);

					System.out.println("Quantidade de alunos com nota final acima de 70 pontos: " + contNota70);
					System.out.println("Quantidade de alunos com idade superior a 20 anos: " + contIdade);
					System.out.println("Média das notas finais da turma: " + media);

	}
}