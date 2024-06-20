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
            a[i]=add(i,l);
        } 
        return a;
    } 
    static int add(int i,List<Integer> l){  
        int sum=0; 
        for(int j:l){ 
                  sum += Math.abs(i-(j));
        }
        return sum;
    }
}