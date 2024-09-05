class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        /*HashSet<Character>jewel=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            jewel.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(jewel.contains(stones.charAt(i))) count++;
        }
        return count;*/

        int[] jewel=new int[58];
        int count=0;
        for(int i=0;i<jewels.length();i++) jewel[jewels.charAt(i)-'A']=1;
        for(int i=0;i<stones.length();i++){
            if(jewel[stones.charAt(i)-'A']==1) count++;
        }
        return count;
    }
}