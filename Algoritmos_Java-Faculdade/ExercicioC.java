import java.util.Scanner;
public class ExercicioC  {

	public static void main (String[] args) {

		Scanner ler= new Scanner (System.in);

		int x, y;

		System.out.println("Digite o par ordenado x,y: ");
		x=ler.nextInt();
		y=ler.nextInt();



		if (x==0 || y==0)
		{
			System.out.println("O ponto está sobre um dos eixos cartesianos");
		}

		else if (x>=0 && y>=0)
		{
			System.out.println("O ponto pertence ao primeiro quadrante");
		}

		else if (x<=0 && y>=0)
		{
			System.out.println("O ponto pertence ao segundo quadrante");
		}

		else if (x<=0 && y<=0)
		{
			System.out.println("O ponto pertence ao terceiro quadrante");
		}

		else
		{
			System.out.println("O ponto pertence ao quarto quadrante");
		}



	}

}