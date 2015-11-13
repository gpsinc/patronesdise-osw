using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImprimirBytes
{
    abstract class Printer
    {
        private string textPrinted;

        abstract public string getTextPrinted();

        abstract public void setTextPrinted();

        abstract public void print();
    }

    class BytePrinter : Printer
    {
        public override string getTextPrinted()
        {
            throw new NotImplementedException();
        }

        public override void print()
        {
            throw new NotImplementedException();
        }

        public override void setTextPrinted()
        {
            throw new NotImplementedException();
        }
    }
}
