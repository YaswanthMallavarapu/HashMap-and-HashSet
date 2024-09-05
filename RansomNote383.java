class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int map[]=new int[26];
        int m=magazine.length();
        int r=ransomNote.length();
        for(int i=0;i<m;i++){
            char ch=magazine.charAt(i);
            int idx=ch-'a';
            map[idx]++;
        }
        
        for(int i=0;i<r;i++){
            char ch=ransomNote.charAt(i);
            int idx=ch-'a';
            if(map[idx]==0)
                return false;
            else
                map[idx]--;
        }
       return true;    

      

    }
}