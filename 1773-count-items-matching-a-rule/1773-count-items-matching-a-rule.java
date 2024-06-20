class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0,key=0; 
        if(ruleKey.equals("type")){ 
            key=0;
        } 
        else if(ruleKey.equals("color")){ 
            key=1;
        } 
        else { 
            key=2;
        } 
        for(int i=0;i<items.size();i++){  
            if((items.get(i).get(key)).equals(ruleValue)){ 
                ans++;
            }
        } 
        return ans;
    }
}