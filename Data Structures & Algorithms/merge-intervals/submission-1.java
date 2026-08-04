class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]>temp =new ArrayList<>();


        for(int arr[]:intervals){
            if(temp.size()==0 || temp.get(temp.size()-1)[1]<arr[0]){
                temp.add(arr);
            }else{
              temp.get(temp.size()-1)[0]= Math.min(temp.get(temp.size()-1)[0],arr[0]);
               temp.get(temp.size()-1)[1]=Math.max(temp.get(temp.size()-1)[1],arr[1]);
           

            }


        }
        return temp.toArray(new int[temp.size()][]);
        
    }
}
