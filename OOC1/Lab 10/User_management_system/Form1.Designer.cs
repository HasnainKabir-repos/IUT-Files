namespace User_management_system
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
            this.main_list_box = new System.Windows.Forms.ListBox();
            this.search_box = new System.Windows.Forms.TextBox();
            this.search_btn = new System.Windows.Forms.Button();
            this.first_name_label = new System.Windows.Forms.Label();
            this.last_name_label = new System.Windows.Forms.Label();
            this.company_label = new System.Windows.Forms.Label();
            this.address_label = new System.Windows.Forms.Label();
            this.city_label = new System.Windows.Forms.Label();
            this.county_label = new System.Windows.Forms.Label();
            this.state_label = new System.Windows.Forms.Label();
            this.zip_label = new System.Windows.Forms.Label();
            this.phone1_label = new System.Windows.Forms.Label();
            this.phone_label = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.search_mail_label = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // main_list_box
            // 
            this.main_list_box.FormattingEnabled = true;
            this.main_list_box.Location = new System.Drawing.Point(3, 1);
            this.main_list_box.Name = "main_list_box";
            this.main_list_box.Size = new System.Drawing.Size(333, 433);
            this.main_list_box.TabIndex = 0;
            this.main_list_box.SelectedIndexChanged += new System.EventHandler(this.main_list_box_SelectedIndexChanged);
            // 
            // search_box
            // 
            this.search_box.Location = new System.Drawing.Point(379, 46);
            this.search_box.Name = "search_box";
            this.search_box.Size = new System.Drawing.Size(151, 20);
            this.search_box.TabIndex = 1;
            this.search_box.TextChanged += new System.EventHandler(this.search_box_TextChanged);
            // 
            // search_btn
            // 
            this.search_btn.Location = new System.Drawing.Point(455, 83);
            this.search_btn.Name = "search_btn";
            this.search_btn.Size = new System.Drawing.Size(75, 23);
            this.search_btn.TabIndex = 2;
            this.search_btn.Text = "Search";
            this.search_btn.UseVisualStyleBackColor = true;
            this.search_btn.Click += new System.EventHandler(this.search_btn_OnClick);
            // 
            // first_name_label
            // 
            this.first_name_label.AutoSize = true;
            this.first_name_label.Location = new System.Drawing.Point(376, 129);
            this.first_name_label.Name = "first_name_label";
            this.first_name_label.Size = new System.Drawing.Size(0, 13);
            this.first_name_label.TabIndex = 3;
            // 
            // last_name_label
            // 
            this.last_name_label.AutoSize = true;
            this.last_name_label.Location = new System.Drawing.Point(376, 156);
            this.last_name_label.Name = "last_name_label";
            this.last_name_label.Size = new System.Drawing.Size(0, 13);
            this.last_name_label.TabIndex = 4;
            // 
            // company_label
            // 
            this.company_label.AutoSize = true;
            this.company_label.Location = new System.Drawing.Point(376, 182);
            this.company_label.Name = "company_label";
            this.company_label.Size = new System.Drawing.Size(0, 13);
            this.company_label.TabIndex = 5;
            // 
            // address_label
            // 
            this.address_label.AutoSize = true;
            this.address_label.Location = new System.Drawing.Point(376, 205);
            this.address_label.Name = "address_label";
            this.address_label.Size = new System.Drawing.Size(0, 13);
            this.address_label.TabIndex = 6;
            // 
            // city_label
            // 
            this.city_label.AutoSize = true;
            this.city_label.Location = new System.Drawing.Point(376, 228);
            this.city_label.Name = "city_label";
            this.city_label.Size = new System.Drawing.Size(0, 13);
            this.city_label.TabIndex = 7;
            // 
            // county_label
            // 
            this.county_label.AutoSize = true;
            this.county_label.Location = new System.Drawing.Point(376, 252);
            this.county_label.Name = "county_label";
            this.county_label.Size = new System.Drawing.Size(0, 13);
            this.county_label.TabIndex = 8;
            // 
            // state_label
            // 
            this.state_label.AutoSize = true;
            this.state_label.Location = new System.Drawing.Point(376, 275);
            this.state_label.Name = "state_label";
            this.state_label.Size = new System.Drawing.Size(0, 13);
            this.state_label.TabIndex = 9;
            // 
            // zip_label
            // 
            this.zip_label.AutoSize = true;
            this.zip_label.Location = new System.Drawing.Point(376, 303);
            this.zip_label.Name = "zip_label";
            this.zip_label.Size = new System.Drawing.Size(0, 13);
            this.zip_label.TabIndex = 10;
            // 
            // phone1_label
            // 
            this.phone1_label.AutoSize = true;
            this.phone1_label.Location = new System.Drawing.Point(376, 328);
            this.phone1_label.Name = "phone1_label";
            this.phone1_label.Size = new System.Drawing.Size(0, 13);
            this.phone1_label.TabIndex = 11;
            // 
            // phone_label
            // 
            this.phone_label.AutoSize = true;
            this.phone_label.Location = new System.Drawing.Point(376, 350);
            this.phone_label.Name = "phone_label";
            this.phone_label.Size = new System.Drawing.Size(0, 13);
            this.phone_label.TabIndex = 12;
            this.phone_label.Click += new System.EventHandler(this.label10_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(620, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(72, 13);
            this.label1.TabIndex = 13;
            this.label1.Text = "Search Log";
            // 
            // search_mail_label
            // 
            this.search_mail_label.AutoSize = true;
            this.search_mail_label.Location = new System.Drawing.Point(620, 70);
            this.search_mail_label.Name = "search_mail_label";
            this.search_mail_label.Size = new System.Drawing.Size(0, 13);
            this.search_mail_label.TabIndex = 14;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(965, 450);
            this.Controls.Add(this.search_mail_label);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.phone_label);
            this.Controls.Add(this.phone1_label);
            this.Controls.Add(this.zip_label);
            this.Controls.Add(this.state_label);
            this.Controls.Add(this.county_label);
            this.Controls.Add(this.city_label);
            this.Controls.Add(this.address_label);
            this.Controls.Add(this.company_label);
            this.Controls.Add(this.last_name_label);
            this.Controls.Add(this.first_name_label);
            this.Controls.Add(this.search_btn);
            this.Controls.Add(this.search_box);
            this.Controls.Add(this.main_list_box);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox main_list_box;
        private System.Windows.Forms.TextBox search_box;
        private System.Windows.Forms.Button search_btn;
        private System.Windows.Forms.Label first_name_label;
        private System.Windows.Forms.Label last_name_label;
        private System.Windows.Forms.Label company_label;
        private System.Windows.Forms.Label address_label;
        private System.Windows.Forms.Label city_label;
        private System.Windows.Forms.Label county_label;
        private System.Windows.Forms.Label state_label;
        private System.Windows.Forms.Label zip_label;
        private System.Windows.Forms.Label phone1_label;
        private System.Windows.Forms.Label phone_label;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label search_mail_label;
    }
}

