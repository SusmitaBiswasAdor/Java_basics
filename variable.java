// Code to understand the variables in Java


// variables are two types
// 1. Primitive data types
// 2. Reference data types / Non-primitive data types

// Primitive data types
// Data type	       Size	       Description
// byte	            1 byte	  Stores whole numbers from -128 to 127
// short	          2 bytes	  Stores whole numbers from -32,768 to 32,767
// int	            4 bytes	  Stores whole numbers from  [-2,147,483,648, 2,147,483,647]
// long	            8 bytes	  Stores whole numbers from  [-9,223,372,036,854,775,808, 9,223,372,036,854,775,807]
// double	          8 bytes	  Stores fractional numbers. Sufficient for storing 15 decimal digits
// float	          4 bytes	  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// boolean	        1 bit	    Stores true or false values
// char	            2 bytes	  Stores a single character/letter or ASCII values

// Reference data types / Non-primitive data types
// Data type	Size	Description
// String	-	Stores a sequence of characters

/*Non primitive data types have their 
* own methods and types that primitive data types do not have. Also primitive types have fixed size that but no primitive doesnt have that.**/
//----------------------------------------------------------------
class variable {
    public static void main(String[] args) {
        // Declare a variable
        // Syntax: dataType variableName = value;
        primitiveDataTypes();
        nonPrimitiveDataTypes();  //the method is called here
              int a = 5;
              String b = "Hello, World!";
              double c = 5.5;
              boolean d = true;
              char e = 'A';
              char f = e;
              System.out.println(a);
              System.out.println(b);
              System.out.println(c);
              System.out.println(d);
              System.out.println(e);
              System.out.println(f);
              System.out.println(b.length());
              
    }
     public static void primitiveDataTypes() { //the method is declared here
       // Print the variable
              
       // Declare a variable
       // Syntax: dataType variableName = value;
       byte age = 40;
       short year = 2024;
       int salary = 8000;
       int phoneNumber =1234567890;
       float height = 5.5f;
       System.out.println(age);
       System.out.println(year);
       System.out.println(salary);
       System.out.println(phoneNumber);
       System.out.println(height);
     }

     public static void nonPrimitiveDataTypes() { //the method is declared here
       String name = "Susmita";
       String name1 = new String("Biswas");
       System.out.println(name);
       System.out.println(name1);
     }



        
}







