public class Maximum_element_in_an_Array{
    public static void main(String args[]){
        System.out.println("Assuming element present at index 0 is the maximum element in an array..");
        //creating 1d array
        int a[]={1,2,3,4,5,6};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The maximum element in an given array is:"+max);
    }
}