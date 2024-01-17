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
       swap(a,b);//here we are creating passing the copies of a and b not passing original variable so that's why once the method is executed swap will happen
       //after the completion of method the value of a and b is going to remain same..
       //in order to avoid this problem we will be creating an array and swapping the elements of it based on index value
       System.out.println(a);
       System.out.println(b);
       int a1[]={2,3,4,5};
       //here we will be swapping the array elements based on index value now here I want to swap the elements of index 2 with 3
       int i2=2;
       int i3=3;
       SwapArrayElements(a1,i2,i3);
       System.out.println(a1[2]);
       System.out.println(a1[3]);
       /*
    while swapping the array elements we are making changes in the original copy of array itself here 
    we are not creating any copies..
       */
    }
    public static void swap(int a,int b){
        int temp;//using temparory variable I'll be swapping the elements 
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void SwapArrayElements(int a[],int i1,int i2){
        int temp;
        temp=a[i1];
        a[i1]=a[i2];
        a[i2]=temp;
        System.out.println(a[i1]);
        System.out.println(a[i2]);
    }
}