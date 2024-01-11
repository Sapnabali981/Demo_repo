public class Problem1{
    public static void main(String args[]){
        System.out.println("Hello");
        //in order to find the largest no we can use 2 methods so now I'll be making use of more optimized method for solving the problem.
        int max=0;
        int a=101;
        int b=1900;
        int c=18;
        //assuming max/largest element is a so I'll be comparing max element will b and c and accordingly i'll be deciding the largest element among 3
        max=a;
        if(max<b){
            max=b;//if this is case then max value is updated to b.
        }
        if(max<c){
            max=c;
            //if this is case then max value will be updated
        }
    System.out.println("The largest element in an array is:"+(max));

    }
}