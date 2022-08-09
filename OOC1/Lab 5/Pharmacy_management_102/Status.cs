using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pharmacy_management_102
{
    internal class Status
    {
        public int amount;
        public Status(int amount)
        {
            this.amount = amount;
        }
        public void addMed(int cost)
        {
            amount -= cost;
        }

        public void sellMed(int price)
        {
            amount += price;
        }

        public int check_capacity(int cost)
        {
            if (amount >= cost)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        public string checkBalance()
        {
            string info = "Initial Amount: 1000, Remaining Balance: " + this.amount;
            return info;
        } 
    }
}
