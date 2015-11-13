using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ImprimirBytes
{
    class Program
    {
        static void Main(string[] args)
        {
            Impresion impresion = new Impresion();
            impresion.setTextoImpresion("Hola a todos");
            impresion.setTipoImpresion(3);
            impresion.imprimir();
        }
    }
}
