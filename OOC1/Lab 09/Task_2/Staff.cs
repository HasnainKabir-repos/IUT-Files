using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    internal class Staff
    {
        public int code;
        public string name;

      
     
        public string whoAmI(Teacher teacher)
        {
            string info = teacher.getInfo() + "-staff";
            return info; 
        }
    }
}
