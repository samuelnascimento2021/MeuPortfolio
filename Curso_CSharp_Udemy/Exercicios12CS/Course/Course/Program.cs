﻿using Course.Entities.Exceptions;
using System.Globalization;
using Course.Entities;

namespace Course
{
    class Program
    {
        public static void Main(String[] args)
        {

            Console.WriteLine("Enter account data");
            Console.Write("Number: ");
            int number = int.Parse(Console.ReadLine());
            Console.Write("Holder: ");
            string holder = Console.ReadLine();
            Console.Write("Initial balance: ");
            double balance = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.Write("Withdraw Limit: ");
            double limit = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine();
            Console.Write("Enter amount for withdraw: ");
            double amount = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

            Account account = new Account(number, holder, balance, limit);

            try
            {
                account.Withdraw(amount);

                Console.Write("New balance: " + account.Balance.ToString("F2", CultureInfo.InvariantCulture));
            }
            catch (DomainException)
            {
                Console.WriteLine("Withdraw error: The amount exceeds withdraw limit");
            }
            catch (FormatException e)
            {
                Console.WriteLine("Error in format: " + e.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine("Unexpected error: " + e.Message);
            }
        }
    }
}