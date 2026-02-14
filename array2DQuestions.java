public class array2DQuestions {
    public static void main(String[] args) {
//------------------------SUM OF ALL THE ELEMENTS IN A MATRIX--------------------

        // int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,0}
        // };

        // int rows=nums.length;
        // int cols=nums[0].length;
        // int sum=0;

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         sum=sum+nums[i][j];
        //     }    
        //  }
        //  System.out.println("sum is " + sum);  

// ------------------------------SUM OF EACH ROW'S ELEMENT------------------------

        //  int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,0}
        // };
        // int rows=nums.length;
        // int cols=nums[0].length;
        // for(int i=0;i<rows;i++){
        //     int sum=0;
        //     for(int j=0;j<cols;j++){
        //         sum=sum+nums[i][j];
        //     }
        //     System.out.println(sum);
        // }

// --------------------------------SUM OF EACH COLUMN'S ELEMENT------------------------

        //  int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,0}
        // };
        // int rows=nums.length;
        // int cols=nums[0].length;
        // for(int i=0;i<rows;i++){
        //     int sum=0;
        //     for(int j=0;j<cols;j++){
        //         sum=sum+nums[j][i];
        //     }
        //     System.out.println(sum); 
        // }

//------------------------------TRAANSPOSE OF A MATRIX-----------------------------

        //  int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,0}
        // };
        // int rows=nums.length;
        // int cols=nums[0].length;
        // int[][] transpose=new int[cols][rows];
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         transpose[j][i]=nums[i][j];
        //     }
        // }
        // //printing
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(transpose[i][j]+" ");
        //     }
        //     System.out.println();
        // }

// --------------------------------SYMMETRIC MATRIX------------- 
    //   int[][] nums={
    //     {10,20,30},
    //     {40,50,60},
    //     {80,0,0}
    //     };
    //     int rows=nums.length;
    //     int cols=nums[0].length;
    //     int[][] transpose=new int[cols][rows];
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<cols;j++){
    //             transpose[j][i]=nums[i][j];
    //         }
    //     }
        //checking
        // after checking the whole matrix then to tell symmm or not
        // boolean isSame=true;
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(transpose[i][j] != nums[i][j]){
        //             isSame=false;
        //             break;
        //         }
            
        //     }
        // }
        // if(isSame){
        //     System.out.println("yes symmetric");
        // }
        // else{
        //     System.out.println("not");
        // }

// -------------------Sum of main diagonal---------

        // int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,0}
        // };
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         if(i==j){
        //             sum=sum+nums[i][j];
        //         }
        //     }
        // }
        //  System.out.println(sum);
        
// -------------------ONLY main diagonal-------------

        // int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,90}
        // };
       
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         if(i==j){
        //             System.out.print(nums[i][j]);
        //         }
        //         else{
        //             System.out.print(" 0 ");
        //         }
        //     }
        //     System.out.println();
        // }

// --------------------MAIN NAD MINOR ELEMENTS----------------

        // int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,90}
        // };
       
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         if(i==j){
        //             System.out.print(nums[i][j]);
        //         }
        //         else if( i+j ==nums[0].length-1){
        //             System.out.print(nums[i][j]);
        //         }
        //         else{
        //             System.out.print(" 0 ");
        //         }
        //     }
        //     System.out.println();
        // }

// ----------------------SUM OF MAJOR AND MINOR DIAGONAL ELEMENTS-------------        
//10+50+90+30+80=260

        // int[][] nums={
        // {10,20,30},
        // {40,50,60},
        // {80,0,90}
        // };
        //   int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         if(i==j){
        //             sum=sum+nums[i][j];
        //         }
        //         else if(i+j == nums[i].length-1){
        //             sum=sum+nums[i][j];
        //         }
        //     }
        // }
        //  System.out.println(sum);
    

// --------------------SEARCH AN ELEMENT IN A MATRIX------------------------

    //    int[][] nums={
    //     {10,20,30},
    //     {40,50,60},
    //     {80,0,90}
    //     };
    //     int target=50;
    //     boolean isPresent=false;
    //      for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[i].length;j++){
    //             if(nums[i][j] == target ){
    //                 isPresent=true;
    //                 break;
    //             }
    //         }
    //         if(isPresent)break;    
    //      }
    //      if(isPresent){
    //         System.out.println("yes the target " + target + " is present ");
    //      }
    //      else{
    //         System.out.println("no not present");
    //      }

// ---------------------ADD TWO MATRICES-----------------

    // int[][] nums1={
    // {10,20,30},
    // {10,10,10},
    // {0,0,0}
    // };

    // int[][] nums2={
    //     {10,10,20},
    //     {9,9,9},
    //     {0,0,0}
    // };
    // int rows=nums1.length;
    // int cols=nums1[0].length;

    // int[][] nums3=new int[rows][cols];

    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         nums3[i][j]=nums1[i][j] + nums2[i][j];
    //     }
    // }
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<cols;j++){
    //         System.out.print(nums3[i][j]+ " ");
    //     }
    //     System.out.println();
    // }


// ------------------------COUNT ODD AND EVEN NUMBER-----------

        // int[][] nums={
        // {10,20,33},
        // {40,57,60},
        // {81,0,90}
        // };
        // int evenCount=0;
        // int oddCount=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         if(nums[i][j]%2==0){
        //             evenCount++;
        //         }
        //         if(nums[i][j]%2!=0){
        //             oddCount++;
        //         }
        //     }
        // }
        // System.out.println("total number of even " + evenCount);
        // System.out.println("total number of odd "+ oddCount);


// ------------------------ROW WITH MAXIMUM SUM----------------

    //    int[][] matrix = {
    //         {1, 0, 0},
    //         {0, 1, 0},
    //         {0, 0, 1}
    //        };

    //     boolean isIdentity = true;

    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix.length; j++) {

    //         if (i == j && matrix[i][j] != 1)
    //         isIdentity = false;

    //         if (i != j && matrix[i][j] != 0)
    //         isIdentity = false;
    //         }
    //     }

    //     if (isIdentity)
    //     System.out.println("Identity Matrix");
    //     else
    //     System.out.println("Not Identity Matrix");

































    }
}
