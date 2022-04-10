import java.util.Scanner;
public class Alg7  {

	public static void main (String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, sub, mult;

		System.out.println("Entre com dois números: ");
		num1=ler.nextInt();
		num2=ler.nextInt();

		sub= num1-num2;
		mult= num1*num2;

		System.out.println("O resultado da subtração destes números é: " + sub);
		System.out.println("O resultado da multiplicação destes números é: " + mult);

	}
}