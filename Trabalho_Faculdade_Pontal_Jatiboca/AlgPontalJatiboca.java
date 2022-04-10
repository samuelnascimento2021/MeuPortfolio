import java.util.Scanner;
public class AlgPontalJatiboca{
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);

		int opcao1, opcao2;
		double estoque1, estoque2, entradaEstoque1, entradaEstoque2;

			System.out.println("Entre com o estoque inicial de a��car empresa 1 - Jatiboca: ");
			estoque1=ler.nextDouble();
			System.out.println("Entre com o estoque inicial de a��car empresa 2 - Pontal: ");
			estoque2=ler.nextDouble();
			System.out.println("------------------------------------------------------------");

			if(estoque1>=0 && estoque2>=0)
			{
				do
				{
					System.out.println();
					System.out.println("O que deseja fazer: ");
					System.out.println("1- Entrada de estoque");
					System.out.println("2- Sa�da de estoque");
					System.out.println("3- Transfer�ncia de estoque");
					System.out.println("4- Consulta de Estoque");
					System.out.println("5- Finalizar");

					opcao1=ler.nextInt();
					System.out.println("------------------------------------------------------------");

						switch(opcao1)
						{
							case 1:
							{
								System.out.println();
								System.out.println("Qual empresa: ");
								System.out.println("1- Jatiboca");
								System.out.println("2- Pontal");

								opcao2=leitura.nextInt();
								System.out.println("------------------------------------------------------------");

									if(opcao2==1)
									{
											System.out.println();
											System.out.println("Qual a quantidade de Entrada em Jatiboca: ");
											entradaEstoque1=leitura.nextDouble();

											if(entradaEstoque1>=0)
											{
												estoque1+=entradaEstoque1;

												System.out.println();
												System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
												System.out.println();
												System.out.println("------------------------------------------------------------");
											}
											else
											{
												System.out.println("Inv�lido. O valor n�o pode ser negativo");
												System.out.println("------------------------------------------------------------");
											}
									}
									else if(opcao2==2)
									{
											System.out.println();
											System.out.println("Qual a quantidade de Entrada em Pontal: ");
											entradaEstoque2=leitura.nextDouble();

											if(entradaEstoque2>=0)
											{
												estoque2+=entradaEstoque2;

												System.out.println();
												System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
												System.out.println();
												System.out.println("------------------------------------------------------------");
											}
											else
											{
												System.out.println("Inv�lido. O valor n�o pode ser negativo");
												System.out.println("------------------------------------------------------------");
											}
									}
									else
									{
										System.out.println("Op��o Inv�lida");
										System.out.println("------------------------------------------------------------");
									}

									break;
							}

							case 2:
							{
								System.out.println();
								System.out.println("Qual empresa: ");
								System.out.println("1- Jatiboca");
								System.out.println("2- Pontal");

								opcao2=leitura.nextInt();
								System.out.println("------------------------------------------------------------");

									if(opcao2==1)
									{
										System.out.println();
										System.out.println("Qual a quantidade de Sa�da de a��car em Jatiboca: ");
										entradaEstoque1=leitura.nextDouble();

										if(entradaEstoque1<=estoque1 && entradaEstoque1>0)
										{
											estoque1-=entradaEstoque1;

											System.out.println();
											System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
											System.out.println();
											System.out.println("------------------------------------------------------------");
										}

										else
										{
											System.out.println("Inv�lido. O estoque n�o pode ser negativo");
											System.out.println("------------------------------------------------------------");
										}
									}
									else if(opcao2==2)
									{
										System.out.println();
										System.out.println("Qual a quantidade de Sa�da de a��car em Pontal: ");
										entradaEstoque2=leitura.nextDouble();

										if(entradaEstoque2<=estoque2 && entradaEstoque2>0)
										{
											estoque2-=entradaEstoque2;

											System.out.println();
											System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
											System.out.println();
											System.out.println("------------------------------------------------------------");
										}
										else
										{
											System.out.println("Inv�lido. O estoque n�o pode ser negativo");
											System.out.println("------------------------------------------------------------");
										}
									}
									else
									{
										System.out.println();
										System.out.println("Op��o inv�lida");
										System.out.println();
										System.out.println("------------------------------------------------------------");
									}

									break;
							}

							case 3:
							{
								System.out.println();
								System.out.println("Qual empresa: ");
								System.out.println("1- Jatiboca para Pontal");
								System.out.println("2- Pontal para Jatiboca");

								opcao2=leitura.nextInt();
								System.out.println("------------------------------------------------------------");

								if(opcao2==1)
								{
									System.out.println("Quantidade de transfer�ncia de a��car - Jatiboca para Pontal");
									entradaEstoque1=leitura.nextDouble();

									if(entradaEstoque1>estoque1 || entradaEstoque1<0)
									{
										System.out.println("------------------------------------------------------------");
										System.out.println("Imposs�vel transferir de Jatiboca para Pontal, estoque insuficiente!");
										System.out.println();
										System.out.println("Lembre-se que o valor inserido n�o pode ser negativo");
										System.out.println();
										System.out.println("------------------------------------------------------------");
										System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
										System.out.println();
										System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
										System.out.println();
										System.out.println("------------------------------------------------------------");
									}
									else
									{
										estoque1-=entradaEstoque1;
										estoque2+=entradaEstoque1;

										System.out.println("------------------------------------------------------------");
										System.out.println();
										System.out.println("Transfer�ncia realizada!!!");
										System.out.println();
										System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
										System.out.println();
										System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
										System.out.println();
										System.out.println("------------------------------------------------------------");
									}

								}
								else if(opcao2==2)
								{
									System.out.println("Quantidade de transfer�ncia de a��car - Pontal para Jatiboca");
									entradaEstoque2=leitura.nextDouble();

									if(entradaEstoque2>estoque2 || entradaEstoque2<0)
									{
										System.out.println("------------------------------------------------------------");
										System.out.println("Imposs�vel transferir de Pontal para Jatiboca, estoque insuficiente!");
										System.out.println();
										System.out.println("Lembre-se que o valor inserido n�o pode ser negativo");
										System.out.println();
										System.out.println("------------------------------------------------------------");
										System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
										System.out.println();
										System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
										System.out.println();
									}
									else
									{
										estoque2-=entradaEstoque2;
										estoque1+=entradaEstoque2;

										System.out.println("------------------------------------------------------------");
										System.out.println("Transfer�ncia realizada!!!");
										System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
										System.out.println();
										System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
										System.out.println();
										System.out.println("------------------------------------------------------------");
									}
								}
								else
								{
									System.out.println();
									System.out.println("Op��o inv�lida");
									System.out.println();
									System.out.println("------------------------------------------------------------");
								}

									break;

							}

							case 4:
							{
								System.out.println();
								System.out.printf("Estoque atualizado em Jatiboca: %.2f Kg" , estoque1);
								System.out.println();
								System.out.printf("Estoque atualizado em Pontal: %.2f Kg" , estoque2);
								System.out.println();
								System.out.println("------------------------------------------------------------");
								break;
							}

							case 5:
							{
								System.out.println();
								System.out.println("Bom dia e um bom trabalho !!!");
								System.out.println("------------------------------------------------------------");
								break;
							}

							default:
							{
								System.out.println();
								System.out.println("Op��o inv�lida");
								System.out.println("------------------------------------------------------------");
							}


					}


				}

			while(opcao1!=5);
		}

		else
		{
			System.out.println("Inv�lido. O estoque n�o pode ser negativo");
			System.out.println("------------------------------------------------------------");
		}
	}
}