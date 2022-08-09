using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hotel_Management_System
{
    internal class User
    {
        public string name;
        public int id;
        public string address;
        public int contact;

        public User(string name, int id, string address, int contact)
        {
            this.name = name;
            this.id = id;
            this.address = address;
            this.contact = contact;
        }
    }
}
