using Microsoft.VisualBasic.FileIO;
using System;

using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab_final_102
{
    public partial class Form1 : Form
    {
        List<Result> results = new List<Result>();
        public Form1()
        {
            InitializeComponent();
        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            using (var reader = new StreamReader(@"F:\IUT\CSE 4201 OOC\OOC-projects\Lab final 102\MarkSheet.csv"))
            {
                
                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    var values = line.Split(',');

                    try
                    {
                        Result result = new Result(Convert.ToInt32(values[0]), Convert.ToString(values[1]), Convert.ToInt32(values[3]), Convert.ToInt32(values[4]), Convert.ToInt32(values[5]), Convert.ToInt32(values[6]), Convert.ToInt32(values[7]), Convert.ToInt32(values[8]), Convert.ToInt32(values[9]), Convert.ToInt32(values[2]));
                        results.Add(result);
                    }
                    catch(SystemException e1)
                    {
                        Console.WriteLine("Wrong format");
                    }
                    

                    
                }
            }

            for(int i = 0; i < results.Count; i++)
            {
                id_list.Items.Add(results[i].id);
                name_list.Items.Add(results[i].name);
                percent_list.Items.Add(results[i].percentage);
                grade_list.Items.Add(results[i].grade);
            }
        }

        private void search_btn_click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(search_box.Text);
            var foo = from student in results
                      where student.id == id
                      select student;
            foreach (Result result in foo)
            {
                
                    id_label.Text = result.id.ToString();
                    name_label.Text = result.name.ToString();
                    quiz1_label.Text = result.quiz1.ToString();
                    quiz2_label.Text = result.quiz2.ToString();
                    quiz3_label.Text = result.quiz3.ToString();
                    quiz4_label.Text = result.quiz4.ToString();
                    quiz_total_label.Text = result.quiz_total.ToString();
                    mid_label.Text = result.mid.ToString();
                    final_label.Text = result.final.ToString();
                    total_label.Text = result.total.ToString();
                    percentage_label.Text = result.percentage.ToString();
                    grade_label.Text = result.grade.ToString();
                    attendance_label.Text = result.attendance.ToString();
                
            }

            
        }
    }
    

}
