import java.util.*;
public class case_checking_alpabhet{
    public static void main(String args[]){
        System.out.println("Case checking programs of alphabhet is basically done with the help of Ascii value");
        //creating a character variable
        char ch='j';
        System.out.println((int)ch);
        //basically the ascii value of small j is 106 
        //then what will be ascii value of small i
        char t='i';
        System.out.println((int)t);
        /*
        so now If I want to check the whether the user entered character value is a lowercase or it is in uppercase the
        that specific checking will be done based on ascii value right..
*/
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the character");
   char s=sc.next().trim().charAt(0);
   /*
        here I'm trying to take input in form of integer from user then converting it into char by typecasting can we do that
        but My question is I will be taking character as input then checking it's case..
        for taking a character input we do not have prdefined method
        so instead we can make use of next function 
        next function is basically used to accept only string value so we cannot store it inside a character type variable
        trim a string and fetch the character value from the string which is present at index 0 for 
        doing that we will make use of charAT function
        okay now once we successfully taken a character input from user
        then we have to check the case
        make use of conditional statements
the value of s ranges between 97 to 122 then it is a lowercase (a to z) otherwise it is a uppercase which basically ranges from 65 to 90 (A TO Z)
   */
   System.out.println(s);
   if(s>=97 && s<=122){
    System.out.println("lower case");
    }
    else
        if(s>=65 && s<=90){
            System.out.println("upper case");
        }
    
    else{
        System.out.println("Special symbols");
    }
}}
