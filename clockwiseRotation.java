public class clockwiseRotation {
    public static void main(String[] args) {
// -------------------TRANSPOSE of a matrix---------------
/* output 
1 4 7  
2 5 8  
3 6 9  
 */

        int[][] nums={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int rows=nums.length;
        int cols=nums[0].length;
        int[][] transpose=new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[i][j]=nums[j][i];
            }
        }

        //printing the matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println(" ");
        }


// ------------------CLOCKWISE ROTATION OF A MATRIX---------------
//approach---> transpose, reverse

        int[][] nums={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int rows=nums.length;
        int cols=nums[0].length;
        int[][] transpose=new int[cols][rows];

        //finding the transpose
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[i][j]=nums[j][i];
            }
        }
        //now transpose matrix will have 1 4 7, 2 5 6, 3 6 9
        //reverse will be done in transpose matrix

        // row reverse
        for(int i=0;i<rows;i++){
                int start=0;
                int end=cols-1;
                while(start<end){
                   int temp=transpose[i][start];
                   transpose[i][start]=transpose[i][end];
                   transpose[i][end]=temp;
                   start++;
                   end--; 
                } 
        }

        //printing clockwise rotated matrix
        System.out.println("clockwise rotated matrix");
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println(" ");
        }


// ---------------------------ANTICLOCKWISE ROTATION OF A MATRIX--------------------------------
//approach---> transpose then column reverse
/*
3 6 9
2 5 8
1 4 7
 */
       int[][] nums={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int rows=nums.length;
        int cols=nums[0].length;
        int[][] transpose=new int[cols][rows];

        //printing actual matrix
        System.out.println("given matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println(" ");
        }


        //finding the transpose
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[i][j]=nums[j][i];
            }
        }

        //printing the transpose
        System.out.println("transpose matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
        //colum reverse
        for(int i=0;i<rows;i++){
                int start=0;
                int end=rows-1;
                while(start<end){
                    int temp=transpose[start][i];
                    transpose[start][i]=transpose[end][i];
                    transpose[end][i]=temp;
                    start++;
                    end--;
                }
            }
        

        //printing the anticlockwise rotated matrix
        System.out.println("anti-clock wise rotated matrix");
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println(" ");
        }





    }
}
