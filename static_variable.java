public class static_variable{
    static int x=10;
    
    public static void main(String args[]){
        System.out.println("static variable are basically used to make any class memeber as object independent..");
       x=20;//trying to update the value of x which is static in nature inside the main method..
    System.out.println(x);
    //calling printStaticVariablevalue method
    printStaticVariableValue();
/*
static memebers can be accessed throughout the program..
it has global access basically..
*/

    }
    //since this method is static in nature so we do not need any object in order to access it..
    public static void printStaticVariableValue(){
        System.out.println(x);//means here also the value of x is going to remain 20 means it has a global access
    }
    
}