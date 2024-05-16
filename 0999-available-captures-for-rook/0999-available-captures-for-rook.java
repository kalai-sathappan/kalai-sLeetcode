class Solution {
    public int numRookCaptures(char[][] board) {
        int r = -1 ,c =-1,ans=0;

        for(int i=0;i<board.length;i++){ 
            for(int j=0;j<board[0].length;j++){ 
                if(board[i][j]=='R'){ 
                    r = i; 
                    c = j; 
                    break;
                }
            } 
            if(c>=0){ 
                break;
            }
        } 
        for(int i = c;i>=0;i--){ 
            if(board[r][i]=='B'){ 
                break;
            } 
            else if(board[r][i]=='p'){ 
                ans++; 
                break;
            }
         } 
        for(int i = c;i<board[0].length;i++){ 
            if(board[r][i]=='B'){ 
                break;
            } 
            else if(board[r][i]=='p'){ 
                ans++; 
                break;
            }
         }  

         for(int i = r;i>=0;i--){ 
            if(board[i][c]=='B'){ 
                break;
            } 
            else if(board[i][c]=='p'){ 
                ans++; 
                break;
            }
         }  

         for(int i = r;i<board.length;i++){ 
            if(board[i][c]=='B'){ 
                break;
            } 
            else if(board[i][c]=='p'){ 
                ans++; 
                break;
            }
         } 

         return ans; 

        
    }
}