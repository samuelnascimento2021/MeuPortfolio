import java.util.Scanner;
public class Alg44 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num, cnt=0;
		double soma=0, media=0;

		do
		{
			System.out.println("Entre com um n�mero - Digite zero para finalizar a execu��o");
			num=ler.nextInt();

			if(num!=0)
			{
				soma+=num;
				cnt++;

				ler = new Scanner(System.in);
			}
		}
		while (num!=0);

			if (cnt>0)
				media=((double)soma/(double)cnt);

			System.out.println("A m�dia dos n�meros �: " + media);
	}
}