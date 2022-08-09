using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_1
{
    public class Car_Seat
    {
        public string pleasant = "YES";
        public string comfy = "YES";
        public string seat_warmer = "Present";

        public void display_seat()
        {
            Console.WriteLine("Pleasant = " + pleasant +
                "\ncomfy = " + comfy +
                "\nseat_warmer = " + seat_warmer);
                
        }
    }
}
