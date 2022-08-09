using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Car_Rental_dependency;

namespace Car_Rental_System_102
{
    public partial class Form1 : Form
    {
        List<User> users = new List<User>();
        List<Car> cars = new List<Car>();
        public Form1()
        {
            InitializeComponent();
        }

        private void rentCarOnClick(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(user_id_name_box.Text);
            string car_name = Convert.ToString(car_name_rent_box.Text);

            for(int i = 0; i < users.Count; i++)
            {
                if(id == users[i].getId())
                {
                    users[i].rentCar();

                    for(int j = 0; j < cars.Count; j++)
                    {
                        if (car_name == cars[j].getName())
                        {
                            cars[j].unitDec();
                        }
                    }
                }
            }
        }

        private void save_userOnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(userName_box.Text);
            string address = Convert.ToString(user_address_box.Text);
            string destination = Convert.ToString(user_dest_box.Text);
            int id = Convert.ToInt32(id_box.Text);
            User user = new User(name, id, address, destination);
            users.Add(user);
            userName_box.Clear();
            user_address_box.Clear();
            user_dest_box.Clear();
            id_box.Clear();
        }

        private void save_car_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(car_name_box.Text);
            string model = Convert.ToString(car_model_box.Text);
            int num = Convert.ToInt32(car_num_box.Text);

            Car car = new Car(name, num, model);
            cars.Add(car);
            

            car_name_box.Clear();
            car_model_box.Clear();
            car_num_box.Clear();
        }

        private void show_userOnClick(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(his_id_box.Text);
            for(int i = 0; i < users.Count; i++)
            {
                if (id == users[i].getId())
                {

                    his_name_box.Text = users[i].getName();
                    his_add_box.Text = users[i].getAddress();
                    his_dest_box.Text = users[i].getDest();
                    his_rent_box.Text = Convert.ToString(users[i].getRentNum());
                }
            }
        }

        private void show_CarOnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(his_carName.Text);
            for(int i = 0; i < cars.Count; i++)
            {
                if(name == cars[i].getName())
                {
                    his_carModel.Text = cars[i].getModel();
                    his_carUnit.Text = Convert.ToString(cars[i].getNumber());
                }
            }
        }
    }
}
