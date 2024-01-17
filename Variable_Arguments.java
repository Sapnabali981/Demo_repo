public class Variable_Arguments{
    public static void main(String args[]){
        /*
    variable arguments is a concept which we generally use while making function/method calling
    while doing method calling we will be passing certain values right as a parameter right and a certain methos will be accepting it as arguments
    if are passing multiple values to a method then we need a variable arguments which will accept all values in one go..
        */
       VariableArguments(2,3,4,5);
       /*
       this variable arguments can be used along with normal variables as well
       */
      fun(10,20,1,2,3,4,5);

    }
    static void VariableArguments(int ...v){
        System.out.println(v);//here v is an array which is basically certain values of type integer
        System.out.println(v[0]);
    }
    static void fun(int a,int b,int ...v){
        System.out.println(a + " " + b + " " + v[0] + " " +  v[1]);
    }
}