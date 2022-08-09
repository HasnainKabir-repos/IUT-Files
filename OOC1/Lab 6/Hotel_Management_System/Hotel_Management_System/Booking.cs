using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hotel_Management_System
{
    internal class Booking
    {
        public int id;
        public string room;
        public int price;
        public string status;
        public Booking(int id, string room, int entry_date, int depart_date, int quantity)
        {
            this.id = id;
            this.room = room;
            this.price = (depart_date - entry_date) * 1000 * quantity;
            status = "Pending";
        }

       
    }
}
