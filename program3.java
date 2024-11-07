import java.util.*;
public class program3 {
    public static void main(String args[])
    {
        int ipin=9999;
        int pin;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your pin:");
        pin=in.nextInt();
        int amount=1000;
        if(pin==ipin)
        {
            while(true){
                System.out.println("1.BALANCE \n 2.WITHDRAWL \n 3.DEPOSIT \n 4.EXIT");
                int ch;
                System.out.println("Enter your choice: ");
                ch=in.nextInt();
                switch(ch)
                {
                    case 1: 
                         amount1();
                         break;
                    case 2:
                         withdrawl(in);
                         break;
                    case 3:
                          deposit(in);
                          break;
                    case 4:
                         System.exit(0);
                         break;
                    default:
                          System.out.println("Re-Enter your choice: ");     
                }
            }
        }
    }
            public static void amount1()
            {
                System.out.println("Your Current Balance is: "+ amount);
            }
            public static void withdrawl(Scanner in)
            {
                  System.out.println("Enter the Amount to be withdrawn: ");
                  int with=in.nextInt();
                  if(with>amount)
                  {
                    System.out.println("Insufficient Balance:");
                  }
                  else{
                    amount=amount-with;
                    System.out.println("Your current balance : "+amount);
                  }
            }
            public void deposit(Scanner in)
            {
                  System.out.println("Enter the Amount to be deposited: ");
                  int dep=in.nextInt();
                    amount=amount+dep;
                    System.out.println("Your current balance : "+amount);
             }
         }
