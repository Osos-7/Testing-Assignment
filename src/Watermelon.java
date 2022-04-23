import java.util.Scanner;
public class Watermelon
{
    public static void main(String[] args)
    {
        int w;
        Scanner input = new Scanner(System.in);
        w=input.nextInt();
        Watermelon melon=new Watermelon();
        melon.watermelonTest(w);
    }

    public String watermelonTest(int w)
    {
        if((w%2)==0 && w>2)
        {
            System.out.println("Yes");
            return "Yes";
        }
        else
        {
            System.out.println("No");
            return "No";
        }
    }
}