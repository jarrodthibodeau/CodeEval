using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Endianness
{
    class Program
    {
        static void Main(string[] args)
        {
            bool le = BitConverter.IsLittleEndian; //Checks if System if little endian or not. 

            if(le)
            {
                Console.Out.Write("LittleEndian");
            }

            else
            {
                Console.Out.Write("BigEndian");
            }

        }
    }
}
