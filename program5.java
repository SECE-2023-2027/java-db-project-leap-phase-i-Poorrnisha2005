import java.util.List;
import java.util.ArrayList;
public class program5 {
    public static void main(String args[])
    {
        int count=0,j;
        List<Integer> li=new ArrayList<>();
        li.add(3);
        li.add(48);
        li.add(3);
        li.add(66);
        li.add(66);
        int l=li.size();
        for(int i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(li.get(i)==li.get(j))
            {
                count++;
            }
            } 
        }
        System.out.println(count);
    }
}
