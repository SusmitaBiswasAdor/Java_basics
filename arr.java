import java.util.Arrays;
public class arr {
       public static void main(String[] args) 

       {
              //The methods describing the array is called here
              
              //Array Declaration
              //format datatype[] array_name = new data_type[size];   array is a non primitive data_type so we use new keyword to create an array
              
              int[] marks = new int[5];  
              marks[0] =97;
              marks[1] = 98;
              marks[2] = 99;
              marks[3] = 100;
              // marks[4] = 101;
              //-----if we already know the values of the array we can declare it as follows-----
              //-----int[] marks = {97,98,99,100,101}; //this is called array initialization-----

              System.out.println("1st index: "+ marks[0]);
              System.out.println("4th index has a null or 0 value: "+ marks[4]);

              /*-----Array Initialization: if we don intialize a value the array will auto initialise 
              *the value to null or according to the data type-----**/

              //example::
              boolean[] arr1 = new boolean[3];
              arr1[1] = true;
              System.out.println("The default value: "+arr1[0]); //the default value is false

              String[] str = new String[3];
              System.out.println("The dafault value: "+ str[0]); //the default value is null

               //arrays have properties. So it does not need paranthesis()
               //length property
              System.out.println("The length of the array: "+ marks.length);
              //sort
              // there is a .sort function in arrays class that sorts the array in ascending order
              System.out.println("Before sorting: "+ Arrays.toString(marks));
              Arrays.sort(marks);  //import java.util.Arrays; as 'Array' is a class in java.util package
              System.out.println("After sorting: "+ Arrays.toString(marks)); //ascending order
              //descending order we need loops that will be on the loops .java file

              twoDArray(); //the method is called here
       
      }

       //----2D Array Declaration:----
       //format datatype[][] array_name = new data_type[row][column];   
       public static void twoDArray()

       {
              System.out.println("----------------2D Array Declaration----------------- ");
              // int[][] final_marks = {{97,98,99},{99,91,80}};
              int[][] final_marks = new int[2][3];

              final_marks[0][0] = 97;
              final_marks[0][1] = 98;
              final_marks[0][2] = 99;

              final_marks[1][0] = 99;
              final_marks[1][1] = 91;
              final_marks[1][2] = 80;
              System.out.println("The 2D array: "+ Arrays.deepToString(final_marks)); //for 2D arrays
              System.out.println("1st index: "+ final_marks[0][0]);
              System.out.println("2nd index: "+ final_marks[1][1]);
              System.out.println("The length of the array: "+ final_marks.length);
              System.out.println("The length of the array: "+ final_marks[0].length);
       }  
      }
       //----some notes---
       //Array is a collection of similar data types
       //Array is a non-primitive data type
       //Array is a fixed size data structure
       //.length is a property of an array

       //-----Arrays class in Java-----
       //Arrays.sort() is a method of the Arrays class
       //Arrays.toString() is a method of the Arrays class that returns a string representation of the array
       //Arrays.fill() is a method of the Arrays class that fills the array with the specified value
       //Arrays.copyOf() is a method of the Arrays class that copies the specified array
       //Arrays.copyOfRange() is a method of the Arrays class that copies the specified range of the array
       //Arrays.equals() is a method of the Arrays class that compares two arrays
       //Arrays.binarySearch() is a method of the Arrays class that searches for an element in the array
       //Arrays.asList() is a method of the Arrays class that returns a list view of the array***
       //Arrays.deepToString() is a method of the Arrays class that returns a string representation of the array


