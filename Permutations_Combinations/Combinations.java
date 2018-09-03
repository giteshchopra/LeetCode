
/*
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

Example:

Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
*/

class Solution {
    List<List<Integer>> masterList = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        combinations( n,  k, new ArrayList<>(), 1 );
        return masterList;
    }
    public void combinations(int n, int k, List<Integer> list ,int start){
        //System.out.println(" list is : " + list);
        if(list.size() == k){
            masterList.add(new ArrayList<Integer>(list));
            return;
        }
        else{
            for(int i = start; i <=n; i++){
                list.add(i);
                combinations(n,k,list, i+1);
                list.remove(list.size()-1);
            }
        }
        
            
    }
}
