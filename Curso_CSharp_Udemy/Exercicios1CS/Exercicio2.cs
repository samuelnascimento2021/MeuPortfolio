using System;
using System.Globalization;

namespace Exercicios2
{
    class Exercicio2
    {
        static void Main(string[] args)
        {

            double R, A, pi = 3.14159;

            R = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

            A = pi * R * R;

            Console.WriteLine("A=" + A.ToString("F4", CultureInfo.InvariantCulture));
        }
    }
}