public class C_Array {
    public static void main(String a[]){
        int nums [] = new int[4]; // Declaration and Instantiation
        
        for (int i=0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*100); //random will give float value between 0 and 1, we are multiplying it by 100 to get a value between 0 and 100, and then casting it to int to get an integer value.
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        //enchnanced for loop
        for(int num : nums){  // for each num in nums, print num
            System.out.println(num);
        }

        // jagged array
        int jagged [][] = new int[3][]; 
        jagged[0] = new int[2]; // first row has 2 columns
        jagged[1] = new int[3]; // second row has 3 columns
        jagged[2] = new int[4]; // third row has 4 columns

        for (int i=0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                jagged[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i=0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

    }
}
