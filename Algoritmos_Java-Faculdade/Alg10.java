import java.util.Scanner;
public class Alg10  {

	public static void main (String[] args) {

		Scanner ler= new Scanner(System.in);

		float dist, vol;

		System.out.println("Digite a dist�ncia total percorrida e o volume de combust�vel consumido para percorr�-la: ");
		dist=ler.nextFloat();
		vol=ler.nextFloat();

		float cm=(dist/vol);

		System.out.printf("O consumo m�dio do ve�culo �: %.2f" , cm);
	}

}