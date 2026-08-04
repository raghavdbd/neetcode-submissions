class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans= new ArrayList<>();

        comb(candidates, target, 0, ans, new ArrayList<>());

        return ans;


        
    }

    public void comb(int arr[], int target, int ind,List<List<Integer>> ans, List<Integer>temp ){
        if(target<0){
            return;
        }

        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if( ind<arr.length && target>0){
            temp.add(arr[ind]);
            comb(arr,target-arr[ind],ind+1,ans,temp);
             temp.remove(temp.size()-1);
            while(ind<arr.length-1 && arr[ind]==arr[ind+1]){
                ind++;
            }
             comb(arr,target,ind+1,ans,temp);


        }





    }
}
