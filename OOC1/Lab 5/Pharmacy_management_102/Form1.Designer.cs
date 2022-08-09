namespace Pharmacy_management_102
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
            this.Medicine = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.add_name_box = new System.Windows.Forms.TextBox();
            this.add_cost_box = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.add_qty_box = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.search_name_box = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.button3 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.buy_qty_box = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.buy_name_box = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Medicine
            // 
            this.Medicine.AutoSize = true;
            this.Medicine.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Medicine.Location = new System.Drawing.Point(34, 22);
            this.Medicine.Name = "Medicine";
            this.Medicine.Size = new System.Drawing.Size(105, 17);
            this.Medicine.TabIndex = 0;
            this.Medicine.Text = "Add Medicine";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(37, 57);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Name";
            // 
            // add_name_box
            // 
            this.add_name_box.Location = new System.Drawing.Point(78, 54);
            this.add_name_box.Name = "add_name_box";
            this.add_name_box.Size = new System.Drawing.Size(100, 20);
            this.add_name_box.TabIndex = 2;
            // 
            // add_cost_box
            // 
            this.add_cost_box.Location = new System.Drawing.Point(78, 80);
            this.add_cost_box.Name = "add_cost_box";
            this.add_cost_box.Size = new System.Drawing.Size(100, 20);
            this.add_cost_box.TabIndex = 4;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(22, 87);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(55, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Cost /Unit";
            // 
            // add_qty_box
            // 
            this.add_qty_box.Location = new System.Drawing.Point(78, 106);
            this.add_qty_box.Name = "add_qty_box";
            this.add_qty_box.Size = new System.Drawing.Size(100, 20);
            this.add_qty_box.TabIndex = 6;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(26, 113);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(46, 13);
            this.label3.TabIndex = 5;
            this.label3.Text = "Quantity";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(78, 148);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(100, 23);
            this.button1.TabIndex = 9;
            this.button1.Text = "Add Medicine";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.add_med_OnClick);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(313, 87);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(100, 23);
            this.button2.TabIndex = 17;
            this.button2.Text = "Search ";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.search_med_OnClick);
            // 
            // search_name_box
            // 
            this.search_name_box.Location = new System.Drawing.Point(313, 54);
            this.search_name_box.Name = "search_name_box";
            this.search_name_box.Size = new System.Drawing.Size(100, 20);
            this.search_name_box.TabIndex = 12;
            this.search_name_box.TextChanged += new System.EventHandler(this.textBox3_TextChanged);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(272, 57);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(35, 13);
            this.label6.TabIndex = 11;
            this.label6.Text = "Name";
            this.label6.Click += new System.EventHandler(this.label6_Click);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(269, 22);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(128, 17);
            this.label7.TabIndex = 10;
            this.label7.Text = "Search Medicine";
            this.label7.Click += new System.EventHandler(this.label7_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(310, 171);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(103, 17);
            this.label4.TabIndex = 18;
            this.label4.Text = "Status Check";
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(313, 200);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(100, 23);
            this.button3.TabIndex = 19;
            this.button3.Text = "Check Balance";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.check_btn_OnClick);
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(586, 127);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(100, 23);
            this.button4.TabIndex = 27;
            this.button4.Text = "Sell  Medicine";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.buy_btn_OnClick);
            // 
            // buy_qty_box
            // 
            this.buy_qty_box.Location = new System.Drawing.Point(586, 87);
            this.buy_qty_box.Name = "buy_qty_box";
            this.buy_qty_box.Size = new System.Drawing.Size(100, 20);
            this.buy_qty_box.TabIndex = 26;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(534, 94);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(46, 13);
            this.label5.TabIndex = 25;
            this.label5.Text = "Quantity";
            // 
            // buy_name_box
            // 
            this.buy_name_box.Location = new System.Drawing.Point(586, 54);
            this.buy_name_box.Name = "buy_name_box";
            this.buy_name_box.Size = new System.Drawing.Size(100, 20);
            this.buy_name_box.TabIndex = 22;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(545, 57);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(35, 13);
            this.label9.TabIndex = 21;
            this.label9.Text = "Name";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(542, 22);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(104, 17);
            this.label10.TabIndex = 20;
            this.label10.Text = "Sell Medicine";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.buy_qty_box);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.buy_name_box);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.search_name_box);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.add_qty_box);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.add_cost_box);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.add_name_box);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Medicine);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label Medicine;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox add_name_box;
        private System.Windows.Forms.TextBox add_cost_box;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox add_qty_box;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.TextBox search_name_box;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.TextBox buy_qty_box;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox buy_name_box;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
    }
}

