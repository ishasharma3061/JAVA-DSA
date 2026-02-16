public class spiral {
    public static void main(String[] args) {

// ------------------SPIRAL MATRIX----------        
    //     int[][] nums={
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9}
    //     };


    //     int top=0;
    //     int  left=0;
    //     int bottom=nums.length-1;
    //     int right=nums[0].length-1;

    //   while(top<=bottom && left<=right){
    //     //to print top row
    //   // j cuz, j denotes the colum

    //   for(int j=left;j<=right;j++){
    //     System.out.print(nums[top][j] + " ");
    //   }
    //   top++;

    //   //to print top to bottom colum, right colum
    //   for(int i=top;i<=bottom;i++){
    //     System.out.print(nums[i][right] + " ");
    //   }
    //   right--;

    //   //to print bottom row
    //   if(top<=bottom){
    //     for(int j=right;j>=left;j--){
    //         System.out.print(nums[bottom][j] + " ");
    //     }
    //     bottom--;
    //   }

    //   // to print bottom to top, left colum
    //   if(left<=right){
    //     for(int i=bottom;i>=top;i--){
    //         System.out.print(nums[i][left] + " ");
    //     }
    //     left++;
    //   }

    // }

// ------------------ BOUNDARY ELEMENTS---------------
        int[][] nums={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        //top row
        for(int j=0;j<nums[0].length;j++){
            System.out.print(nums[0][j] + " ");
        }

        //right colum
        for(int i=1;i<nums.length;i++ ){
            System.out.print(nums[i][nums[0].length-1] + " ");
        }

        //bottom row
        for(int j=nums[0].length-2;j>=0;j--){
            System.out.print(nums[nums.length-1][j] + " ");
        }

        //left colum
        for(int i=nums.length-2;i>0;i--){
            System.out.print(nums[i][0]+ " ");
        }






} }