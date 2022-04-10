import java.util.Scanner;
public class ExercicioB  {

	public static void main (String[] args) {

		Scanner leitura= new Scanner (System.in);

		int mercadoriasA, mercadoriasB, mercadoriasC;
		double valA, valB, valC;

		System.out.println("Digite o número total de mercadorias dos três produtos. ");
		mercadoriasA=leitura.nextInt();
		mercadoriasB=leitura.nextInt();
		mercadoriasC=leitura.nextInt();

		System.out.println("Digite o valor de cada uma das três mercadorias. ");
		valA=leitura.nextDouble();
		valB=leitura.nextDouble();
		valC=leitura.nextDouble();

		double media=((valA+valB+valC)/3);
		double valtotal=((mercadoriasA*valA)+(mercadoriasB*valB)+(mercadoriasC*valC));

		System.out.printf("O valor total do estoque em reais é de %.2f \n" , valtotal);
		System.out.printf("O valor médio das mercadorias em reais é de %.2f \n" , media);

	}

}
