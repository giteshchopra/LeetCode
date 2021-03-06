
/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]

*/

class Solution {
    List<List<Integer>> masterList = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backtrack(candidates,list, target,0);
        return masterList;
    }
    public void backtrack(int[] candidates, List<Integer> list, int remaining, int start ){
        if(remaining < 0 )
            return;
        else if (remaining == 0){
            masterList.add( new ArrayList<>(list));
        }
        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1])
                    continue;
                list.add(candidates[i]);
                if(remaining - candidates[i] < 0 ){
                    list.remove(list.size()-1);
                    return;
                } 
                backtrack(candidates, list, remaining - candidates[i], i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
