public class factorial_a_given_no{
    public static void main(String args[]){
        /*
        factors of a given number means for example number is 18 find all those numbers which divides 18
        divide 18 means after dividing 18 remainder should be 0
        okay if remainder as to be 0 then I need to make use of modulus operator.
        what will be the mimimum factor 1
        what will be the maximum factor number itself right
        so once while loop will be used here once value of fact execeeds the n then loop terminated automatically

        */
       int n=11;
       int fact=1;
       int count=0;
       //10>1 true 10%1 == 0 then 1 will be printed the value of i will be incremented to 2
       //10>2 true 10%2 == 0 then 2 will be printed the value of i will be incremented to 3
       //10>3 true 10%3== 0 no then value is incremented to 4
       //similary once value of i is 11 then fact is not less than n so loop gets terminated..
       while(n>=fact){
        if(n%fact==0){
            //System.out.print(fact + " ");
            count++;
        }
        fact++;
       }
       System.out.println(count);
       /*
       what are prime numbers 
       numbers which are only divisible by one and itself
       means there factors has to be 2 right that 1 and itself
       if count of factors is 2 then can we conclude that given number is a prime number..
       yes we can do
       */
      if(count==2){
        System.out.println("Prime number");
      }
      else{
        System.out.println("composite numbers");
      }
    }
}