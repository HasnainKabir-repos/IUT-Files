using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    internal class Teacher:Staff
    {
        public string subject;
        public string publication;
        
        public string getInfo()
        {
            string info = "Teacher";
            return info;
        }
    }
}
