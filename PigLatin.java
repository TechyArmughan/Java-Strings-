//Made By Armughan Khan
import java.util.*;
class NewPigLatin
  {
    public static void main(String args[])
    {
      //Creating Scanner object
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Word :");
      //Storing the enteredv string in the variable word
      String word = sc.nextLine().toUpperCase();
      //extrating characters from the entered string
      int i;
      for(i = 0;i<word.length();i++)
        {
          char v = word.charAt(i);
          if(v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U')
          break;
        }
      String f = word.substring(i) + word.substring(0,i) + "AY" ;
      System.out.println(f);

    }
  }
