using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace IUT_LMS_02
{
    public partial class Form1 : Form
    {
        List<Teacher> teachers = new List<Teacher>();
        List<Student> students = new List<Student>();
        public Form1()
        {
            InitializeComponent();
        }

        private void add_teacher_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(teacher_name_box.Text);
            string type = Convert.ToString(teacher_type_box.Text);
            if(type == "Lecturer")
            {
                Lecturer lecturer = new Lecturer(name);
                teachers.Add(lecturer);
            }
            else
            {
                Professor professor = new Professor(name);
                teachers.Add(professor);
            }

            course_teacher_box.Items.Add(name);
            teacher_info_box.Items.Add(name);
            teacher_name_box.Clear();
        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void add_course_OnClick(object sender, EventArgs e)
        {
            int code = Convert.ToInt32(course_code_box.Text);
            string type = Convert.ToString(course_type_box.Text);
            string title = Convert.ToString(course_title_box.Text);
            string semester = Convert.ToString(course_semester_box.Text);
            string teacher = Convert.ToString(course_teacher_box.Text);

            for(int i = 0; i < teachers.Count; i++)
            {   
                if(teachers[i].name == teacher)
                {
                    if(type == "Theory" && teachers[i].type == "Lecturer")
                    {
                        MessageBox.Show("Invalid Input");
                    }
                    else
                    {
                        Course course = new Course(title, code, type, semester, teacher);
                        student_course_box.Items.Add(title);
                        for (int j = 0; j < teachers.Count; j++)
                        {
                            if (teacher == teachers[j].name)
                            {
                                teachers[j].setCourse(course);
                            }
                        }
                    }
                }
                
            }

            course_code_box.Clear();

            course_title_box.Clear();
        }

        private void add_student_OnClick(object sender, EventArgs e)
        {
            string name = Convert.ToString(student_name_box.Text);
            string semester = Convert.ToString(student_semester_box.Text);
            string course = Convert.ToString(student_course_box.Text);

            Student student = new Student(name, semester, course);
            student_info_box.Items.Add(name);
            students.Add(student);
        }

        private void student_info_OnClick(object sender, EventArgs e)
        {
            for (int i = 0; i < students.Count; i++)
            {
                if (Convert.ToString(student_info_box.Text) == students[i].name)
                {
                    student_list_box.Items.Add(students[i].getInfo());
                }
            }
        }

        private void teacher_info_OnClick(object sender, EventArgs e)
        {
            for (int i = 0; i < teachers.Count; i++)
            {
                if(Convert.ToString(teacher_info_box.Text) == teachers[i].name)
                {
                    teacher_list_box.Items.Add(teachers[i].getInfo());
                }
            }
        }
    }
}
