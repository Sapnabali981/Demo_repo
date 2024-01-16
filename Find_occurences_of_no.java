import java.util.*;
public class Find_occurences_of_no{
    public static void main(String args[]){
        System.out.println("find the last digit then compare it with number whose occurences you want to find");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose Occurences you want to find");
        int n=sc.nextInt();
        int num=18902322;
        int count=0;
        while(num>0){
            int lastdigit=num%10;
            if(lastdigit==n){
                count++;
            }
            num=num/10;
        }
        System.out.println("The occurences of given number is:"+count);
    }
}