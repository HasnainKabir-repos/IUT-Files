using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_1
{
    public  class Door
    {
        public string opening_mode = "sideways";
        public void  display_door()
        {
            Console.WriteLine("Opening Mode = "+ opening_mode);
        }
    }
}
