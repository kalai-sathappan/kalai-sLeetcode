class Solution {
    public int countBalls(int lowLimit, int highLimit) { 
        int n=highLimit-lowLimit+1; 
        Map<Integer,Integer>m=new HashMap<>();  
        int a[]=new int[n]; 
        int k=0;
        for(int i=lowLimit;i<=highLimit;i++){  
            int j=i; 
            int s=0;
            while(j>0){ 
                int r=j%10; 
                s=s+r; 
                j=j/10;
            } 
          m.put(s,m.getOrDefault(s,0)+1);
        }  
        int max=0;
        for(int i:m.values()){ 
            if(i>max){ 
                max=i;
            }
        } 
        return max;
        }
}