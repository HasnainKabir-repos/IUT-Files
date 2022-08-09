using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Car_Rental_dependency
{
    public class Car
    {
        private string name;
        private string model;
        private int number;

        public Car(string name, int number, string model)
        {
            this.name = name;
            this.number = number;
            this.model = model;
        }

        public string getName()
        {
            return name;
        }
        public string getModel()
        {
            return model;
        }
        public int getNumber()
        {
            return number;
        }
        public void unitDec()
        {
            this.number--;
        }
    }
}
