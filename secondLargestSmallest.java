
public class secondLargestSmallest {
   public static void main(String[] args) {
   int[] arr={3,4,7,9,5};
   /*
   largest=9
   second largest=7
   smallest=3
   second smallest=4
    */
    int smallest=Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      //smallest and second smallest
      if(arr[i]<smallest){              //3<1001      4<3
       secondSmallest=smallest;         //ss=1001     no change
       smallest=arr[i];                 //s=3          no change
      }
      else if(arr[i]>smallest && arr[i]<secondSmallest){
         secondSmallest=arr[i];
      }

      //largest
      if(arr[i]>largest){
         secondLargest=largest;
         largest=arr[i];
      }
      else if(arr[i]<largest && arr[i]>secondLargest){
         secondLargest=arr[i];
      }
  }
  System.out.println("largest number is "+ largest);
  System.out.println("second largest number is: "+ secondLargest);
  System.out.println("smallest number is: "+ smallest);
  System.out.println("second smallest number is "+ secondSmallest);
   } 
}

