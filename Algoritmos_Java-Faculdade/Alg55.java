import java.util.Scanner;
public class Alg55{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int i;
		String[] vetNome = new String[8];


		for(i=0; i<8; i++)
		{
			System.out.println("Entre com um nome");
			vetNome[i]=ler.nextLine();
		}

		for(i=7; i>=0; i--)
		{
			System.out.print(vetNome[i]+" ");
		}
	}
}