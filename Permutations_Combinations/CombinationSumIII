
/*
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Note:

All numbers will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Example 2:

Input: k = 3, n = 9
Output: [[1,2,6], [1,3,5], [2,3,4]]
*/

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> list = new ArrayList<>();
    int nums[] = new int[10];
    for(int i = 1; i < nums.length; i++){
        nums[i] = i;
    }
    backtrack(list, new ArrayList<>(), nums, n, 1, k );
    return list;
    
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start, int k){
    //System.out.println("list is : " + tempList);
    if(remain < 0) return;
    else if(remain == 0 && tempList.size() == k) 
        list.add(new ArrayList<>(tempList));
    else{
        for(int i = start; i < nums.length; i++){
                //System.out.println("In for: " + list);
            //if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i + 1, k);
            tempList.remove(tempList.size() - 1); 
        }
     }
    } 
}
