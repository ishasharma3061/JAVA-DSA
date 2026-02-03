import java.util.Scanner;
public class arrayBasics {
    public static void main(String[] args) {
      //syntax
      /* datatype[] name=new datatype[];
      or
    datatype[] name={};
    */ 
   /*
   int[] arr;  // declaration,stack , compile time
   arr=new Int[5];   // initialisation  , heap,runtime
    */
      int[] arr=new int[5];
      Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
     }
      //printing the array
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
// -------------
      /*
      if we do not assign any value to the aray,
       by default for array, it woukd be zero */
       int[] arr2;
       arr2=new int[5];
       System.out.println(arr2[1]);   //output=0 

       String[] arr3;
       arr3=new String[5];
       System.out.println(arr3[2]);    //output=null

    }
}
