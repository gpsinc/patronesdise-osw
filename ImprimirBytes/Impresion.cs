using System;
using System.IO;
using System.Text;

namespace ImprimirBytes
{
    class Impresion
    {
        private int tipoImpresion;
        private string textoImpresion;

        public void setTipoImpresion(int tipoImpresion)
        {
            this.tipoImpresion = tipoImpresion;
        }

        public int getTipoImpresion()
        {
            return this.tipoImpresion;
        }

        public void setTextoImpresion(string textoImpresion)
        {
            this.textoImpresion = textoImpresion;
        }

        public string getTextoImpresion()
        {
            return this.textoImpresion;
        }

        public void imprimir()
        {
            switch(tipoImpresion)
            {
                case 1:
                    ImpresionByte impresionByte = new ImpresionByte();
                    impresionByte.setTextoImpresion(textoImpresion);
                    impresionByte.setTipoImpresion(tipoImpresion);
                    impresionByte.imprimirBytes();
                    break;
                case 2:
                    ImpresionASCII impresionASCII = new ImpresionASCII();
                    impresionASCII.setTextoImpresion(textoImpresion);
                    impresionASCII.setTipoImpresion(tipoImpresion);
                    impresionASCII.imprimirASCII();
                    break;
                case 3:
                    ImpresionArchivo impresionArchivo = new ImpresionArchivo();
                    impresionArchivo.setTextoImpresion(textoImpresion);
                    impresionArchivo.setTipoImpresion(tipoImpresion);
                    impresionArchivo.imprimirArchivo();
                    break;
                default:
                    Console.Write("Error");
                    break;
            }
        }
    }

    class ImpresionByte : Impresion
    {
        public void imprimirBytes()
        {
            Console.WriteLine(convertirTexto(getTextoImpresion()));
        }

        public string convertirTexto(string ascii)
        {
            StringBuilder sb = new StringBuilder();

            byte[] inputBytes = Encoding.UTF8.GetBytes(ascii);

            foreach (byte b in inputBytes)

            {

                sb.Append(string.Format("{0:x2}", b));

            }

            return sb.ToString();
        }
    }

    class ImpresionASCII : Impresion
    {
        public void imprimirASCII()
        {
            Console.WriteLine(getTextoImpresion());
        }
    }

    class ImpresionArchivo : Impresion
    {
        StreamWriter nombreArchivo = new StreamWriter("d:\\prueba.txt");

        public void imprimirArchivo()
        {
            nombreArchivo.WriteLine(getTextoImpresion());
            nombreArchivo.Close();
        }
    }
}
