package questions.Leetcode;

import java.util.*;

public class Test {
	static int[] twoSum(int[] nums, int target){
		int[] ans = new int[2];
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			int temp = target - nums[i];
			if(mp.containsKey(temp)){
				ans[0] = mp.get(temp);
				ans[1] = i;
				break;
			}
			else
				mp.put(nums[i], i);
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {2,15,11,7};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(ans[0]+" "+ans[1]);
        				
	}
}