namespace Course.Entities
{
    class Individual : TaxPayer
    {
        public double HealthExpenditures { get; set; }

        public Individual(string name, double annualIncome, double healthExpenditures) : base(name, annualIncome)
        {
            HealthExpenditures = healthExpenditures;
        }

        public override double Tax()
        {
            if (AnnualIncome < 20000 && HealthExpenditures != 0)
            {
                return (AnnualIncome * 0.15) - (HealthExpenditures / 2);
            }
            else if (AnnualIncome > 20000 && HealthExpenditures != 0)
            {
                return (AnnualIncome * 0.25) - (HealthExpenditures / 2);
            }
            else if (AnnualIncome < 20000 && HealthExpenditures == 0)
            {
                return AnnualIncome * 0.15;
            }
            else
            {
                return AnnualIncome * 0.25;
            }
        }
    }
}
