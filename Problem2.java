import java.util.*;
public class Problem2{
    public static void main(String args[]){
        System.out.println("Hello world");

        //well in order to decide the range of an uppercase characters and lowercase characters we will be making use of logical and operator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
       char ch=sc.next().trim().charAt(0);
       if((ch=='a')&&(ch=='z')){
        System.out.println("Lowercase");
       }
       else{
        System.out.println("Uppercase");
       }
    }
}