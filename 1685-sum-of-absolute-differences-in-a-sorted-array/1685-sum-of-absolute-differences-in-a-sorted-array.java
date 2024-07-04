class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int a[] = new int[nums.length];  
         
        int j=nums.length; 
        for(int i=0;i<nums.length;i++){  
             a[i] = Math.abs((left(nums,i,0)-(nums[i]*lflag(nums,i,0)))) + Math.abs( (right(nums,i,0)-(nums[i]*rflag(nums,i,0))));
        } 
        return a;
    } 
    static int left(int a[],int i,int sum){ 
        if(i==0){ 
           return sum;
        }  
        sum = sum + a[i-1];
        return left(a,--i,sum);
    } 

     static int right(int a[],int i,int sum){ 
        if(i==a.length){ 
           return sum;
        }  
        sum = sum + a[i];
       return right(a,++i,sum);
    } 

     static int lflag(int a[],int i,int f){ 
        if(i==0){ 
           return f;
        }  
        return lflag(a,--i,++f);
    }  

     static int rflag(int a[],int i,int f){ 
        if(i==a.length){ 
           return f;
        }  
        return rflag(a,++i,++f);
    } 
}