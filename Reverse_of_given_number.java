public class Reverse_of_given_number{
    public static void main(String args[]){
        System.out.println("while finding reverse of a certain number last digit is very important");
        /*
        in order to find the last digit of a given number basically we use modulus operator which fetch remainder part
        by doing modulus of 10 we can find the last digit of a certain number
        456 % 10 = 6 in this case 
        then value of 456 need to be reduced to 45 how can be do that we make use of divide operator and fetch the quiotent part
        456/10=45
        then we will find the last digit unless and until the value of n is equal to 0 once it is equal to 0 loop will get terminated
        */
       int n=7890;
       while(n!=0){
        int lastdigit=n%10;
        System.out.print(lastdigit);
        n=n/10;//we change the value of n in order to print other numbers. one by one once the value of n become 0 then loop will get terminated...
       }

    }
}