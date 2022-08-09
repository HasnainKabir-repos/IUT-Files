using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace User_management_system
{
    internal class User
    {
        public string first_name;
        public string last_name;
        
        public string address;
        public string city;
        public string county;
        public string state;
        public string zip;
        public string phone1;
        public string phone;
        public string email;

        public User(string first_name, string last_name, string address, string city,
            string county, string state, string zip, string phone1, string phone, string email)
        {
            this.first_name = first_name;
            this.last_name = last_name;
            
            this.address = address;
            this.city = city;
            this.county = county;
            this.state = state;
            this.zip = zip;
            this.phone1 = phone1;
            this.phone = phone;
            this.email = email;
        }
    }
}
