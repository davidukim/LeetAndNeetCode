package MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement{
    public int majorityElement(int[] nums){
        HashMap<Integer, Integer> occurence = new HashMap<>();
        for (int i = 0 ; i < nums.length; i ++){
            occurence.put(nums[i], occurence.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurence.entrySet()){
            if (entry.getValue() > nums.length/2) return entry.getKey();
        }

        return -1;
    }
}