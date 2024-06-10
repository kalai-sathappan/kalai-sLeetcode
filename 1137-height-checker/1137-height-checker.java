class Solution {
    public int heightChecker(int[] heights) {
        int a[]=new int[heights.length];  
        for(int i=0;i<a.length;i++){ 
            a[i]=heights[i];
        } 
        Arrays.sort(a); 
        return check(heights,a,0,0);

    } 
    static int check(int a[],int b[],int ind,int res){ 
        if(ind==a.length){ 
            return res;
        } 
        return (a[ind]==b[ind])?check(a,b,++ind,res):check(a,b,++ind,++res);
    }
}