import java.util.Scanner;
public class in {
       //input
       //The Scanner class is used to get user input, and it is found in the java.util package.
       //To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
       public static void main(String[] args)
       {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter a number: ");
              int num = sc.nextInt(); 
              float f = sc.nextFloat();  //two inputs are taken here one is integer and the other is float
              String str = sc.next();  //this is a string input for single word
              String str1 = sc.nextLine(); //this is a string input for multiple words        
              int s = (int)Math.sqrt(num);
              int p =(int) Math.pow(num,2);
              System.out.println("The number entered is: "+num);
              System.out.println("The square root of the number is: "+s);
              System.out.println("The power of the number is: "+p);
              System.out.println("The float value entered is: "+f);
              System.out.println("The string entered is: "+str);
              System.out.println("The string entered is: "+str1);
       }
}
