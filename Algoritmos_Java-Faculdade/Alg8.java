import java.util.Scanner;
public class Alg8  {

	public static void main (String[] args)  {

		Scanner ler = new Scanner(System.in);

		float nota1, nota2, nota3, media;

		System.out.println("Entre com suas tr�s notas para calcular a sua m�dia: ");
		nota1=ler.nextFloat();
		nota2=ler.nextFloat();
		nota3=ler.nextFloat();

		media=(nota1+nota2+nota3)/3;

		System.out.printf("A sua nota m�dia �: %.2f", media);
	}
}