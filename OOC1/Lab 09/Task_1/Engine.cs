using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_1
{
    public class Engine
    {

        public double max_fuel_rate = 25.6;
        public double max_energy_rate = 67.5;
        public int avg_rpm = 8000;
        public void display_engine()
        {
            Console.WriteLine("maximum fuel consumption rate = "+ max_fuel_rate +
                "\nMaximum Energy Rate = "+ max_energy_rate+
                "\nAverage RPM = "+ avg_rpm);
        }
    }
}
