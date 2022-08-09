namespace Hotel_Management_System
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
            this.owner_booking_box = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.owner_combo_box = new System.Windows.Forms.ComboBox();
            this.owner_status_box = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.user_id1_box = new System.Windows.Forms.TextBox();
            this.user_name_box = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.user_contact_box = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.user_address_box = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.user_save_btn = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.room_depart_box = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.room_entry_box = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.user_id2_box = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.room_quantity_box = new System.Windows.Forms.TextBox();
            this.label12 = new System.Windows.Forms.Label();
            this.room_combo_box = new System.Windows.Forms.ComboBox();
            this.label13 = new System.Windows.Forms.Label();
            this.label14 = new System.Windows.Forms.Label();
            this.label15 = new System.Windows.Forms.Label();
            this.status_booking_box = new System.Windows.Forms.TextBox();
            this.label16 = new System.Windows.Forms.Label();
            this.status_booking_label = new System.Windows.Forms.Label();
            this.room_booking_label = new System.Windows.Forms.Label();
            this.label19 = new System.Windows.Forms.Label();
            this.price_booking_label = new System.Windows.Forms.Label();
            this.label21 = new System.Windows.Forms.Label();
            this.username_booking_label = new System.Windows.Forms.Label();
            this.label23 = new System.Windows.Forms.Label();
            this.address_booking_label = new System.Windows.Forms.Label();
            this.label25 = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(28, 33);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(59, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Owner ";
            // 
            // owner_booking_box
            // 
            this.owner_booking_box.Location = new System.Drawing.Point(81, 67);
            this.owner_booking_box.Name = "owner_booking_box";
            this.owner_booking_box.Size = new System.Drawing.Size(85, 20);
            this.owner_booking_box.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 70);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(63, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Booking ID:";
            // 
            // owner_combo_box
            // 
            this.owner_combo_box.FormattingEnabled = true;
            this.owner_combo_box.Items.AddRange(new object[] {
            "Pending",
            "Approved"});
            this.owner_combo_box.Location = new System.Drawing.Point(181, 67);
            this.owner_combo_box.Name = "owner_combo_box";
            this.owner_combo_box.Size = new System.Drawing.Size(101, 21);
            this.owner_combo_box.TabIndex = 3;
            // 
            // owner_status_box
            // 
            this.owner_status_box.Location = new System.Drawing.Point(181, 109);
            this.owner_status_box.Name = "owner_status_box";
            this.owner_status_box.Size = new System.Drawing.Size(75, 23);
            this.owner_status_box.TabIndex = 4;
            this.owner_status_box.Text = "Set Status";
            this.owner_status_box.UseVisualStyleBackColor = true;
            this.owner_status_box.Click += new System.EventHandler(this.status_btn_OnCLick);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(402, 33);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(42, 17);
            this.label3.TabIndex = 5;
            this.label3.Text = "User";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(369, 67);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(46, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "User ID:";
            // 
            // user_id1_box
            // 
            this.user_id1_box.Location = new System.Drawing.Point(421, 60);
            this.user_id1_box.Name = "user_id1_box";
            this.user_id1_box.Size = new System.Drawing.Size(100, 20);
            this.user_id1_box.TabIndex = 7;
            // 
            // user_name_box
            // 
            this.user_name_box.Location = new System.Drawing.Point(421, 98);
            this.user_name_box.Name = "user_name_box";
            this.user_name_box.Size = new System.Drawing.Size(100, 20);
            this.user_name_box.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(369, 105);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(38, 13);
            this.label5.TabIndex = 8;
            this.label5.Text = "Name:";
            // 
            // user_contact_box
            // 
            this.user_contact_box.Location = new System.Drawing.Point(421, 134);
            this.user_contact_box.Name = "user_contact_box";
            this.user_contact_box.Size = new System.Drawing.Size(100, 20);
            this.user_contact_box.TabIndex = 11;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(353, 141);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(62, 13);
            this.label6.TabIndex = 10;
            this.label6.Text = "Contact no.";
            // 
            // user_address_box
            // 
            this.user_address_box.Location = new System.Drawing.Point(421, 175);
            this.user_address_box.Name = "user_address_box";
            this.user_address_box.Size = new System.Drawing.Size(100, 20);
            this.user_address_box.TabIndex = 13;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(359, 182);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(48, 13);
            this.label7.TabIndex = 12;
            this.label7.Text = "Address:";
            // 
            // user_save_btn
            // 
            this.user_save_btn.Location = new System.Drawing.Point(421, 223);
            this.user_save_btn.Name = "user_save_btn";
            this.user_save_btn.Size = new System.Drawing.Size(75, 23);
            this.user_save_btn.TabIndex = 14;
            this.user_save_btn.Text = "Save User";
            this.user_save_btn.UseVisualStyleBackColor = true;
            this.user_save_btn.Click += new System.EventHandler(this.user_save_btn_OnClick);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(614, 223);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(108, 23);
            this.button1.TabIndex = 23;
            this.button1.Text = "Place Booking";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.booking_place_OnClick);
            // 
            // room_depart_box
            // 
            this.room_depart_box.Location = new System.Drawing.Point(614, 175);
            this.room_depart_box.Name = "room_depart_box";
            this.room_depart_box.Size = new System.Drawing.Size(100, 20);
            this.room_depart_box.TabIndex = 22;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(543, 182);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(65, 13);
            this.label8.TabIndex = 21;
            this.label8.Text = "Depart Date";
            // 
            // room_entry_box
            // 
            this.room_entry_box.Location = new System.Drawing.Point(614, 134);
            this.room_entry_box.Name = "room_entry_box";
            this.room_entry_box.Size = new System.Drawing.Size(100, 20);
            this.room_entry_box.TabIndex = 20;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(546, 141);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(57, 13);
            this.label9.TabIndex = 19;
            this.label9.Text = "Entry Date";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(562, 105);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(35, 13);
            this.label10.TabIndex = 17;
            this.label10.Text = "Room";
            // 
            // user_id2_box
            // 
            this.user_id2_box.Location = new System.Drawing.Point(614, 60);
            this.user_id2_box.Name = "user_id2_box";
            this.user_id2_box.Size = new System.Drawing.Size(100, 20);
            this.user_id2_box.TabIndex = 16;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(562, 67);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(46, 13);
            this.label11.TabIndex = 15;
            this.label11.Text = "User ID:";
            // 
            // room_quantity_box
            // 
            this.room_quantity_box.Location = new System.Drawing.Point(792, 60);
            this.room_quantity_box.Name = "room_quantity_box";
            this.room_quantity_box.Size = new System.Drawing.Size(100, 20);
            this.room_quantity_box.TabIndex = 25;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(740, 67);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(46, 13);
            this.label12.TabIndex = 24;
            this.label12.Text = "Quantity";
            // 
            // room_combo_box
            // 
            this.room_combo_box.FormattingEnabled = true;
            this.room_combo_box.Items.AddRange(new object[] {
            "Single",
            "Double"});
            this.room_combo_box.Location = new System.Drawing.Point(614, 98);
            this.room_combo_box.Name = "room_combo_box";
            this.room_combo_box.Size = new System.Drawing.Size(100, 21);
            this.room_combo_box.TabIndex = 26;
            // 
            // label13
            // 
            this.label13.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.label13.Location = new System.Drawing.Point(313, 25);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(10, 299);
            this.label13.TabIndex = 27;
            // 
            // label14
            // 
            this.label14.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.label14.Location = new System.Drawing.Point(313, 324);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(670, 10);
            this.label14.TabIndex = 28;
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(336, 363);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(63, 13);
            this.label15.TabIndex = 30;
            this.label15.Text = "Booking ID:";
            // 
            // status_booking_box
            // 
            this.status_booking_box.Location = new System.Drawing.Point(405, 360);
            this.status_booking_box.Name = "status_booking_box";
            this.status_booking_box.Size = new System.Drawing.Size(85, 20);
            this.status_booking_box.TabIndex = 29;
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(339, 402);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(37, 13);
            this.label16.TabIndex = 31;
            this.label16.Text = "Status";
            // 
            // status_booking_label
            // 
            this.status_booking_label.AutoSize = true;
            this.status_booking_label.Location = new System.Drawing.Point(383, 402);
            this.status_booking_label.Name = "status_booking_label";
            this.status_booking_label.Size = new System.Drawing.Size(0, 13);
            this.status_booking_label.TabIndex = 32;
            // 
            // room_booking_label
            // 
            this.room_booking_label.AutoSize = true;
            this.room_booking_label.Location = new System.Drawing.Point(383, 424);
            this.room_booking_label.Name = "room_booking_label";
            this.room_booking_label.Size = new System.Drawing.Size(0, 13);
            this.room_booking_label.TabIndex = 34;
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(339, 424);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(38, 13);
            this.label19.TabIndex = 33;
            this.label19.Text = "Room ";
            // 
            // price_booking_label
            // 
            this.price_booking_label.AutoSize = true;
            this.price_booking_label.Location = new System.Drawing.Point(383, 449);
            this.price_booking_label.Name = "price_booking_label";
            this.price_booking_label.Size = new System.Drawing.Size(0, 13);
            this.price_booking_label.TabIndex = 36;
            // 
            // label21
            // 
            this.label21.AutoSize = true;
            this.label21.Location = new System.Drawing.Point(339, 449);
            this.label21.Name = "label21";
            this.label21.Size = new System.Drawing.Size(31, 13);
            this.label21.TabIndex = 35;
            this.label21.Text = "Price";
            // 
            // username_booking_label
            // 
            this.username_booking_label.AutoSize = true;
            this.username_booking_label.Location = new System.Drawing.Point(383, 475);
            this.username_booking_label.Name = "username_booking_label";
            this.username_booking_label.Size = new System.Drawing.Size(0, 13);
            this.username_booking_label.TabIndex = 38;
            // 
            // label23
            // 
            this.label23.AutoSize = true;
            this.label23.Location = new System.Drawing.Point(317, 475);
            this.label23.Name = "label23";
            this.label23.Size = new System.Drawing.Size(60, 13);
            this.label23.TabIndex = 37;
            this.label23.Text = "User Name";
            // 
            // address_booking_label
            // 
            this.address_booking_label.AutoSize = true;
            this.address_booking_label.Location = new System.Drawing.Point(383, 502);
            this.address_booking_label.Name = "address_booking_label";
            this.address_booking_label.Size = new System.Drawing.Size(0, 13);
            this.address_booking_label.TabIndex = 40;
            // 
            // label25
            // 
            this.label25.AutoSize = true;
            this.label25.Location = new System.Drawing.Point(331, 502);
            this.label25.Name = "label25";
            this.label25.Size = new System.Drawing.Size(45, 13);
            this.label25.TabIndex = 39;
            this.label25.Text = "Address";
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(522, 358);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(98, 23);
            this.button2.TabIndex = 41;
            this.button2.Text = "Check Status";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.check_status_OnCLick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1087, 610);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.address_booking_label);
            this.Controls.Add(this.label25);
            this.Controls.Add(this.username_booking_label);
            this.Controls.Add(this.label23);
            this.Controls.Add(this.price_booking_label);
            this.Controls.Add(this.label21);
            this.Controls.Add(this.room_booking_label);
            this.Controls.Add(this.label19);
            this.Controls.Add(this.status_booking_label);
            this.Controls.Add(this.label16);
            this.Controls.Add(this.label15);
            this.Controls.Add(this.status_booking_box);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.label13);
            this.Controls.Add(this.room_combo_box);
            this.Controls.Add(this.room_quantity_box);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.room_depart_box);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.room_entry_box);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.user_id2_box);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.user_save_btn);
            this.Controls.Add(this.user_address_box);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.user_contact_box);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.user_name_box);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.user_id1_box);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.owner_status_box);
            this.Controls.Add(this.owner_combo_box);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.owner_booking_box);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox owner_booking_box;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox owner_combo_box;
        private System.Windows.Forms.Button owner_status_box;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox user_id1_box;
        private System.Windows.Forms.TextBox user_name_box;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox user_contact_box;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox user_address_box;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button user_save_btn;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox room_depart_box;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox room_entry_box;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox user_id2_box;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.TextBox room_quantity_box;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.ComboBox room_combo_box;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.TextBox status_booking_box;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.Label status_booking_label;
        private System.Windows.Forms.Label room_booking_label;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.Label price_booking_label;
        private System.Windows.Forms.Label label21;
        private System.Windows.Forms.Label username_booking_label;
        private System.Windows.Forms.Label label23;
        private System.Windows.Forms.Label address_booking_label;
        private System.Windows.Forms.Label label25;
        private System.Windows.Forms.Button button2;
    }
}

