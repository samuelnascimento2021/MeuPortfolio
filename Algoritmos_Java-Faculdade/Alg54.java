import java.util.Scanner;
public class Alg54{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int i;
		int[] vetnum1 = new int[10];
		int[] vetnum2 = new int[10];
		int[] vetnum3 = new int[10];

		for(i=0; i<10; i++)
		{
			System.out.println("Digite um número para preencher o vetor 1");
			vetnum1[i]=ler.nextInt();
		}
		for(i=0; i<10; i++)
		{
			System.out.println("Digite um número para preencher o vetor 2");
			vetnum2[i]=ler.nextInt();
		}
		for(i=0; i<10; i++)
		{
			vetnum3[i]=(vetnum1[i]+vetnum2[i]);
		}
		for(i=0; i<10; i++)
		{
			System.out.print(vetnum3[i]+" ");
		}
	}
}
