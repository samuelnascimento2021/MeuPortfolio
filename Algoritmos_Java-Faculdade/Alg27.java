import java.util.Scanner;
public class Alg27 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		int idade;

		System.out.println("Digite o seu nome: ");
		nome=ler.nextLine();

		System.out.println("Digite a sua idade: ");
		idade=ler.nextInt();

		if (idade<=12)
		{
			System.out.println("Paciente: " + nome);
			System.out.println("Especialidade do m�dico: Pediatra");
		}

		else if (idade>12 && idade<=59)
		{
			System.out.println("Paciente: " + nome);
			System.out.println("Especialidade do m�dico: Cl�nico geral");
		}

		else
		{
			System.out.println("Paciente: " + nome);
			System.out.println("Especialidade do m�dico: Geriatra");
		}

	}
}