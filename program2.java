import java.util.*;
public class program2 {
    public static void main(String args[])
    {
        int a=1,r=5;
        for(int i=1;i<=5;i++)
        {
            a=i;
           for(int j=i;j<=r;j++)
           {
              System.out.print(a);
              a++;
           }
           r++;
           System.out.println();
        }
        
    }
}
