// Description: Methods in Java
import java.util.Arrays;
public class methods {
       //Methods
       //Methods are a block of code that is executed when it is called. It is used to perform a specific task.
       public static void add(int a, int b)
       {
              int sum = a+b;
              System.out.println("The sum is: "+sum);
       }
       
       public static void array(int n)
       {
              int[] arr = new int[n];
              for (int i = 0; i<n; i++)
              {
                     arr[i] = i+1;
              }
              System.out.println("The array is: "+Arrays.toString(arr));
       }
       
       public static void main(String[] args)
       {
              //methods call
              add(10,20);
              array(5);
       }
}
