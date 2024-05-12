class Solution {
    public boolean areOccurrencesEqual(String s) { 
        Map<Character,Integer> m = new HashMap<>(); 

        for(int i=0;i<s.length();i++){ 
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }  
        int a[]=new int[m.size()],ind=0;
        for(char x:m.keySet()){ 
            a[ind++]=m.get(x);
        }

        for(int i=0;i<a.length-1;i++){ 
            if(a[i]!=a[i+1]){ 
                return false;
            }
        } 
        return true;
    }
}