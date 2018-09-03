
/*
Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/

class Solution {
    List<List<Integer>> masterList = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        backtrack(0,nums,list);
        return masterList;
    }
    void backtrack(int start, int[] nums, List<Integer> list){
        masterList.add( new ArrayList<Integer>(list));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            backtrack(i+1,nums,list);
            list.remove(list.size()-1);     
        }
    }
}
