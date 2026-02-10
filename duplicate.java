public class duplicate {
    public static void main(String[] args) {
        // removing element in sorted array
        int[] arr={1,2,2,3,4,5};
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                index++;
                arr[index]=arr[i];

            }
        }
        for(int i=0;i<=index;i++){
            System.out.print(arr[i]);
        }
       
    }
}
