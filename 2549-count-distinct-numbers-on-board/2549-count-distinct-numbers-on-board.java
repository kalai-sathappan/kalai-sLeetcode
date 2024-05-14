class Solution {
    public int distinctIntegers(int n) { 
        if(n==1){ 
            return 1;
        }
        Set<Integer> s = new HashSet<>(); 
        for(int i=n;i>0;i--){ 
            for(int j=n;j>0;j--){ 
                if(i%j==1){ 
                    s.add(j);
                }
            }
        } 
        return s.size();
    }
}