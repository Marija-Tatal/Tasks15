package Tasks;

public class Class16 {
    /*
    Create a method that will print whether given String is palindrome or not
    return type =void
    name= ispalindraome
    paramethers= String inputStr
    }
    {
    example dad= dad true
    abc=cba false
     */

   void isPalindraome(String str){

    StringBuilder st=new StringBuilder(str);
    st.reverse();
    String reversedStr=st.toString();
    if(str.equals(reversedStr)){
        System.out.println(str+" is palindrome");
    }else {
        System.out.println(str+"Not is palidndrome");
    }
   }

    public static void main(String[] args) {
       Class16 class16=new Class16();
       class16.isPalindraome ("Kaya");


    }
}
