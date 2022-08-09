using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IUT_LMS_02
{
    internal class Teacher
    {
        public string name;
        public double credit;
        public string type;
        public Course course;
        public virtual double getCredit()
        {
            return 0;
        }

        public void setCourse(Course course)
        {
            this.course = course;
        }
        public virtual void setCredit()
        {
            credit += 3;
        }

        public string getInfo()
        {
            string info = name + " " + type + " " + course.code.ToString() +" "+ course.name+ " " + course.semester ;
            return info;
        }
    }
}
