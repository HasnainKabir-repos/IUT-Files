using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Hotel_Management_System
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void user_save_btn_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(user_name_box.Text);
            int id = Convert.ToInt32(user_id1_box.Text);
            int contact = Convert.ToInt32(user_contact_box.Text);
            string address = Convert.ToString(user_address_box.Text);
            User user = new User(name, id, address, contact);
            Hotel_Management_System.addUser(user);
        }

        

        private void status_btn_OnCLick(object sender, EventArgs e)
        {
            int bookingId = Convert.ToInt32(owner_booking_box.Text);
            string status = Convert.ToString(owner_combo_box.Text);

            if(status == "Approved")
            {
                Hotel_Management_System.changeBookingStatus(bookingId);
            }
        }

        private void booking_place_OnClick(object sender, EventArgs e)
        {
            string room = Convert.ToString(room_combo_box.Text);
            int userid = Convert.ToInt32(user_id2_box.Text);
            int entry_date = Convert.ToInt32(room_entry_box.Text);
            int depart_date = Convert.ToInt32(room_depart_box.Text);
            int quantity = Convert.ToInt32(room_quantity_box.Text);

            Booking booking = new Booking(userid, room, entry_date, depart_date, quantity);
            Hotel_Management_System.addBookings(booking);
        }

        private void check_status_OnCLick(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(status_booking_box.Text);
            Booking booking = Hotel_Management_System.checkBookingId(id);

            status_booking_label.Text = booking.status;
            price_booking_label.Text = Convert.ToString(booking.price);
            room_booking_label.Text =booking.room;

            User user = Hotel_Management_System.checkUserId(id);

            username_booking_label.Text = user.name;
            address_booking_label.Text=user.address;
        }
    }
}
