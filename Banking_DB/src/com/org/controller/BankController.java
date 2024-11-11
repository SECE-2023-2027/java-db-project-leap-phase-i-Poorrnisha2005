package com.org.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.org.model.bank;
import com.org.service.Service;
import com.org.service.Serviceimplementation;

public class BankController {
	         private static Scanner sn=new Scanner(System.in);
             public static void main(String args[])
             {
            	 Service sv=new Serviceimplementation();
            	 try {
            		 bank n=new bank();
            		 n.db_connection();
            		 boolean exe=true;
            		 while(exe)
            		 {
            			 System.out.println("Connection successful...");
                		 System.out.println("1. Create Account");
                		 System.out.println("2. View Account");
                		 System.out.println("3. Update Account Info");
                		 System.out.println("4. Deposit Amount");
                		 System.out.println("5. Withdraw Amount");
                		 System.out.println("6. Transaction Amount");
                		 System.out.println("7. View Transaction");
                		 System.out.println("8. Exit");
                		 int input=sn.nextInt();
                		 switch(input)
                		 {
                		 case 1:
                			 sv.createaccount();
                			 System.out.println("1");
                			 break;
                		 case 2:
                			 sv.viewaccount();
                			 System.out.println("2");
                			 break;
                		 case 3:
                			 sv.updateaccount();
                			 System.out.println("3");
                			 break;
                		 case 4:
                			 sv.deposit();
                			 System.out.println("4");
                			 break;
                		 case 5:
                			 sv.withdraw();
                			 System.out.println("5");
                			 break;
                		 case 6:
                			 sv.amount_trans();
                			 System.out.println("6");
                			 break;
                		 case 7:
                			 sv.viewtrans();
                			 System.out.println("7");
                			 break;
                		 case 8:
                			 exe=false;
                			 System.out.println("8");
                			 break;
                		 default:
                			 System.out.println("Re-Enter your choice: ");
                		 }
                		 
                		 
            		 }
            	 }
            	 catch(SQLException e) {
            		 e.printStackTrace();
            	 }
             }
}
