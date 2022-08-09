using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace User_management_system
{
    public partial class Form1 : Form
    {
        List<User> users = new List<User>();
        String info;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            using (var reader = new StreamReader(@"E:\New folder\userInfo.csv"))
            {
                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    var values = line.Split(',');

                    string first_name = values[0];
                    string last_name = values[1];
                
                    string address = values[2];
                    string city = values[3];
                    string county = values[4];
                    string state = values[5];
                    string zip = values[6];
                    string phone1 = values[7];
                    string phone = values[8];
                    string email = values[9];
                    User user = new User(first_name, last_name,
                        address, city, county, state, zip, phone1, phone, email);
                    users.Add(user);

                   
                }
            }

            for(int i = 0; i < users.Count; i++)
            {
                main_list_box.Items.Add(users[i].first_name + " " + users[i].last_name + " " + users[i].email);

                
            }
        }

        private void search_btn_OnClick(object sender, EventArgs e)
        {
            string email = Convert.ToString(search_box.Text);
            bool isMailFound = false;
            int i = 0;
            for(i = 0; i < users.Count; i++)
            {
                if (email == users[i].email)
                {
                    isMailFound = true;
                    first_name_label.Text = users[i].first_name;
                    last_name_label.Text = users[i].last_name;
                    address_label.Text = users[i].address;
                    city_label.Text = users[i].city;
                    county_label.Text = users[i].county;
                    state_label.Text = users[i].state;
                    zip_label.Text = users[i].zip;
                    phone1_label.Text = users[i].phone1;
                    phone_label.Text = users[i].phone;

                    break;
                }
            }

            info = DateTime.Now.ToString("dd/MM/yyyy HH:mm:ss");
            string path = @"E:\New folder\Files.txt";
            
            if (isMailFound)
            {
                info += " Found";
                File.AppendAllText(path, users[i].first_name + " " + users[i].last_name + " " +
                users[i].email + " " + users[i].address + " " + info + "\n");
            }
            else
            {
                info += " Not Found";
                File.AppendAllText(path, email + " " + info + "\n");
            }

            


            search_mail_label.Text = info;
        }

        private void main_list_box_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void search_box_TextChanged(object sender, EventArgs e)
        {

        }

        private void label10_Click(object sender, EventArgs e)
        {

        }
    }
}
