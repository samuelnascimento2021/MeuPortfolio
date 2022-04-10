import java.util.Scanner;
public class Alg30 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;
		double salario;

		System.out.println("Digite um número de 1 a 6 para descobrir a função e o aumento salarial correspondente sendo que:");
		System.out.println(" Gerente: 1\n Vendedor: 2\n Programador: 3\n Motorista: 4\n Vereador: 5\n Deputado: 6\n");
		num=ler.nextInt();

		System.out.println("Digite o valor do salário atual.");
		salario=ler.nextDouble();


			switch (num) {

				case 1:
					double salario1 = (salario*1.30);
					System.out.println("Gerente, aumento salarial de 30% ");
					System.out.printf("Novo salário: %.2f \n" , salario1);
					break;

				case 2:
					double salario2 = (salario*1.40);
					System.out.println("Vendedor, aumento salarial de 40% ");
					System.out.printf("Novo salário: %.2f \n" , salario2);
					break;

				case 3:
					double salario3= (salario*1.50);
					System.out.println("Programador, aumento salarial de 50% ");
					System.out.printf("Novo salário: %.2f \n" , salario3);
					break;

				case 4:
					double salario4= (salario*1.60);
					System.out.println("Motorista, aumento salarial de 60% ");
					System.out.printf("Novo salário: %.2f \n" , salario4);
					break;

				case 5:
					double salario5= (salario*1);
					System.out.println("Vereador, aumento salarial de 0% ");
					System.out.printf("Novo salário: %.2f \n" , salario5);
					break;

				case 6:
					double salario6= (salario*1);
					System.out.println("Deputado, aumento salarial de 0% ");
					System.out.printf("Novo salário: %.2f \n" , salario6);
					break;

				default:
					System.out.println("Número invalido.");
			}

	}
}