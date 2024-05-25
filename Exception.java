public class Exception {
       //Exception Handling
       //Exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions
       //Exception handling is a mechanism to handle runtime errors
       //try, catch, finally, throw, throws

       //example 1: TRY
       //supoose a=1, b=0 and we want a/b which is not possible. this will throw an exception and the codes that
       //come after this will not be executed. To handle this we use try and catch block.  
       public static void main(String[] args)
       {
              int a = 1;
              int b = 0;
              try
              {
                     int c = a/b;
                     System.out.println("The value of c = "+c);
              }
              catch ( ArithmeticException e)
              {
                      //this block will only be executed if an exception occurs
              }
                  
              System.out.println("This will not be printed");


             

              //array index out of bounds exception
              //example 2: CATCH
                     int[] arr = {1,2,3,4};
                     try
                     {
                            System.out.println(arr[4]);
                     }
                     catch (ArrayIndexOutOfBoundsException e)
                     {
                            System.out.println("The index is out of bounds");
                     }
                     System.out.println("This is how exception handling is done in java");

              
              }
       }
       //Catch block
       //catch(Exception e) is used to catch the exception and handle it. The exception is stored in the variable e
       //for integer division by zero, the exception is ArithmeticException
