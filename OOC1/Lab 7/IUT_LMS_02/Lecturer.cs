using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IUT_LMS_02
{
    internal class Lecturer : Teacher
    {
       
        public Lecturer(string name)
        {
            this.name = name;
            type = "Lecturer";
        }
        
        public override void setCredit()
        {
            credit += 1.5;
        }

        public override double getCredit()
        {
            return credit;
        }
    }
}
