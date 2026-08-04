class Solution {
    public int search(int[] nums, int target) {

        int pivit_ind=0;
        int n=nums.length;


        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            int right= (mid+1)%n;
            int left= (mid-1+n)%n;

            if(nums[mid]>nums[left] && nums[mid]>nums[right]){
                pivit_ind= mid;
                break;
            }else if(nums[mid]>nums[nums.length-1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(nums[pivit_ind]==target){
            return pivit_ind;
        }

        int left= Bs(nums, 0,pivit_ind, target );
        int right= Bs(nums, pivit_ind+1, nums.length-1, target);
        if(left==-1 && right ==-1){
            return -1;
        }
        if(left!=-1){
            return left;
        }else{
            return right;
        }
        
    }

    public int Bs(int nums[], int start, int end, int target){

        while(end>=start){
            int mid= (start+end)/2;
        
        if(nums[mid]>target){
            end=mid-1;
        }else if(nums[mid]==target){
            return mid;
        }else{
            start=mid+1;
        }
    }
    return -1;
}
}
