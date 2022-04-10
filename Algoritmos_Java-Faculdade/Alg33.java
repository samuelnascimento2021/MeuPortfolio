import java.util.Scanner;
public class Alg33 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int cont;
		cont=1;
		double num, soma, media, dobro;
		soma=0; media=0; dobro=0;


		System.out.println("Entre com cinco números");

		while(cont<=5)
		{
			num=ler.nextDouble();
			soma=soma+num;
			cont++;
		}
			media=(soma/5);
			dobro=(soma*2);

			System.out.println("O resultado da soma dos números é: " + soma);
			System.out.println("O resultado da média dos números é: " + media);
			System.out.println("O resultado do dobro dos números é: " + dobro);

	}
}