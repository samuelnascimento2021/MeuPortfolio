ususing System;

namespace Exercicios1
{
    class Exercicio1
    {
        static void Main(string[] args)
        {

            int x = int.Parse(Console.ReadLine());

            for (int i = 1; i <= x; i++)
            {
                if (i % 2 != 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}