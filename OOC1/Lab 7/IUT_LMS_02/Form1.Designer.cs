namespace IUT_LMS_02
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.teacher_name_box = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.course_title_box = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.label9 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.student_name_box = new System.Windows.Forms.TextBox();
            this.label12 = new System.Windows.Forms.Label();
            this.label13 = new System.Windows.Forms.Label();
            this.button3 = new System.Windows.Forms.Button();
            this.teacher_type_box = new System.Windows.Forms.ComboBox();
            this.course_type_box = new System.Windows.Forms.ComboBox();
            this.course_semester_box = new System.Windows.Forms.ComboBox();
            this.course_teacher_box = new System.Windows.Forms.ComboBox();
            this.student_semester_box = new System.Windows.Forms.ComboBox();
            this.student_list_box = new System.Windows.Forms.ListBox();
            this.student_info_box = new System.Windows.Forms.ComboBox();
            this.button4 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.teacher_info_box = new System.Windows.Forms.ComboBox();
            this.teacher_list_box = new System.Windows.Forms.ListBox();
            this.student_course_box = new System.Windows.Forms.ComboBox();
            this.course_code_box = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(27, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(100, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Teacher Info";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(36, 65);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Name: ";
            // 
            // teacher_name_box
            // 
            this.teacher_name_box.Location = new System.Drawing.Point(83, 62);
            this.teacher_name_box.Name = "teacher_name_box";
            this.teacher_name_box.Size = new System.Drawing.Size(100, 20);
            this.teacher_name_box.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(2, 91);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(77, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "Teacher Type:";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(94, 126);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(88, 23);
            this.button1.TabIndex = 5;
            this.button1.Text = "Add Teacher";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.add_teacher_OnClick);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(208, 91);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(70, 13);
            this.label4.TabIndex = 9;
            this.label4.Text = "Course Type:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(207, 65);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(71, 13);
            this.label5.TabIndex = 7;
            this.label5.Text = "Course Code:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(233, 32);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(91, 17);
            this.label6.TabIndex = 6;
            this.label6.Text = "Course Info";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(214, 143);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(51, 13);
            this.label7.TabIndex = 13;
            this.label7.Text = "Semester";
            // 
            // course_title_box
            // 
            this.course_title_box.Location = new System.Drawing.Point(289, 114);
            this.course_title_box.Name = "course_title_box";
            this.course_title_box.Size = new System.Drawing.Size(100, 20);
            this.course_title_box.TabIndex = 12;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(212, 117);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(66, 13);
            this.label8.TabIndex = 11;
            this.label8.Text = "Course Title:";
            this.label8.Click += new System.EventHandler(this.label8_Click);
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(214, 169);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(47, 13);
            this.label10.TabIndex = 15;
            this.label10.Text = "Teacher";
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(301, 207);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(88, 23);
            this.button2.TabIndex = 17;
            this.button2.Text = "Add ";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.add_course_OnClick);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(481, 117);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(43, 13);
            this.label9.TabIndex = 23;
            this.label9.Text = "Course ";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(472, 91);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(51, 13);
            this.label11.TabIndex = 21;
            this.label11.Text = "Semester";
            // 
            // student_name_box
            // 
            this.student_name_box.Location = new System.Drawing.Point(553, 62);
            this.student_name_box.Name = "student_name_box";
            this.student_name_box.Size = new System.Drawing.Size(100, 20);
            this.student_name_box.TabIndex = 20;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(481, 62);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(38, 13);
            this.label12.TabIndex = 19;
            this.label12.Text = "Name:";
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label13.Location = new System.Drawing.Point(497, 32);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(96, 17);
            this.label13.TabIndex = 18;
            this.label13.Text = "Student Info";
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(565, 143);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(88, 23);
            this.button3.TabIndex = 25;
            this.button3.Text = "Add ";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.add_student_OnClick);
            // 
            // teacher_type_box
            // 
            this.teacher_type_box.FormattingEnabled = true;
            this.teacher_type_box.Items.AddRange(new object[] {
            "Lecturer",
            "Professor"});
            this.teacher_type_box.Location = new System.Drawing.Point(83, 91);
            this.teacher_type_box.Name = "teacher_type_box";
            this.teacher_type_box.Size = new System.Drawing.Size(99, 21);
            this.teacher_type_box.TabIndex = 26;
            // 
            // course_type_box
            // 
            this.course_type_box.FormattingEnabled = true;
            this.course_type_box.Items.AddRange(new object[] {
            "Theory",
            "Lab"});
            this.course_type_box.Location = new System.Drawing.Point(289, 87);
            this.course_type_box.Name = "course_type_box";
            this.course_type_box.Size = new System.Drawing.Size(99, 21);
            this.course_type_box.TabIndex = 28;
            // 
            // course_semester_box
            // 
            this.course_semester_box.FormattingEnabled = true;
            this.course_semester_box.Items.AddRange(new object[] {
            "First",
            "Second"});
            this.course_semester_box.Location = new System.Drawing.Point(289, 140);
            this.course_semester_box.Name = "course_semester_box";
            this.course_semester_box.Size = new System.Drawing.Size(99, 21);
            this.course_semester_box.TabIndex = 29;
            // 
            // course_teacher_box
            // 
            this.course_teacher_box.FormattingEnabled = true;
            this.course_teacher_box.Location = new System.Drawing.Point(290, 169);
            this.course_teacher_box.Name = "course_teacher_box";
            this.course_teacher_box.Size = new System.Drawing.Size(99, 21);
            this.course_teacher_box.TabIndex = 30;
            // 
            // student_semester_box
            // 
            this.student_semester_box.FormattingEnabled = true;
            this.student_semester_box.Items.AddRange(new object[] {
            "First",
            "Second"});
            this.student_semester_box.Location = new System.Drawing.Point(553, 88);
            this.student_semester_box.Name = "student_semester_box";
            this.student_semester_box.Size = new System.Drawing.Size(99, 21);
            this.student_semester_box.TabIndex = 31;
            // 
            // student_list_box
            // 
            this.student_list_box.FormattingEnabled = true;
            this.student_list_box.Location = new System.Drawing.Point(30, 246);
            this.student_list_box.Name = "student_list_box";
            this.student_list_box.Size = new System.Drawing.Size(248, 95);
            this.student_list_box.TabIndex = 33;
            // 
            // student_info_box
            // 
            this.student_info_box.FormattingEnabled = true;
            this.student_info_box.Location = new System.Drawing.Point(30, 361);
            this.student_info_box.Name = "student_info_box";
            this.student_info_box.Size = new System.Drawing.Size(99, 21);
            this.student_info_box.TabIndex = 34;
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(146, 361);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(132, 23);
            this.button4.TabIndex = 35;
            this.button4.Text = "Show Student Info";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.student_info_OnClick);
            // 
            // button5
            // 
            this.button5.Location = new System.Drawing.Point(574, 361);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(132, 23);
            this.button5.TabIndex = 38;
            this.button5.Text = "Show Teacher Info";
            this.button5.UseVisualStyleBackColor = true;
            this.button5.Click += new System.EventHandler(this.teacher_info_OnClick);
            // 
            // teacher_info_box
            // 
            this.teacher_info_box.FormattingEnabled = true;
            this.teacher_info_box.Location = new System.Drawing.Point(458, 361);
            this.teacher_info_box.Name = "teacher_info_box";
            this.teacher_info_box.Size = new System.Drawing.Size(99, 21);
            this.teacher_info_box.TabIndex = 37;
            // 
            // teacher_list_box
            // 
            this.teacher_list_box.FormattingEnabled = true;
            this.teacher_list_box.Location = new System.Drawing.Point(458, 246);
            this.teacher_list_box.Name = "teacher_list_box";
            this.teacher_list_box.Size = new System.Drawing.Size(248, 95);
            this.teacher_list_box.TabIndex = 36;
            // 
            // student_course_box
            // 
            this.student_course_box.FormattingEnabled = true;
            this.student_course_box.Location = new System.Drawing.Point(553, 115);
            this.student_course_box.Name = "student_course_box";
            this.student_course_box.Size = new System.Drawing.Size(99, 21);
            this.student_course_box.TabIndex = 40;
            // 
            // course_code_box
            // 
            this.course_code_box.Location = new System.Drawing.Point(289, 59);
            this.course_code_box.Name = "course_code_box";
            this.course_code_box.Size = new System.Drawing.Size(100, 20);
            this.course_code_box.TabIndex = 41;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.course_code_box);
            this.Controls.Add(this.student_course_box);
            this.Controls.Add(this.button5);
            this.Controls.Add(this.teacher_info_box);
            this.Controls.Add(this.teacher_list_box);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.student_info_box);
            this.Controls.Add(this.student_list_box);
            this.Controls.Add(this.student_semester_box);
            this.Controls.Add(this.course_teacher_box);
            this.Controls.Add(this.course_semester_box);
            this.Controls.Add(this.course_type_box);
            this.Controls.Add(this.teacher_type_box);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.student_name_box);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.label13);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.course_title_box);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.teacher_name_box);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox teacher_name_box;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox course_title_box;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.TextBox student_name_box;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.ComboBox teacher_type_box;
        private System.Windows.Forms.ComboBox course_type_box;
        private System.Windows.Forms.ComboBox course_semester_box;
        private System.Windows.Forms.ComboBox course_teacher_box;
        private System.Windows.Forms.ComboBox student_semester_box;
        private System.Windows.Forms.ListBox student_list_box;
        private System.Windows.Forms.ComboBox student_info_box;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.ComboBox teacher_info_box;
        private System.Windows.Forms.ListBox teacher_list_box;
        private System.Windows.Forms.ComboBox student_course_box;
        private System.Windows.Forms.TextBox course_code_box;
    }
}

