import java.util.Arrays;
import java.util.Scanner;
public class ArraysConceptDay2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ARRAY OF PRIMITIVES
        // int[] arr;
        // arr=new int[5];
        //user input array
        // for(int i=0;i<5;i++){
        //     arr[i]=sc.nextInt();
        // }
        //printing the array
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // printing array type2
        // for(int x:arr){
        //     System.out.println(x);
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[9]);
        //ArrayIndexOutOfBound as the size was 5 only and we are trying to print the 9th index
        
        //ARRAY OF STRING
        String[] arr;
        arr=new String[5];
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.next();
        }
        for(String x:arr){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(arr));


    }




}
