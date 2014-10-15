using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Collections.Generic;

namespace NumberOfOnes
{
    class Program
    {
        static void Main(string[] args)
        {
            using (StreamReader reader = File.OpenText(args[0]))
                while (!reader.EndOfStream)
                {
                    string line = reader.ReadLine();
                    if (null == line)
                        continue;
                    
                    int number = Convert.ToInt32(line); //Convert to int

                    string binary = Convert.ToString(number, 2); //Convert to binary

                    int total = 0; //Counter of 1's

                    //Loop to verify how many 1's the string has
                    for(int i = 0; i < binary.Length; i++)
                    {
                        if(binary[i] == '1')
                        {
                            total++;
                        }
                    }

                    Console.Out.WriteLine(total);

                }
        }
    }
}
