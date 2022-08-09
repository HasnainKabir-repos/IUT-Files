using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_management_system_102
{
    public class exceptionbyId : ApplicationException
    {
        public exceptionbyId(string message) : base(message)
        {

        }
    }

    internal class Employee
    {
        public static int initnumber = 0;
        public string name;
        public int id;
        public string category;
        public string contact;
        public int salary;
        public string joining_date;
        public string leave;

        
    }

    

}
