import java.util.Scanner;
public class switch_condition {
       public static void main (String[] args)
       {
              //Switch case
              //Switch case is used to execute one out of multiple blocks of code
              // if break is not use the code will continue to execute the next block of code
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter the value of a: ");
              int a = sc.nextInt();
              switch(a)

              {
                     case 1: System.out.println("The value of a is 1");
                     break; //break is used to terminate the remaing switch statement
                     case 2: System.out.println("The value of a is 2");
                     break;
                     case 3: System.out.println("The value of a is 3");
                     break;
                     default: System.out.println("The value of a is not 1, 2 or 3");
              }




       }
}
