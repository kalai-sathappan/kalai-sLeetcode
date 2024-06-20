class Solution {
    public int[] minOperations(String box) { 
        List<Integer> l = new ArrayList<>(); 
        for(int i=0;i<box.length();i++){ 
            if(box.charAt(i)=='1'){ 
                l.add(i);
            }
        } 
        int a[]=new int[box.length()];
        for(int i=0;i<box.length();i++){  
            int sum = 0;
            //if(box.charAt(i)=='0'){ 
                for(int j:l){ 
                    sum += Math.abs(i-j);
                }
            //} 
            //else{ 
                //for(int k:l){ 
                //    sum += Math.abs(i-k);
              //  }
            //} 
            a[i]=sum;
        } 
        return a;
    }
}