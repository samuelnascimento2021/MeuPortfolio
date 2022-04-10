using System;

namespace Exercicios3
{
    class Exercicio3
    {
        static void Main(string[] args)
        {

            int N = int.Parse(Console.ReadLine());

            if (N % 2 == 0)
            {
                Console.WriteLine("PAR");
            }
            else
            {
                Console.WriteLine("IMPAR");
            }
        }
    }
}