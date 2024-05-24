import java.util.Arrays;
import java.util.Scanner;
public class loop_j {
       public static void main(String[] args)
       {
              //loops
              //loops are used to execute a block of code repeatedly
              //for loop
              //for loop is used to iterate a part of the program several times
              //for(initialization; condition; increment/decrement)
              int[] arr = new int[20];
              int[] arr1 = new int[20];
              for (int i=0; i<=15; i++)
              {
                     arr[i] = i+1;  //
              }
              System.out.println(("Using for loop: "+Arrays.toString(arr)));

              //while loop
              //while loop is used to iterate a part of the program several times
              //while(condition)
              int x = 0;
              while(x<=15)
              {
                     arr1[x] = x+1;
                     x++;

              }
              System.out.println("Using while: "+Arrays.toString(arr1));

              //do while loop
              //do while loop is used to iterate a part of the program several times
              int[] arr2 = new int[20];
              int k = 0;
              do{
                     arr2[k] = k+1;
                     
                     k++;
              } while (k<=15);
              System.out.println("Using do-while: "+Arrays.toString(arr2));


             //CREATING AN ARRAY OF 10 ELEMENTS AND ADDING 1 TO EACH ELEMENT USING FOR LOOP
             Scanner sc = new Scanner(System.in);
             int[] arr3 = new int[10]; //array of 10 elements
             for (int i=0; i<=9;i++)  //0 to 9
             {
              System.out.print("Enter the values of arr3["+i+"]:");
              int z = sc.nextInt();
              arr3[i] =z+1;
             }
              System.out.println("The array is: "+Arrays.toString(arr3));



       }
       
}
