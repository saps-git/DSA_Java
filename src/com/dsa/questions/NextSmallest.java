import java.io.*;
import java.util.*;

public class NextSmallest {
    public static int[] nextSmallest(int[] nums){
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!st.empty() && nums[st.peek()] > nums[i]){
                ans[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,8,5,2,22};
        int[] ans = nextSmallest(nums);
        for(int i: ans)
            System.out.print(i+" ");
        System.out.println();
        
    }
}
