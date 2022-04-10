import java.util.Scanner;
public class Alg56{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int i, aux=7;
		String[] vetNome = new String[8];
		String[] vetNomeInv = new String[8];


		for(i=0; i<8; i++)
		{
			System.out.println("Entre com um nome");
			vetNome[i]=ler.nextLine();
		}

		for(i=0; i<vetNomeInv.length; i++)
		{
			vetNomeInv[i]=vetNome[aux];
			aux--;
		}

		for(i=0; i<vetNomeInv.length; i++)
		{
			System.out.print(vetNomeInv[i]+" ");
		}
	}
}