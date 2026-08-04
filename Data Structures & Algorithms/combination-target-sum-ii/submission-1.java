class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        HashSet<List<Integer>>h1=new HashSet<>();
        solve(candidates, target,0,h1,new ArrayList<>());
       List<List<Integer>>ans=new ArrayList<>();
        for (List<Integer> i : h1){
            ans.add(i);


        } 
        return ans;
        
        
    }


    public void solve(int arr[],int target,int ind,HashSet<List<Integer>>h1, List<Integer>l1){

        if(target==0){
            h1.add(new ArrayList<>(l1));
            return;
            
        }
        if(ind>=arr.length || target<0){
            return ;
        }
        l1.add(arr[ind]);
        solve(arr,target-arr[ind],ind+1,h1,l1);
        l1.remove(l1.size()-1);
         solve(arr,target,ind+1,h1,l1);
         return;

    }
}
