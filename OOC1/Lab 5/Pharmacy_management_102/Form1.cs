using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pharmacy_management_102
{
    public partial class Form1 : Form
    {
        Status status = new Status(1000);
        List<Medicine> medicine = new List<Medicine>();
        public Form1()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void add_med_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(add_name_box.Text);
            int amount = Convert.ToInt32(add_qty_box.Text);
            int cost = Convert.ToInt32(add_cost_box.Text);

            Medicine med = new Medicine(name, amount, cost);
            int money = cost * amount;
            if (status.check_capacity(money) == 1)
            {
                int isPresent = 0;
                for (int i = 0; i < medicine.Count; i++)
                {
                    if (name == medicine[i].name)
                    {
                        medicine[i].quantity += amount;
                        isPresent = 1;
                    }
                }
                if (isPresent == 0)
                {
                    medicine.Add(med);
                }
                status.addMed(money);
            }
            else
            {
                MessageBox.Show("Not Enough Balance");
            }
            
            add_name_box.Clear();
            add_cost_box.Clear();
            add_qty_box.Clear();
        }

        private void search_med_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(search_name_box.Text);
            for(int i = 0; i < medicine.Count; i++)
            {
                if(name == medicine[i].name)
                {
                    MessageBox.Show(medicine[i].getinfo());
                }
            }
            search_name_box.Clear();
        }

        private void check_btn_OnClick(object sender, EventArgs e)

        {
            
            MessageBox.Show(status.checkBalance());
        }

        private void buy_btn_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(buy_name_box.Text);
            int amount = Convert.ToInt32(buy_qty_box.Text);
            
            for(int i = 0; i < medicine.Count; i++)
            {
                if(name == medicine[i].name)
                {
                    medicine[i].quantity -= amount;
                    status.sellMed(medicine[i].cost * amount);
                }
            }
            buy_name_box.Clear();
            buy_qty_box.Clear();
        }
    }
}
