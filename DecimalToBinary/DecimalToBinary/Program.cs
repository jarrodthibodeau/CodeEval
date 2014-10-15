using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace DecimalToBinary
{
    class Program
    {
        static void Main(string[] args)
        {
            //This reads every line of the file
            using (StreamReader reader = File.OpenText(args[0]))
                while (!reader.EndOfStream)
                {
                    string line = reader.ReadLine();
                    if (null == line)
                        continue;

                    int deci = Convert.ToInt32(line); // convert to decimal

                    Console.Out.WriteLine(Convert.ToString(deci, 2)); //print out binary representation 
                   
                }
        }
    }
}
