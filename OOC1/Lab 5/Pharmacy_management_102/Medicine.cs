using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pharmacy_management_102
{
    internal class Medicine
    {
        public string name;
        public int quantity = 0;
        public int cost;
        public Medicine(string name, int quantity, int cost)
        {
            this.name = name;
            this.quantity += quantity;
            this.cost = cost;
        }

        public string getinfo()
        {
            string info = quantity +" pieces " + name + " available for " + cost + " taka each";
            return info;
        }
    }
}
