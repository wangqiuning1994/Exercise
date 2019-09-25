package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n = 5;
        long[] nums = new long[]{1,2,3,4,70};

        java.util.Arrays.sort(nums);
        long re = 0;
        while(nums[n-1] >= n){
            long k = (nums[n-1]-nums[n-2])/(n+1);
            if(k>=1){
                nums[n-1] -= k*n;
                for(int i=0; i<n-1; i++){
                    nums[i] += k;
                }
                re += k;
            }else{
                nums[n-1] -= n;
                long temp = nums[n-1] - n;
                int loc = n-2;
                nums[n-1] = temp;
                while(loc >= 0 && nums[loc]+1 >= temp){
                    nums[loc+1] = nums[loc]+1;
                    nums[loc] = temp;
                    loc--;
                }
                for(int i=loc; i>=0; i--){
                    nums[i]++;
                }
                re++;
            }
        }
        System.out.println(re);
    }
}
