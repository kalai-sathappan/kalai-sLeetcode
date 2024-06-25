class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int adj [][] = new int[n][n]; 
        int vis[] = new int[n]; 
        vis[source] = 1;
        for(int i=0;i<edges.length;i++){ 
            adj[edges[i][0]][edges[i][1]] = 1; 
            adj[edges[i][1]][edges[i][0]] = 1; 
        }    
        Queue<Integer> q = new LinkedList<>(); 
        for(int i=0;i<n;i++){ 
            if(adj[source][i]==1){ 
                q.add(i); 
                vis[i] = 1;
            }
        }
        while(q.size()>0){  
            int x = q.poll();  
            for(int i=0;i<n;i++){ 
                if(adj[x][i]==1 && vis[i]!=1){ 
                    q.add(i); 
                    vis[i] = 1;
                }
            }
        } 
        return vis[destination]==1;


    }
}