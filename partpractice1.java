package githubpractice2;
import java.util.Scanner;

public class partpractice1
{
    public static void main(String args[])
    {
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        o.nextLine();
        String name = o.nextLine();
        for(int i=0; i<=a; i++)
        {
            System.out.println(i);
        }
        for(int i=1;i<a;i++)
        {
            System.out.println(name);
        }
    

    }
   


}