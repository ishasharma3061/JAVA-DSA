public class arrayProblems {
    public static void main(String[] args) {
        //REMOVE DUPLICATE IN SORTED ARRAY
        //output:1,2,3,4,5
        // approach:tow pointer
        int[] nums={1,2,2,3,4,5,5};
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[index]){     //i=1  2!=1                       ;i=2  2!=2              i=3  nums[3]=3!=2
                 index++;                  //index=1                        ; 2==2 , no change      ;index=2
                nums[index]=nums[i];      // nums[index]=num[1] nums[1]=2   ;                       ;nums[2]=num[i]=3     
                                            //1,2,3.....
               
            }
        }
        //printing the array
        /*
         We are printing only till 'index' because
        index stores the position of the last unique element.
        Elements after 'index' may contain duplicate/old values.

         */
        for(int i=0;i<=index;i++){
            System.out.print(nums[i]);
        }

}
    }
// -----------------------------------------------
//delete the particular element
public class arrayProblems{
    public static void main(String[] args) {
        // output:
       int[] nums={1,2,2,3,4,2,3};

       int k=2;    //number to remove
       int index=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=k){
            nums[index]=nums[i];
            index++;
        }
       }
        for(int i=0;i<=index;i++){
            System.out.print(nums[i]);
        }
      
    }
 }
// -----------------------------
 //MOVE ZERO AT THE END OF AN ARRAY
 public class arrayProblems{
    public static void main(String[] args) {
        //total number of 0's=3
        // output:1 3 12 0 0 0 
        int[] nums={1,0,3,0,12,0};
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){              //i=0 i!=0                                            ;i=1   0==0   ;i=2
                nums[index]=nums[i];     //0th index pe nums[i] yaani nums[0] means 1 krdo      ; no change  ; nums[1]=3
                index++;                  //index=1                                             ;index=1     ;index=2
                                          //1,3......
            }
        }
        //printing zero at the end
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
        //printing the array
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
 }
