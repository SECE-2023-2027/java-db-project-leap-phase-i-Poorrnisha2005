import java.util.*;
public class program1 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str;
        str=in.nextLine();
        System.out.println("Enter your age: ");
        int age;
        age=in.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
            if(age>50)
            {
                System.out.println(str+" you are eligible to vote and your are a senior citizen");
            }      
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
}
