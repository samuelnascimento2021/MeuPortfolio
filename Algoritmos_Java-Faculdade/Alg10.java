import java.util.Scanner;
public class Alg10  {

	public static void main (String[] args) {

		Scanner ler= new Scanner(System.in);

		float dist, vol;

		System.out.println("Digite a distância total percorrida e o volume de combustível consumido para percorrê-la: ");
		dist=ler.nextFloat();
		vol=ler.nextFloat();

		float cm=(dist/vol);

		System.out.printf("O consumo médio do veículo é: %.2f" , cm);
	}

}