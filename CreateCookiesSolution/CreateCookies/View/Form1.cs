﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CreateCookies
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'createCookiesDataSet.Orde' table. You can move, or remove it, as needed.
            this.ordeTableAdapter.Fill(this.createCookiesDataSet.Orde);

        }

        private void ordeBindingSource_CurrentChanged(object sender, EventArgs e)
        {

        }
    }
}