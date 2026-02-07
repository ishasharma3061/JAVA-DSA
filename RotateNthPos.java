import java.util.Arrays;
import java.util.Scanner;
public class RotateNthPos {
    public static void main(String[] args) {
//    QUESTION1:rotate an array to the right by k positions.
//    APPROACH: Reverse
int[] arr={6,7,8,9,10};
int k=2;
int n=arr.length;
k=k%n; // rotating an array multiple times gives the same output, so % gives actual rotation effect
reverse(arr,0,n-1);   // this will reverse while array
reverse(arr,0,k-1);   // reverse only 0th index
reverse(arr,k,n-1);          //reverse from kth till last index
System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}


//USER INPUT ARRAY, POSITION
public class RotateNthPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int[] arr=new int[7];
//array input
System.out.println("enter the numbers in the array:");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
System.out.println("enter the kth number");
int k=sc.nextInt();
int n=arr.length;
k=k%n;
reverse(arr,0,n-1);
reverse(arr,0,k-1);
reverse(arr,k,n-1 );
System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
