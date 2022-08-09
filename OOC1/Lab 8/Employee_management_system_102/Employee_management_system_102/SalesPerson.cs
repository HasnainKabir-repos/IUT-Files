using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_management_system_102
{
    internal class SalesPerson:Employee
    {
        public SalesPerson(string name, string contact, string joining_date, string leave, int salary)
        {
            id = initnumber++;
            this.name = name;
            category = "SalesPerson";
            this.contact = contact;
            this.joining_date = joining_date;
            this.leave = leave;
            this.salary = salary;
        }
    }
}
