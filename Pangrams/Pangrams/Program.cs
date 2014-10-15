using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Collections;

namespace Pangrams
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

                    //Char set representing alphabet
                    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p' , 'q', 'r', 's' ,'t', 'u', 'v', 'w', 'x'
                                      , 'y', 'z'};


                    //ArrayList missing = new ArrayList();

                    for(int i = 0; i < line.Length; i++)
                    {

                        bool isMatch = false; //boolean checker for a match
                       
                        for(int j = 0; j < alphabet.Length; j++)
                        {
                            //If a match is found
                            if(line[i] == alphabet[j])
                            {
                                isMatch = true;
                                break;
                            }
                        }

                        //If letter isn't in sequence then add it to missing array list
                        if(!isMatch && Char.IsLetter(line[i]))
                        {
                            Console.Out.Write(Char.ToLower(line[i]));
                        }
                    }

                    Console.Out.WriteLine(""); //used for spacing 

                }
        }
    }
}
