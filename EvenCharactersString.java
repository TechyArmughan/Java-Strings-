//To print the strings with even number of characters.
import java.util.Scanner;
public class EvenCharactersString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Strings :");
        String str[] = new String[10];
        int i;
        for(i = 0 ; i<10;i++)
        {
            str[i] = sc.nextLine();
        }
        System.out.println("The strings with even number of characters are:");
        for(i=0;i<10;i++)
        {
            if(str[i].length() % 2 == 0)
            {
                System.out.println(str[i]);
            }
        }
    }
}
