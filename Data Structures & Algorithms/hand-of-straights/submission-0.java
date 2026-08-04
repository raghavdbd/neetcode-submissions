class Solution {
    public boolean isNStraightHand(int[] hand, int a) {

         if(hand.length%a !=0){
            return false;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int elem:hand) pq.add(elem);

        while(!pq.isEmpty()){
            int top=pq.poll();
            for(int i=1;i<a;i++){
                if(pq.contains(top+i)){
                    pq.remove(top+i);
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}
