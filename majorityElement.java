class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>count=new HashMap<>();
       for(int a:nums){
         count.put(a,count.getOrDefault(a,0)+1);
       }
       int max=nums[0];
       for(int key:count.keySet()){
        if(count.get(key)>count.get(max)){
            max=key;
        }
       }
        return max;
    }
}