package frequently asked dsa;

import java.util.HashMap;


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> mp=new HashMap<>(); // initially mp is empty
        
        for(int i=0;i<nums.length;i++){ //loop through array
            int n=target-nums[i]; //find diff between target element and the values
            if(mp.containsKey(n)){ //check if n is present
                return new int[]{i,mp.get(n)}; //get the value 
            }
            mp.put(nums[i], i);//insert value if not present 
        }

        return new int[]{0,0};
    }
}
