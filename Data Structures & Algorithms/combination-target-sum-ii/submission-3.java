class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>>ans= new ArrayList<>();


        solve(candidates, target,ans, new ArrayList<>(),0 );
        return ans;
        
    }

    public void solve(int[] candidates, int target,  List<List<Integer>>ans, List<Integer>temp, int ind){

        

        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || ind>=candidates.length){
            return;
        }

          temp.add(candidates[ind]);
        solve(candidates, target-candidates[ind], ans, temp, ind+1);
        temp.remove(temp.size()-1);

        // Skip duplicates at the same recursion level
        while (ind + 1 < candidates.length &&
               candidates[ind + 1] == candidates[ind]) {
            ind++;
        }

         solve(candidates, target, ans, temp, ind+1);






    }
}
