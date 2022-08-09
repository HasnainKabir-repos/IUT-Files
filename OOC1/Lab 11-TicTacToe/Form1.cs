using System;
using System.Threading;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TicTacToe
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        List<Button> buttons = new List<Button>();
        int player = 0;
        int computer = 0;
        private bool is_empty(Button button)
        {

            if (Convert.ToString(button.Text) == "")
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            buttons.Add(button1);
            buttons.Add(button2);
            buttons.Add(button3);
            buttons.Add(button4);
            buttons.Add(button5);
            buttons.Add(button6);
            buttons.Add(button7);
            buttons.Add(button8);
            buttons.Add(button9);

            
        }

        private bool player_move;
        private bool decision_btn_clicked = false;

        private bool decision()
        {
            if (!decision_btn_clicked)
            {
                MessageBox.Show("Please decide if you want to go first or not");
                return false;
            }
            else
            {
                return true;
            }
        }

        private void yes_btn_Click(object sender, EventArgs e)
        {
            player_move = true;
            decision_btn_clicked = true;
            move_label.Text = "Player's move";
        }

        private void no_btn_Click(object sender, EventArgs e)
        {
            player_move = false;
            decision_btn_clicked = true;
            computers_move();
            player_move = true;
        }



        private async void computers_move()
        {
            move_label.Text = "Computer's move";
            await Task.Delay(1000);
            Random rnd = new Random();
            
            for (int i = 0; i < 9; i++)
            {
                int num = rnd.Next(0, 9);

                if (is_empty(buttons[num]))
                {
                    buttons[num].Text = "O";
                    break;
                }
            }
            
            move_label.Text = "Player's move";
            
        }
        
        private void winning_move()
        {
            if (winner())
            {
                if (player_won)
                {
                    MessageBox.Show("Player Won!");
                    player++;
                    player_score_label.Text = player.ToString();
                }
                else
                {
                    MessageBox.Show("Computer Won!");
                    computer++;
                    computer_score_label.Text = computer.ToString();
                }

                for(int i = 0; i < 9; i++)
                {
                    buttons[i].Text = "";
                }
            }
        }
        bool player_won = true;
        private bool winner()
        {
            if (buttons[0].Text == buttons[1].Text && buttons[1].Text == buttons[2].Text && !is_empty(buttons[0]) )
            {
                if(buttons[0].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[0].Text == buttons[3].Text && buttons[3].Text == buttons[6].Text && !is_empty(buttons[0]))
            {
                if (buttons[0].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[0].Text == buttons[4].Text && buttons[4].Text == buttons[8].Text && !is_empty(buttons[0]))
            {
                if (buttons[0].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[2].Text == buttons[5].Text && buttons[5].Text == buttons[8].Text && !is_empty(buttons[2]))
            {
                if (buttons[2].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[1].Text == buttons[4].Text && buttons[4].Text == buttons[7].Text && !is_empty(buttons[1]))
            {
                if (buttons[1].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[3].Text == buttons[4].Text && buttons[4].Text == buttons[5].Text && !is_empty(buttons[3]))
            {
                if (buttons[3].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[6].Text == buttons[7].Text && buttons[7].Text == buttons[8].Text && !is_empty(buttons[6]))
            {
                if (buttons[6].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }else if (buttons[2].Text == buttons[4].Text && buttons[4].Text == buttons[6].Text && !is_empty(buttons[2]))
            {
                if (buttons[2].Text == "O")
                {
                    player_won = false;
                }
                return true;
            }
            else
            {
                return false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button1.Text = "X";
                    
                    computers_move();
                    
                }
                
            }
            winning_move();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button2.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button3.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button4.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button5.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button6.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button7.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button8.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }

        private void button9_Click(object sender, EventArgs e)
        {
            if (decision())
            {
                if (player_move == true)
                {
                    button9.Text = "X";
                    computers_move();
                }
                
            }
            winning_move();
        }
    }
}