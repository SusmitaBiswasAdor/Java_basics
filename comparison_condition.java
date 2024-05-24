import java.util.Scanner;
public class comparison_condition {

       public static void main(String[] args )
       {
              //Comparison
              //Comparison Operators
              // ==, !=, >, <, >=, <=
              // conditional statements
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter the value of a: ");
              int a = sc.nextInt();
              System.out.print("Enter the value of b: ");
              int b = sc.nextInt();
              if (a==b)
              System.out.println("a is equal to b");
              else if (a>b)
              System.out.println("a is greater than b");
              else
              System.out.println("a is less than b");

              //Logical Operators
              // &&, ||, !
              // && is used for AND, || is used for OR, ! is used for NOT
              System.out.println("Enter the value of x:");
              int x = sc.nextInt();
              System.out.println("Enter the value of y:");
              int y = sc.nextInt();
              if (x>0 && y>0)
              System.out.println("The Values are both positive");
              else if (x>0 || y>0)
              {
                     if (x>0)
                     System.out.println("The value of x is positive");
                     else
                     System.out.println("The value of y is positive");


              }
              else
              System.out.println("The values are both negative");
              boolean GoodMood = false;
              if (!GoodMood)
              System.out.println("I am in a bad mood");
              else
              System.out.println("I am in a good mood");
              
              
       }
}
