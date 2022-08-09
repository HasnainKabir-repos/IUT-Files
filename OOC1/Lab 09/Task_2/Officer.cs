using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    internal class Officer:Staff
    {
        public string grade = "2nd";
        public string type = "Officer";

        public string getInfo()
        {
            string info = type;
            return info;
        }
    }
}
