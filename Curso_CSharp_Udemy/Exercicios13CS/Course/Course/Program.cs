using System;
using Course.Entities;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            HashSet<LogRecord> set = new HashSet<LogRecord>();

            Console.Write("How many students for course A?");
            int numA = int.Parse(Console.ReadLine());

            try
            {
                for (int i = 0; i < numA; i++)
                {
                    int student = int.Parse(Console.ReadLine());
                    set.Add(new LogRecord { Student = student });
                }

                Console.Write("How many students for course B?");
                int numB = int.Parse(Console.ReadLine());

                for (int i = 0; i < numB; i++)
                {
                    int student = int.Parse(Console.ReadLine());
                    set.Add(new LogRecord { Student = student });
                }

                Console.Write("How many students for course C?");
                int numC = int.Parse(Console.ReadLine());

                for (int i = 0; i < numC; i++)
                {
                    int student = int.Parse(Console.ReadLine());
                    set.Add(new LogRecord { Student = student });
                }

                Console.Write("Total students: " + set.Count);
            }
            catch (IOException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}