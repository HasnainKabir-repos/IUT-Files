using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IUT_LMS_02
{
    internal class Course
    {
        public string name;
        public int code;
        public string type;
        public string semester;
        public string teacher;

        public Course(string name, int code, string type, string semester, string teacher)
        {
            this.name = name;
            this.code = code;
            this.type = type;
            this.semester = semester;
            this.teacher = teacher;
        }
    }
}
