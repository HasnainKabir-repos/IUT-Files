using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IUT_LMS_02
{
    internal class Professor:Teacher
    {
        public Professor(string name)
        {
            this.name = name;
            type = "Professor";
        }

        public override void setCredit()
        {
            credit += 3;
        }

        public override double getCredit()
        {
            return credit;
        }
    }
}
