
/*
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example:

Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/

class Solution {
    List<List<Integer>> masterList = new ArrayList<List<Integer>>();
    public void backtrack(List<Integer> list, int[] nums, boolean[] used){
          if(list.size() == nums.length)
            masterList.add(new ArrayList<>(list));
       else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1] ) continue;
                used[i] = true;
                list.add(nums[i]);
                backtrack(list,nums,used);
                used[i] = false;
                list.remove(list.size()-1);
            }
            
       }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        //Arrays.sort(nums);
        backtrack(list,nums,used);
        return masterList;
    }
}
