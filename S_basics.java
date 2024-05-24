//strings are immutable in java

class MyString {

       //concatinate
       public static void main(String[] args)
       {
              String first_name = "Susmita";
              String last_name = "Biswas";
              String full_name = first_name + " " + last_name;
              System.out.println(full_name);
              System.out.println(first_name.concat(" ").concat(last_name));
              //slicng
              System.out.println(first_name.charAt(5)); //Java is 0 based index Language
              //length
              System.out.println(first_name.length());
              //replace format: replace(oldChar,newChar)
              System.out.println(first_name.replace('S','s'));
              //substring format: substring(startIndex,endIndex)  It will return a substring starting from the start to the end index-1.
              System.out.println(first_name.substring(0,3));
              //toLowerCase and toUpperCase 
              System.out.println(first_name.toLowerCase());
              System.out.println(first_name.toUpperCase());
       }

       
}
