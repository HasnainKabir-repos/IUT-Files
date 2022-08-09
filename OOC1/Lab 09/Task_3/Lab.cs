using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_3
{
    internal class Lab
    {
        private string labName;
        private int capacity;

        public string getLabName()
        {
            return labName;
        }
        public int getCapacity()
        {
            return capacity;
        }

        public void setLabName(string labName)
        {
            this.labName = labName;
        }
        public void setCapacity(int capacity)
        {
            this.capacity = capacity;
        }

        
    }
}
