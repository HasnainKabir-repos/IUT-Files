using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IUT_LMS_02
{
    internal class Student
    {
        public string name;
        public string semester;
        public string course;

        public Student(string name, string semester, string course)
        {
            this.name = name;
            this.semester = semester;
            this.course = course;
        }

        public string getInfo()
        {
            string info = name + " " + semester + " " + course;
            return info;
        }
    }
}
