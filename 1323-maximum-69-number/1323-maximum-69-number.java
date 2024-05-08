class Solution {
    public int maximum69Number (int num) {
       Stack<Integer>s=new Stack<>(); 
       while(num>0)
       { 
        int r=num%10; 
        s.push(r); 
        num = num /10;
       }  
       int ans=0;  
       boolean a=false; 
       while(!s.isEmpty()){  
        if(s.peek()==9 || a){
        ans = ans * 10 + s.pop(); 
        } 
        else{
            ans = ans * 10 + 9;  
            a=true;
            s.pop();
        }
       }
     
    return ans; 
    }
}