import java.util.*;
public class IsPrime{
    public static void main(String args[]){
        System.out.println("Prime numbers are basically those numbers which are generally divisble by 1 and itself");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int div=2;//range of numbers begans from 2 and end till n-1 numbers we will be checking if within those number range some number divides the given numbers it means that given number is not a prime number
     while(n>div){
        if(n%div==0){
            System.out.println("Non prime number");
            }
        div=div+1;
        
     }
     System.out.println("Prime number");
    }
}