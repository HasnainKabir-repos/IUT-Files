using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Car_Rental_dependency
{
    public class User
    {
        private string name;
        private int id;
        private string address;
        private string destination;
        private int rentedNum = 0;
        public User(string name, int id, string address, string destination)
        {
            setName(name);
            setId(id);
            setAddress(address);
            setDest(destination);
        }

        public void setId(int id)
        {
            this.id = id;
        }
        public void setName(string name)
        {
            this.name = name;
        }
        public void setAddress(string address)
        {
            this.address = address;
        }
        public void setDest(string destination)
        {
            this.destination = destination;
        }

        public int getId()
        {
            return id;
        }
        public string getName()
        {
            return name;
        }
        public string getAddress()
        {
            return address;
        }
        public string getDest()
        {
            return destination;
        }
        public int getRentNum()
        {
            return rentedNum;
        }
        public void rentCar()
        {
            this.rentedNum++;
        }

    }
}
