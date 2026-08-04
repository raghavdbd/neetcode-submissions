class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        Arrays.sort(people);
        int count=0;

        while(j>=i){
            if(people[j]+people[i]<=limit){
                count++;
                i++;
                j--;
            }else if(people[j]+people[i]>limit){
                count++;
                j--;
            }

        }
        return count;
        
    }
}