
/*

Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/

class Solution {
    List<List<Integer>> masterList = new ArrayList<List<Integer>>();
    void backtrack(int start, List<Integer> list, int[] nums){
        masterList.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            backtrack(i+1, list,nums);
            list.remove(list.size()-1);
        }
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        backtrack(0,list,nums);
        return masterList;
        
    }
}
