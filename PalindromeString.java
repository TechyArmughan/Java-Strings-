import java.util.Scanner;
public class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine().toUpperCase();
        String rev = "";
        int i;
        for(i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println(str +" is a Palindrome String");
        }
        else
        {
            System.out.println(str+" is not a Palindrome String");
        }
    }
}
