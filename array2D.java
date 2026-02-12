import java.util.Scanner;
public class array2D {
    public static void main(String[] args) {
         //structure of 2D array
        //declaring a 2D array
        int[][] arr;
        //initialization
        int[][] arr=new int[1][3];   //1 row 3 columns
        //assigning values
        arr[0][0]=90;
        arr[0][1]=89;
        arr[0][2]=88;


        // -------------------------------
        int[][] nums={
            {1,2,3},
            {4,5,6}
        };

        int rows=nums.length;
        int cols=nums[0].length;

        //printing the array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }


// --------------------------------------------------
        //user input 2d array

       int[][] arr=new int[2][3];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print("enter the number:")
            arr[i][j]=sc.nextInt();
        }
       }

       //printing the array
       for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
// ------------------------------------QUESTIONS-------------------------------

public class array2D{
public static void main(String[] args) {

    // QUESTION1:SUM ALL ELEMENTS IN A 2D ARRAY
    //output=2+2+2+7+1+0=14

    int[][] nums={
        {2,2,2},
        {7,1,0}
    };

    int sum=0;
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            sum=sum+nums[i][j];
        }
    }

    //printing
    System.out.println("sum of all the elements in the array is: " + sum);


    // -----QUESTION2:SUM OF EACH ROW-----
    /*
    output 2+2+2=4 
    7+1+0=8
    0+0+0=0
    */

     int[][] nums={
        {2,2,2},
        {7,1,0},
        {0,0,0}
    };
    sum is taken 0 in the loop so that everytime for each row sum starts with 0
    for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum=sum+nums[i][j];
        }
        System.out.println(sum);
    }


// -----QUESTION3:SUM OF EACH COLUMN-----
/*
output=
2+7+0=9
2+1+0=3
2+0+0=2

 */ 

int[][] nums={
        {2,2,2},
        {7,1,0},
        {0,0,0}
    };
    for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=0;j<nums[i].length;j++){
            sum=sum+nums[j][i];
        }
        System.out.println("sum of "+ i+ "colum : "+ sum);
}


// -----QUESTION3:TRASNPOSE OF A MATRIX-----
/*
output:
2 7 0
2 1 0
2 0 0

 */
int[][] nums={
        {2,2,2},
        {7,1,0},
        {0,0,0}
    };
    int rows=nums.length;
    int cols=nums[0].length;
    int[][] transpose=new int[cols][rows];
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            transpose[j][i]=nums[i][j];
        }
    }
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }


// -----QUESTION4:MATRIX IS SYMMETRIC-----
// symmetric: matrix = transpose

int[][] nums={
        {2,2,2},
        {7,1,0},
        {0,0,0}
    };

int rows=nums.length;
int cols=nums[0].length;
int[][] transpose=new int[cols][rows];

for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        transpose[j][i]=nums[i][j];
    }
}

//if symmetric or not
boolean isSymmetric=true;
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        if(nums[i][j]!=transpose[i][j]){
        isSymmetric=false;
        break;
        }
    }
}
if (isSymmetric)
    System.out.println("Matrix is Symmetric");
else
    System.out.println("Matrix is NOT Symmetric");

}}