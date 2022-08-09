using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Employee_management_system_102
{
    public partial class Form1 : Form
    {
        List<Employee> employees = new List<Employee>();

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Add_Click(object sender, EventArgs e)
        {

            string name = Convert.ToString(add_name_box.Text);
            string category = Convert.ToString(add_category_box.Text);
            string contact = Convert.ToString(add_contact_box.Text);
            string leaves = Convert.ToString(add_leaves_box.Text);
            int salary = Convert.ToInt32(add_salary_box.Text);
            string date = Convert.ToString(dt_add_joining.Value);

            if(category == "Manager")
            {
                Manager manager = new Manager(name, contact, date, leaves, salary);
                employees.Add(manager);

            }else if(category == "Salesperson")
            {
                SalesPerson salesperson = new SalesPerson(name, contact, date, leaves,salary);
                employees.Add(salesperson);

            }else if (category == "Typewriter")
            {
                Typewriter typewriter = new Typewriter(name, contact, date, leaves, salary);
                employees.Add(typewriter);

            }
            string id = "";
            for(int i = 0; i < employees.Count; i++)
            {
                if(name == employees[i].name)
                {
                    id = Convert.ToString(employees[i].id);
                }
            }
             MessageBox.Show("Employee Added, ID = "+ id);
        }

        private void update_onClick(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(update_id_box.Text);
            string name = Convert.ToString(update_name_box.Text);
            string category = Convert.ToString(update_category_box.Text);
            string contact = Convert.ToString (update_contact_box.Text);
            string leaves = Convert.ToString(update_leaves_box.Text);
            int salary = Convert.ToInt32 (update_salary_box.Text);


            for(int i = 0;i< employees.Count; i++)
            {
                if(id == employees[i].id)
                {
                    if(name != "")
                    {
                        employees[i].name = name;
                    }
                    if (category != "")
                    {
                        employees[i].category = category;
                    }
                    if (contact != "")
                    {
                        employees[i].contact = contact;
                    }
                    if (leaves != "")
                    {
                        employees[i].leave = leaves;
                    }
                    if (salary != 0)
                    {
                        employees[i].salary = salary;
                    }
                }
            }
        }

        private void search_onClick(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(search_id_box.Text);
            if (id > employees.Count - 1)
            {
                throw new exceptionbyId("ID is out of range");
            }

            for(int i = 0; i < employees.Count; i++)
            {
                if (id == employees[i].id)
                {
                    search_name_label.Text = employees[i].name;
                    search_category_label.Text= employees[i].category;
                    search_contact_label.Text= employees[i].contact;
                    search_joining_label.Text = employees[i].joining_date;
                    search_leaves_label.Text = employees[i].leave;
                    search_salary_label.Text = Convert.ToString(employees[i].salary);
                    
                }
            }
        }
    }
}
