﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace NavWS.Models
{
    public class Employee
    {
        //public byte[] timestamp { get; set; }
        public string Employee_No_ { get; set; }
        public string First_Name { get; set; }
        public string Middle_Name { get; set; }
        public string Last_Name { get; set; }
        public string Initials { get; set; }
        public string Job_Title { get; set; }
        public string Search_Name { get; set; }
        public string Address { get; set; }
        public string Address_2 { get; set; }
        public string City { get; set; }
        public string Post_Code { get; set; }
        public string County { get; set; }
        public string Phone_No_ { get; set; }
        public string Mobile_PhoneNo_ { get; set; }
        public string E_Mail { get; set; }
        public string Alt__Address_Code { get; set; }
        public System.DateTime Alt__Address_Start_Date { get; set; }
        public System.DateTime Alt__Address_End_Date { get; set; }
        public byte[] Picture { get; set; }
        public System.DateTime Birth_Date { get; set; }
        public string Social_Security_No_ { get; set; }
        public string Union_Code { get; set; }
        public string Union_Membership_No_ { get; set; }
        public int Sex { get; set; }
        public string Country_Region_Code { get; set; }
        public string Manager_No_ { get; set; }
        public string Emplymt__Contract_Code { get; set; }
        public string Statistics_Group_Code { get; set; }
        public System.DateTime Employment_Date { get; set; }
        public int Status { get; set; }
        public System.DateTime Inactive_Date { get; set; }
        public string Cause_of_Inactivity_Code { get; set; }
        public System.DateTime Termination_Date { get; set; }
        public string Grounds_for_Term__Code { get; set; }
        public string Global_Dimension_1_Code { get; set; }
        public string Global_Dimension_2_Code { get; set; }
        public string Resource_No_ { get; set; }
        public System.DateTime Last_Date_Modified { get; set; }
        public string Extension { get; set; }
        public string Pager { get; set; }
        public string Fax_No_ { get; set; }
        public string Company_E_Mail { get; set; }
        public string Title { get; set; }
        public string Salespers__Purch__Code { get; set; }
        public string No__Series { get; set; }
    }
}