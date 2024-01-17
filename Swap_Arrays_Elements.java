public class Swap_Arrays_Elements{
    public static void main(String args[]){
        /*
        while swaping normal variable values with each other using a method we are not somewhere manipulating with original variables
        here we are swaping the values of copies of a variables because java do not support pass by reference
        insteac it supports pass by values
        */
       int a=12;
       int b=13;
       //creating a swap method which can swap the values of a and b for me..
       swap(a,b);
       System.out.println(a);
       System.out.println(b);
    }
    public static void swap(int a,int b){
        int temp;//using temparory variable I'll be swapping the elements 
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}