class Solution {
    public int[] twoSum(int[] nums, int target) {
      
       HashMap<Integer,Integer>compliments=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            
            int compliment=target-nums[i];
            
            if(compliments.containsKey(compliment)){
               res[0]=i;
                res[1]=compliments.get(compliment);
                break;
            }
            compliments.put(nums[i],i);
        }
        return res;
        
    }
}