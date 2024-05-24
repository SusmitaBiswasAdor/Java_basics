public class cons {
       //constants 
       // are declared using final keyword. It prevents the userto change a constant value

       public static void main(String[] args)
       {
              //The radius of a circle
              float radius = 5.5f;
              final float PI =3.1416f;  //This constant value cannot be changed
              float area =PI*radius*radius;
              System.out.println("The area of the circle is: "+ area);

       }
       
}
