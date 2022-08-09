using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_final_102
{
    class Result
    {
        public int id;
        public string name;
        public int quiz1=0;
        public int quiz2=0;
        public int quiz3=0;
        public int quiz4=0;
        public int quiz_total;
        public int mid=0;
        public int final = 0;
        public int total;
        public int viva = 0;
        public double percentage;
        public string grade;
        public int attendance;

        public Result(int id, string name, int quiz1, int quiz2, int quiz3, int quiz4, int mid, int final, int viva, int attendance)
        {
            this.id = id;
            this.name = name;
            this.quiz1 = quiz1;
            this.quiz2 = quiz2;
            this.quiz3 = quiz3;
            this.quiz4 = quiz4;
            this.mid = mid;
            this.final = final;
            this.viva = viva;
            this.attendance = attendance;
            

            int[] quizzes = { quiz1, quiz2, quiz3, quiz4 };
            Array.Sort(quizzes);
            quiz_total = quizzes[1] + quizzes[2] + quizzes[3]; 
            total = quiz_total + this.mid + this.final + this.viva + this.attendance;
            percentage = total / 3;
            grade = find_grade();
        }

        public string find_grade()
        {
            if (percentage >= 80)
            {
                return "A+";
            }else if(percentage >= 75)
            {
                return "A";
            }
            else if (percentage >= 70)
            {
                return "A-";
            }
            else if (percentage >= 65)
            {
                return "B+";
            }
            else if (percentage >= 60)
            {
                return "B";
            }
            else if (percentage >= 55)
            {
                return "B-";
            }
            else if (percentage >= 50)
            {
                return "C+";
            }
            else if (percentage >= 45)
            {
                return "C";
            }
            else if (percentage >= 40)
            {
                return "D";
            }
            else
            {
                return "F";
            }
        }

       
    }
}
