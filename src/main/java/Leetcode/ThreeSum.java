package Leetcode;

import java.util.*;

/**
 * @ClassName:三数之和
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/11/20 7:08 AM
 * @Version:1.0
 **/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int length = nums.length;
        for(int i = 0;i < length;i++) {
            for (int j = i + 1; j < length; j++) {
                for (int p = j + 1; p < length; p++) {
                    List<Integer> list = new ArrayList<Integer>();
                    if (nums[i] + nums[j] + nums[p] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[p]);
                        Collections.sort(list);
                        if(ans.contains(list) == true){
                            continue;
                        }
                        ans.add(list);
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
