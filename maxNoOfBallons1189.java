class Solution {
    public int maxNumberOfBalloons(String text) {
      HashMap<Character,Integer>ballons=new HashMap<>();
      String str="balon";
      for(char ch:str.toCharArray()){
        ballons.put(ch,0);
      }
      for(int i=0;i<text.length();i++){
        char ch=text.charAt(i);
        if(ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n'){
        
        ballons.put(ch,ballons.get(ch)+1);
        }
      }  
      ballons.put('l',ballons.get('l')/2);
      ballons.put('o',ballons.get('o')/2);

      Set<Character>keys=ballons.keySet();
      int min=Integer.MAX_VALUE;
      for(char key:keys){
        if(ballons.get(key)<min){
            min=ballons.get(key);
        }
      }
      return min;
      }
      
    }
