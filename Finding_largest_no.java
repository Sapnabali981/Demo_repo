public class Finding_largest_no{
    public static void main(String args[]){
        System.out.println("Finding the largest number in an given array...");
        int max=0;
        System.out.println("creating three variables with certain values");
        /*
        considering one value as maximum value among three and comparing with remaining two variables one by one.
        */
       int a=10;
       int b=12;
       int c=18;
       max=a;//here a is 10 so assuming max=10
    if(max<b){//10<12 yes now max value is updated and max=12
        max=b;
    }
    if(max<c){//then again comparsion will happen max is 12<18 true again max value is updated.
        max=c;
    }

System.out.println("The largest number is:"+max);//thr largest number is 18
    }
}
