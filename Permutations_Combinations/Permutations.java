/*
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/
class Solution {

    List<List<Integer>> masterList = new ArrayList<List<Integer>>();
    public void backtrack(int[] nums, List<Integer> list, boolean[] used){
        //System.out.println("List is : "+ list);
        if(list.size() == nums.length)
            masterList.add(new ArrayList<>(list));
       else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] ) continue;
                used[i] = true;
                list.add(nums[i]);
                backtrack(nums,list,used);
                used[i] = false;
                list.remove(list.size()-1);
            }
            
       }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums,list,used);
        return masterList;
        
    }
}
