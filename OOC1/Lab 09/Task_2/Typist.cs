using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_2
{
    internal class Typist:Staff
    {
        public string type = "Typist";
        public int speed = 98;
        Casual casual;
        Regular regular;

        public Typist()
        {
            casual = new Casual();
            regular = new Regular();
        }

        public string getCasualInfo()
        {
            
            string info = casual.type + "-" + this.type;
            return info; 
        }

        public string getRegularInfo()
        {

            string info = regular.type + "-" + this.type;
            return info;
        }
    }
}
