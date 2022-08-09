using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hotel_Management_System
{
    static class Hotel_Management_System
    {
        static List<User> users = new List<User>();
        static List<Booking> bookings = new List<Booking>();
        public static void addUser(User user)
        {
            users.Add(user);
        }

        public static void addBookings(Booking booking)
        {
            bookings.Add(booking);
        }

        public static void changeBookingStatus(int i)
        {
             bookings[i-1].status = "Approved";
            
        }

        public static Booking checkBookingId(int bookingId)
        {
            return bookings[bookingId-1];
        }

        public static User checkUserId(int userId)
        {
            return users[userId-1];
        }
    }
}
