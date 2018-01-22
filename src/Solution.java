import java.util.ArrayList;

public class Solution {
	public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
        	int idx = Math.abs(nums[i]) - 1;
        	if(nums[idx] < 0)
        		res.add(idx + 1);
        	nums[idx] = -nums[idx];
        }
        
        return res;
    }
}
