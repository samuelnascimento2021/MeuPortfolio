using System;
namespace Course.Entities
{
    class LogRecord
    {
        public int Student { get; set; }

        public override int GetHashCode()
        {
            return Student.GetHashCode();
        }

        public override bool Equals(object obj)
        {
            if (!(obj is LogRecord))
            {
                return false;
            }
            LogRecord other = obj as LogRecord;
            return Student.Equals(other.Student);
        }
    }
}
