﻿using System.Globalization;
namespace Course.Entities
{
    class UsedProduct : Product
    {
        DateTime ManufactureDate { get; set; }

        public UsedProduct()
        {

        }

        public UsedProduct (string name, double price, DateTime manufactureDate) : base(name, price)
        {
            ManufactureDate = manufactureDate;
        }

        public override string PriceTag()
        {
            return Name + " (used)" + " $ " + Price.ToString("F2", CultureInfo.InvariantCulture) + " (Manufacture date: " + ManufactureDate.ToString("dd/MM/yyyy") + ")";
        }


    }

}
